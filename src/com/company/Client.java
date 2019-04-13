package com.company;

public class Client {
    private MJTable mjTable;
    private int id;
    private String name;

    public Client(String userName){
        name = userName;
        mjTable = new MJTable(name, null, this);
    }

    public void start(){

    }
}
