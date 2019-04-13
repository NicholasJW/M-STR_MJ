package com.company;

public class Server {
    private MJTable mjTable;
    private String name;

    public Server(String userName){
        name = userName;
        mjTable = new MJTable(name,this, null);
    }

    public void start(){

    }


}
