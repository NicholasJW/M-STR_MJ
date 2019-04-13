package com.company;

import javax.swing.*;
import java.awt.*;

public class MJRoom {
    int id;
    String name;
    Server server;
    Client client;
    boolean isServer;

    private Hand hand;
    private Player leftP;
    private Player midP;
    private Player rightP;
    private Player myP;

    private MJ onTable;


    // GUI instances
    private JFrame guiFrame;
    private JPanel mainPanel;

    private JPanel playPanel;

    private JPanel logPanel;
    private JLabel logText;
    private JTextField logInput;
    private JButton logButton;

    public MJRoom(String userName, Server server, Client client){
//        this.id = id;
        this.name = userName;
        this.server = server;
        this.client = client;
        if(server == null)
            isServer = false;
        else
            isServer = true;

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

        playPanel = new JPanel();
        playPanel.setPreferredSize(new Dimension(1400, 830));
        playPanel.setBackground(new Color(0, 100, 0));

        logPanel = new JPanel();
        logPanel.setPreferredSize(new Dimension(1400, 40));
        logPanel.setLayout(new BoxLayout(logPanel, BoxLayout.X_AXIS));
        logText = new JLabel("This is a text label");
        logInput = new JTextField("", 20);
        logButton = new JButton("Button");
        logPanel.add(logText);
        logPanel.add(logInput);
        logPanel.add(logButton);

        mainPanel.add(playPanel, BorderLayout.NORTH);
        mainPanel.add(logPanel, BorderLayout.SOUTH);
        guiFrame.add(mainPanel);

        if(isServer)
            setServerLog();
        else
            setClientLog();

        guiFrame.setVisible(true);
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

    
}
