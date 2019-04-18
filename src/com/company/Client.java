package com.company;

public class Client {
    private MJTable mjTable;
    private int id;
    private String name;

    public Client(String userName){
        name = userName;
        mjTable = new MJTable(null, this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void start(){

    }
}
