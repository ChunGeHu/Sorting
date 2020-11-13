package com.wisecotech;

import java.util.Arrays;

public class TestLeetcode283 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(solution(nums)));
    }


    //移动零
    public static int[] solution(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
        return nums;
    }
}
