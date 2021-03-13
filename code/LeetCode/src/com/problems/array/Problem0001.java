package com.problems.array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @description:
 * @author: @Obsession
 * <p>
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 *   你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *   你可以按任意顺序返回答案。
 */
public class Problem0001 {
    public static void main(String[] args) {
        int[] nums={1,3,5,7,9};
        System.out.println(Arrays.toString(twoSum(nums, 14)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashTable = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if(hashTable.containsKey(target-nums[i])){
                return new int[]{hashTable.get(target-nums[i]),i};
            }
            hashTable.put(nums[i],i);
        }
        return new int[0];

    }
}
