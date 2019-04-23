package com.company;

public class MJ {
    private int num;
    // -1 for Wan, 0 for Tong, 1 for Tiao
    private int color;
    private final String prefix = "/Users/ywan/MJmstr/src/com/company/pics/";
    private String fileName = prefix;

    public MJ(int num, int color){
        this.color = color;
        this.num = num;
        fileName += Integer.toString(num);
        switch (color){
            case -1:
                fileName += "w";
                break;
            case 0:
                fileName += "t";
                break;
            case 1:
                fileName += "i";
                break;
        }
        fileName += ".png";
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

    public void setFileName(String img) {
        this.fileName = prefix + img;
    }

    public String getFileName() {
//        System.out.println(fileName);
        return fileName;
    }

}
