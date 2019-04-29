package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Hand {

    private Queue<MJ> queue;

    public Hand(){
        queue = new PriorityQueue<>(new Comparator<MJ>() {
            @Override
            public int compare(MJ o1, MJ o2) {
                if(o1.getColor() < o2.getColor()){
                    return -1;
                }else if(o1.getColor() > o2.getColor()){
                    return 1;
                }else{
                    if(o1.getNum() < o2.getNum()){
                        return -1;
                    }else if(o1.getNum() > o2.getNum())
                        return 1;

                    return o1.getIndex() - o2.getIndex();

                }
            }
        });
    }

    public Queue<MJ> getQueue() {
        return queue;
    }

    public boolean add(MJ mj){
        return queue.add(mj);
    }

    public boolean remove(MJ mj){
        return queue.remove(mj);
    }

    public boolean contains(MJ mj){
        return queue.contains(mj);
    }
}
