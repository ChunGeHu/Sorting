package com.wisecotech;

import java.util.Arrays;

/**
 * @author wiseco
 */
public class ShellSort {


    public static void main(String[] args) {
        int[] array = {2, 3, 1, 6, 12, 33, 23, 11, 67, 99, 0, -1};
        System.out.println(Arrays.toString(ShellInsertSort(array)));
    }

    public static int[] ShellInsertSort(int[] array) {
        if (array.length == 0 || array.length == 1) {
            return array;
        }
        //思想就是，将所有的数据先进行分组
        //先设置每组之间的间隔gap,
        int interval = array.length / 2;
        int current;
        while (interval > 0) {
            for (int i = interval; i < array.length; i++) {
                for (int j = i - interval; j > 0; j -= interval) {

                }

            }
        }
        for (int i = 0; i < array.length - 1; i++) {
            int WaitInsertNum = array[i + 1];
            int Index = i;
            // 这里主要是找到该插入的地方
            while (Index >= 0 && WaitInsertNum < array[Index]) {
                array[Index + 1] = array[Index];
                Index--;
            }
            // 最后将原来 i+1 位置的元素放入现在 0 到 i+1 之间数组中正确的位置上
            // pre+1 是因为刚才循环结束时又自减了一次
            array[Index + 1] = WaitInsertNum;
            System.out.println(Arrays.toString(array));
        }
        return array;
    }
}
