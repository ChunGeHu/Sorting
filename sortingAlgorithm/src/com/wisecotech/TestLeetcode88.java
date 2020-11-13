package com.wisecotech;


import java.util.Arrays;

//给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
public class TestLeetcode88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        System.out.println(Arrays.toString(merge3(nums1, m, nums2, n)));
    }

    // 暴力解法，先合并再快速查找，复杂度为快排产生的O((m+n)log(m+n));
    // 这是由于这种方法没有利用两个数组本身已经有序这一点。
    public static int[] merge1(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
        return nums1;
    }


    //方法二 : 双指针 / 从前往后
    public static int[] merge2(int[] nums1, int m, int[] nums2, int n) {
        //step1:现将num1的有效数值给复制出来：
        //该操作的时间复杂度为O(m);
        int[] num1_p = new int[m];
        System.arraycopy(nums1,0,num1_p,0,m);

        //step2:对其进行排序，从前往后，两个指针，分别放在num1_p、num2的首位
        int index1 = 0, index2 = 0;
        //index 是num的指针；
        int index = 0;
        /*while (index1 < m && index2 < n) {
            nums1[index++] = num1_p[index1] < nums2[index2] ? num1_p[index1++] : nums2[index2++];
        }*/

        while (index1 < m && index2 < n) {
            if (num1_p[index1] < nums2[index2]) {
                nums1[index] = num1_p[index1];
                index++;
                index1++;
            } else {
                nums1[index] = nums2[index2];
                index++;
                index2++;
            }
        }
        //这里还有一些极端情况，比如说两个数组中有一个的指针到达最后面时，就会出停止上面的判断；
        // 故需要对这两种极端情况做些处理；
        if (index1 < m) {
            System.arraycopy(num1_p, index1, nums1, index2 + index1, m + n - index1 - index2);
        }
        if (index2 < n) {
            System.arraycopy(nums2, index2, nums1, index2 + index1, m + n - index1 - index2);
        }
        return nums1;
    }

    //方法三，节省方法二中 所花的空间复杂度；
    public static int[] merge3(int[] nums1, int m, int[] nums2, int n) {
        //step1:从后往前移动，两个指针，放在num1最后一个数字上、num2的末尾位，num1的末尾位；
        int index1 = m-1, index2 = n-1,index = m+n-1;
        while (index1 >= 0 && index2 >= 0) {
            nums1[index--] = nums1[index1] > nums2[index2] ? nums1[index1--] : nums2[index2--];
        }
        System.arraycopy(nums2, 0, nums1, 0, index2 + 1);
        return nums1;
    }


}

