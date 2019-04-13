package com.company;

public class Server {
    private MJRoom mjRoom;
    private String name;

    public Server(String userName){
        name = userName;
        mjRoom = new MJRoom(name,this, null);
    }

    public void start(){

    }


}
