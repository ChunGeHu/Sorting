package com.wisecotechNewStart;

public enum Season implements  Behavior{
    SPRING("春天", 1),
    SUMMER("夏季",2),
    AUTUMN("秋季", 3),
    WINTER("冬季",4);


    private String name;
    private int index;

    //构造方法：
    Season(String name, int index) {
        this.name = name;
        this.index = index;
    }


    @Override
    public String getInfo() {
        return this.name + "  " + this.index;
    }

    @Override
    public int deegree() {
        return this.index *15;
    }
}
