package com.wisecotech;

import java.util.Arrays;
import java.util.List;

/**
 * @author wiseco
 */
public class InsertSort {


    public static void main(String[] args) {
        int[] array = {2, 3, 1, 1, 2, 33, 23, 11, 67, 99, 0, -1};
        System.out.println(Arrays.toString(directInsertSort(array)));
    }

    public static int[] directInsertSort(int[] array) {
        if (array.length == 0 || array.length == 1) {
            return array;
        }
        //思想就是，每次将第i+1个元素插入到前i个元素中：
        //并在前i个元素中进行循环且正确插入，这里需要设置一个在前i个元素循环中的指针pointer；
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
