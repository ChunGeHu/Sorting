package com.wisecotech;

import java.util.Arrays;
import java.util.HashMap;

public class TestLeetcode1 {
    public static void main(String[] args) {
        int[] nums = {1, 12, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(Arrays.toString(twoSum2(nums, 9)));
        System.out.println(Arrays.toString(twoSum1(nums, 9)));
    }

    //匹配两数之和
    //完全是暴力解法，有问题，时间复杂度达到了n2；
    public static int[] twoSum1(int[] nums, int target) {
        int[] num = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (target == nums[i] + nums[j]) {
                        num[0] = i;
                        num[1] = j;
                        return num;
                    }
                }
            }
        }
        return num;
    }


    public static int[] twoSum2(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        //此题的妙处在于，对于两次循环的降维操作，由此可见，对于hashmap中键的查找，其复杂度为O(1);
        // 对于hashmap的底层结构掌握非常重要；
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("没有符合这个条件的两个常数！");
    }
}

