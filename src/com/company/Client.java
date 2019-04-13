package com.company;

public class Client {
    private MJRoom mjRoom;
    private int id;
    private String name;

    public Client(String userName){
        name = userName;
        mjRoom = new MJRoom(name, null, this);
    }

    public void start(){

    }
}
