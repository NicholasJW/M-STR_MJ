package com.company;

public class MJ {
    private int num;
    // -1 for Wan, 0 for Tong, 1 for Tiao
    private int color;

    public MJ(int num, int color){
        this.color = color;
        this.num = num;
    }

    public int getColor() {
        return color;
    }

    public int getNum() {
        return num;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
