package com.company;

import java.util.LinkedList;

public class Player {
    private int ID;
    private LinkedList<MJ> out;
    public LinkedList<MJ> peng;
    public LinkedList<MJ> gang;

    public Player(int id){
        ID = id;
        out = new LinkedList<>();
        peng = new LinkedList<>();
        gang = new LinkedList<>();
    }

    public void add(MJ newMJ){
        out.add(newMJ);
    }

    public MJ getTop(){
        return out.getLast();
    }

}
