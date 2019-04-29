package com.company.TestingClass;

import com.company.Hand;
import com.company.MJ;

public class TestHand {
    public static void main(String[] args) {
        //Map<MJ, Integer> testMap = new HashMap<>();
        Hand testHand = new Hand();

        for(int index = 0; index < 4; index++)
            testHand.add(new MJ( index,1, -1));

        if(testHand.contains(new MJ(0,1, -1))){
            System.out.println("Success testing contains");
        }else{
            System.out.println("Failed");
        }


    }

}
