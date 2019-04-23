package com.company.TestingClass;

import com.company.MJTable;
import com.company.Server;
import com.company.MJ;

public class TestMJTable {
    public static void main(String[] args) {

        //Test center MJ Panel
        MJTable t1 = new MJTable(new Server("test server"), null);
        MJ mj = new MJ(1, -1);

//        t1.setCenterMJ(mj);

    }
}
