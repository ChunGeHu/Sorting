package com.wisecotech.StackAndPriority;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class me {


    public static void main(String[] args) {
        String str = "7+6/2-10";
        int index = 0;//用于扫描
        List<String> list = new ArrayList();
        Stack<Integer> sta = new Stack();
        Stack<String> staOper = new Stack();
        deal de = new deal();
        char item = ' ';

        String[] strArray = str.split("");

//        for(String i:strArray){
        while (true) {
            item = str.substring(index, index + 1).charAt(0);

            if (de.IsNumber(item)) {
                sta.push(item - '0');
            }
            if (de.IsSign(item)) {
                if (!staOper.isEmpty()) {
                    //显示符号
                    if (de.priority(item) <= de.priority(staOper.peek().charAt(0))) {
                        int num2 = sta.pop();
                        int num1 = sta.pop();
                        int op = staOper.pop().charAt(0);
                        int res = de.cal(num1, num2, op);
                        sta.push(res);
                        staOper.push(String.valueOf(item));
                    } else {
                        staOper.push(String.valueOf(item));
                    }
                } else {
                    staOper.push(String.valueOf(item));
                }
            }
            index++;
            if (index >= str.length()) {

                break;
            }
        }
        //输出
        while (true) {
            if (staOper.isEmpty()) {

                break;
            }
            int num2 = sta.pop();
            int num1 = sta.pop();
            int op = staOper.pop().charAt(0);
            int res = de.cal(num1, num2, op);
            sta.push(res);//入栈
        }
        System.out.println(sta.pop());
    }
}

class deal {
    boolean IsSign(char x) {
        return x == '+' || x == '-' || x == '*' || x == '/';
    }

    boolean IsNumber(char x) {
        return x >= 48 && x <= 57;
    }

    int priority(int oper) {
        if (oper == '*' || oper == '/') {

            return 1;
        } else if (oper == '+' || oper == '-') {
            return 0;
        } else {
            return -1;
        }

    }

    int cal(int num1, int num2, int oper) {
        switch (oper) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                return 0;
        }
    }
}






