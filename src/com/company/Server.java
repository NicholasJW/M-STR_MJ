package com.company;

public class Server {
    private MJTable mjTable;
    private String name;

    public Server(String userName){
        name = userName;
        mjTable = new MJTable(this, null);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void start(){

    }


}
