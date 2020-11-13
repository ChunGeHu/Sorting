package com.wisecotechNewStart;

import static com.wisecotechNewStart.EnumCOLOR.WHITE;

public class start2 {
    EnumCOLOR color;
    public start2(EnumCOLOR color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "衣服的颜色是" + color;
    }

    // 可以直接调用enumerate中的数据；也就是静态调用；
    public static void main(String[] args) {
        // 可以直接调用enumerate中的数据；也就是静态调用；
        System.out.println(new start2(WHITE));
        System.out.println("。。。。。。。。。。。。。。。");
        //正常调用：
        System.out.println(new start2(EnumCOLOR.WHITE));
    }


}
