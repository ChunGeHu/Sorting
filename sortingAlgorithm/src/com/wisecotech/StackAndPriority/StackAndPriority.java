package com.wisecotech.StackAndPriority;

import java.util.Scanner;
import java.util.Stack;

public class StackAndPriority {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(Calculate(s));
    }

    //利用栈的思想进行计算机的书写：
    // 当然对于JavaScript,z直接将字符串使用 eval()函数即可解决所有问题，
    // 如不使用eval()函数，就需要使用栈的思想解决。
    public static float Calculate(String calculateString) {
        //定义一个操作数的栈OVS和操作符的栈OPS；
        Stack<Float> OVS = new Stack<>();
        Stack<Character> OPS = new Stack<>();

        //定义一个
        int t = 0, i = 0;
        float x = 0, y, z;
        char w, w_top, w_normal;
        OPS.push(';');

        char[] chars = calculateString.toCharArray();
        w = chars[i];
//        while (t == 0) {
        //读入操作数字；
        //计算整数部分：
        if (w > '0' && w < '9') {
            x = 0;
            while (chars[i] >= 48 && chars[i] <= 57) {
                x = x * 10 + chars[i] - 48;
                i++;
            }
            //计算小数部分；
            if (chars[i] == '.') {
                i++;
                y = 0;
                z = 10;
                while (chars[i] >= 48 && chars[i] <= 57) {
                    y = y + chars[i] - 48 / z;
                    i++;
                    z = z * 10;
                }
                //形成完整的操作数：
                x = x + y;
            }
            OVS.push(x);
            w = chars[++i];
        }
//        }


        return x;
    }
}
