package com.problems.array;

/**
 * @description:
 * @author: @Obsession
 * <p>
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
public class Problem0053 {
    public static void main(String[] args) {

    }

    public static int maxSubArray(int[] nums) {
        int ans = nums[0];
        int pre = 0;
        for (int num : nums) {
            if (pre > 0) {
                pre = pre + num;
            } else {
                pre = num;
            }
            ans = Math.max(ans, pre);
        }
        return ans;
    }

}
