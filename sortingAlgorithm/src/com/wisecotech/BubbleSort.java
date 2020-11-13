package com.wisecotech;

/**
 * @author wiseco
 */
public class BubbleSort<bubbleSort2> {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 1, 2, 33, 23, 11, 67, 99};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        bubbleSort2(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    /**
     * 新手最容易想的冒泡排序，两个暴力的全循环，每循环一圈找到最小的与第一个交换，
     * 时间复杂度为妥妥的n2
     *
     * @param array
     * @return
     */
    public static int[] bubbleSort(int[] array) {
        int temp;
        if (array.length == 0 || array.length == 1) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;

                }
            }
        }
        return array;
    }

    /**
     * 这个是真正的冒泡排序，每一圈循环将所有的数字都跟相邻的捋一遍，
     * 整体的趋势就趋向于有序
     * 这种写法与书本的定义完全一致；
     * 时间复杂度为   n(n-1)/2
     * 比较的次数计算：(n-1)+(n-2)+(n-3)+...+2+1;
     * 最好的情况：已经有序，即需要n次比较，0次交换，
     * 一般情况和最坏情况都是交换的次数为n2/2
     * 冒泡排序是稳定的排序方法
     *
     * @param array
     * @return
     */
    public static int[] bubbleSort2(int[] array) {
        int temp = 0;
        if (array.length == 0 || array.length == 1) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j < i; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j - 1] = array[j];
                    array[j] = temp;

                }
            }
        }
        return array;
    }
}
