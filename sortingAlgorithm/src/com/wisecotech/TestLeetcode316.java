package com.wisecotech;

import java.util.Arrays;

public class TestLeetcode316 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums1 = { 1, 1, 2};

        System.out.println(solution(nums));
    }


    //去除有顺序的数字
    public static int solution(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        int num_present,count=0;

        for (int i = 1; i <nums.length ; i++) {
            num_present = nums[i];
            if (num_present == nums[i - 1]) {
                continue;
            } else {
                count++;
                nums[count]=num_present;
            }
            System.out.println(Arrays.toString(nums));
        }
        return count +1;
    }
}
