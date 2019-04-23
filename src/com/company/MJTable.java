package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class MJTable {
    int id;
    String name;
    Server server;
    Client client;
    boolean isServer;

    private Hand hand = new Hand();
    private Player leftP;
    private Player midP;
    private Player rightP;
    private Player myP;

    private MJ onTable;

    // GUI instances
    private JFrame guiFrame;
    private JPanel mainPanel;
    private JPanel playPanel;
    private JPanel centerTable;
    private JPanel bigMJ;
    private JPanel myHandPanel;
    private JPanel myOutPanel;
    private JPanel leftOutPanel;
    private JPanel midOutPanel;
    private JPanel rightOutPanel;
    private JPanel buttonPanel;
    private JButton huButton;
    private JButton pengButton;
    private JButton gangButton;
    private JButton guoButton;
    private JPanel logPanel;
    private JLabel logText;
    private JTextField logInput;
    private JButton logButton;


    public MJTable(Server server, Client client){
//        this.id = id;
//        this.name = userName;
        this.server = server;
        this.client = client;
        if(server == null){
            name = client.getName();
            isServer = false;
        }
        else{
            name = server.getName();
            isServer = true;
        }

        guiFrame = new JFrame();
        //make sure the program exits when the frame closes
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        if(!isServer)
            guiFrame.setTitle("M$TR MJ Client ---- " + name);
        else
            guiFrame.setTitle("M$TR MJ Server ---- " + name);


        guiFrame.setSize(1460,920);

        mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(1400, 900));
//        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        initializePlay();
        initializeLog();
        mainPanel.add(playPanel, BorderLayout.NORTH);
        mainPanel.add(logPanel, BorderLayout.SOUTH);
        guiFrame.add(mainPanel);

        if(isServer)
            setServerLog();
        else
            setClientLog();

        guiFrame.pack();
        guiFrame.setVisible(true);
    }

    private void initializePlay(){

        playPanel = new JPanel();
        playPanel.setLayout(null);
        playPanel.setPreferredSize(new Dimension(1400, 830));
        playPanel.setBackground(new Color(0, 100, 0));

        initializePanels();
        initializeButtons();
    }

    private void initializePanels(){
        bigMJ = new JPanel();
        playPanel.add(bigMJ);
        bigMJ.setLocation(615, 250);
//        bigMJ.setBackground(Color.black);
        bigMJ.setSize(150,200);
//        bigMJ.setBorder(BorderFactory.createLineBorder(Color.black));

        centerTable = new JPanel();
        playPanel.add(centerTable);
        centerTable.setLocation(350,130);
        centerTable.setSize(700, 500);

        myHandPanel = new JPanel();
        playPanel.add(myHandPanel);
        myHandPanel.setLocation(240, 680);
        myHandPanel.setSize(900, 80);

        myOutPanel = new JPanel();
        playPanel.add(myOutPanel);
        myOutPanel.setLocation(0,530);
        myOutPanel.setSize(200,300);

        leftOutPanel = new JPanel();
        playPanel.add(leftOutPanel);
        leftOutPanel.setLocation(0,130);
        leftOutPanel.setSize(200,300);

        midOutPanel = new JPanel();
        playPanel.add(midOutPanel);
        midOutPanel.setLocation(350,0);
        midOutPanel.setSize(700,50);

        rightOutPanel = new JPanel();
        playPanel.add(rightOutPanel);
        rightOutPanel.setLocation(1200,130);
        rightOutPanel.setSize(200,300);
    }

    private void initializeButtons(){
        huButton = new JButton("hu button");
        pengButton = new JButton("peng button");
        gangButton = new JButton("gang button");
        guoButton = new JButton("guo button");
        buttonPanel = new JPanel();
        buttonPanel.add(huButton);
        buttonPanel.add(pengButton);
        buttonPanel.add(gangButton);
        buttonPanel.add(guoButton);
        playPanel.add(buttonPanel);
        buttonPanel.setLocation(1200,600);
        buttonPanel.setSize(200,200);

    }

    private void initializeLog(){
        logPanel = new JPanel();
        logPanel.setPreferredSize(new Dimension(1400, 40));
        logPanel.setLayout(new BoxLayout(logPanel, BoxLayout.X_AXIS));
        logText = new JLabel("This is a text label");
        logInput = new JTextField("", 20);
        logButton = new JButton("Button");
        logPanel.add(logText);
        logPanel.add(logInput);
        logPanel.add(logButton);
    }

    private void setServerLog(){
        logText.setText("This is your host IP:");
        try{
            logInput.setText(GetIP.getPublicIP());
        }catch(Exception e){
            System.out.println("Invalid IP");
        }
        logButton.setText("Create Table");
    }

    private void setClientLog(){
        logText.setText("Enter the host's IP Address:");
        logButton.setText("Join Table");
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCenterMJ(MJ mj){
        try{
            BufferedImage myPicture = ImageIO.read(new File(mj.getFileName()));
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
//            JLabel picLabel = new JLabel("This is the pic label");
            bigMJ.add(picLabel);
//            bigMJ.add(new JButton("Test Button"));
        }catch(Exception e){
            System.out.println("Error loading MJ Image");
            System.exit(1);
        }

        guiFrame.pack();
//        bigMJ.setVisible(true);
    }

}
