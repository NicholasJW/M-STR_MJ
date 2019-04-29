package com.company;

import java.util.*;

public class MapHand {
//    private int myID;
    private Map<MJ, Integer> inHand;
//    private PriorityQueue<MJ> inHand;

    public MapHand(){
//        myID = id;
        inHand = new HashMap<>();
    }

    public void add(MJ mj){
        if(inHand.containsKey(mj))
            inHand.put(mj, inHand.get(mj)+1);
        else
            inHand.put(mj, 1);
    }

    public void remove(MJ mj){
        if(!inHand.containsKey(mj)){
            System.out.println("Invalid MJ");
            System.exit(1);
        }

        if(inHand.get(mj) == 1){
            inHand.remove(mj);
        }else{
            inHand.put(mj, inHand.get(mj) - 1);
        }
    }

    public boolean contains(MJ mj){
        return inHand.containsKey(mj);
    }

    public void check(MJ mj){

    }

}
