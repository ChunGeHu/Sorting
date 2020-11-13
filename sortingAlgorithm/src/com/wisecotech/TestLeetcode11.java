package com.wisecotech;

import java.util.Arrays;

public class TestLeetcode11 {
    public static void main(String[] args) {
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution(nums));
    }


    //计算所乘的水量；
    /*public static int solution(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return 0;
        }
        int right = nums.length-1;
        int left = 0;
        int MaxArea = 0;
        while (true){
            int area = Math.min(nums[left], nums[right]) * (right - left);
            MaxArea = Math.max(MaxArea, area);
            if (nums[left] > nums[right]) {
                right--;
            } else {
                left++;
            }
            if (left >= right) {
                break;
            }
        }
        return MaxArea;
    }*/


    //计算所乘的水量；
    public static int solution(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return 0;
        }
        int right = nums.length-1;
        int left = 0;
        int MaxArea = 0;
        while (true){

            int area = Math.min(nums[left], nums[right]) * (right - left);
            MaxArea=area > MaxArea ?  area : MaxArea;

            if (nums[left] > nums[right]) {
                right--;
            } else {
                left++;
            }
            if (left >= right) {
                break;
            }
        }
        return MaxArea;
    }
}

