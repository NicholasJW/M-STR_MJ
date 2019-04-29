package com.company.TestingClass;

import com.company.Hand;
import com.company.MJTable;
import com.company.Server;
import com.company.MJ;

public class TestMJTable {
    public static void main(String[] args) {

        //Test center MJ Panel
        MJTable t1 = new MJTable(new Server("test server"), null);
        MJ mj = new MJ(0,1, -1);

        t1.setCenterMJ(mj);
        try{
            Thread.sleep(2000);
        }catch(Exception e){

        }
        t1.clearCenterMJ();

        Hand testHand = new Hand();
        testHand.add(new MJ(0, 1, 1));
        testHand.add(new MJ(1, 1, 1));
        testHand.add(new MJ(0, 4, -1));
        testHand.add(new MJ(0, 7, 1));
        testHand.add(new MJ(0, 9, 0));
        testHand.add(new MJ(0, 3, 1));
        testHand.add(new MJ(0, 2, -1));
        testHand.add(new MJ(0, 2, 1));
        testHand.add(new MJ(2, 1, 1));
        testHand.add(new MJ(0, 5, 1));
        t1.setHand(testHand);
        t1.paintMyHand();

    }
}
