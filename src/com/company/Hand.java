package com.company;

import java.util.*;

public class Hand {
    private int myID;
    private Map<MJ, Integer> inHand;

    public Hand(int id){
        myID = id;
        inHand = new HashMap<>();
    }

    public void add(MJ mj){
        if(inHand.containsKey(mj))
            inHand.put(mj, inHand.get(mj)+1);
        else
            inHand.put(mj, 1);
    }

    public void check(MJ mj){

    }

    public void setMyID(int myID) {
        this.myID = myID;
    }

    public int getMyID() {
        return myID;
    }
}
