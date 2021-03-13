package com.problems.array;

/**
 * @description:
 * @author: @Obsession
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 给定由若干 0 和 1 组成的数组 A。我们定义 N_i：从 A[0] 到 A[i] 的第 i 个子数组被解释为一个二进制数（从最高有效位到最低有效位）。
 * 返回布尔值列表 answer，只有当 N_i 可以被 5 整除时，答案 answer[i] 为 true，否则为 false。
 */
public class Problems1018 {
    public static void main(String[] args) {

    }

    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> answer = new ArrayList<>();
        int sum = 0;
        int length = A.length;
        for (int i = 0; i < length; i++) {
            sum = ((sum << 1) + A[i]) % 5;
            answer.add(sum == 0);
        }
        return answer;
    }
}
