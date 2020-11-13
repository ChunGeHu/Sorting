package com.wisecotechNewStart;

public class StudyEnum {
    public static void main(String[] args) {

        //使用ENUM最基本的功能；
        // 可以把相关的常量分组到一个枚举类型里，而且枚举提供了比常量更多的方法
        for (EnumCOLOR value : EnumCOLOR.values()) {
            System.out.println(value);
            System.out.println(value.ordinal());
            System.out.println(value.equals(EnumCOLOR.WHITE));
            System.out.println(value.getDeclaringClass());
            System.out.println(".......................");
        }
    }
}
