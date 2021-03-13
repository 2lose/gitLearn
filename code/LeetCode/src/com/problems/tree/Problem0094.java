package com.problems.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: @Obsession
 * <p>
 * 二叉树的中序遍历
 */
public class Problem0094 {
    public static void main(String[] args) {

    }

    ArrayList<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        //出口
        if(root == null){
            return list;
        }
        //左
        inorderTraversal(root.left);
        //根
        list.add(root.val);
        //右
        inorderTraversal(root.right);
        return list;
    }
}

