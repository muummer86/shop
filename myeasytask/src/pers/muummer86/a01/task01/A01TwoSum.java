package pers.muummer86.a01.task01;

import java.util.Arrays;
import java.util.Scanner;

public class A01TwoSum {
    public static void main(String[] args) {
        //基本数据
        int[] nums = {1, 3, 5, 7, 9, 2, 4, 6, 8, 3, 2, 10, -1};

        //输入要求证的数target
        System.out.println("请输入数字");
        int target = new Scanner(System.in).nextInt();

        //为空则说明数组中没有任意两数满足选定数值
        int[] twoSumArr = twoSum(nums, target);
        if (twoSumArr == null) {
            System.out.println("没有结果");
        } else {
            System.out.println("数组nums[]中下标为" + Arrays.toString(twoSumArr) + "的两数,和为选定数值" + target);
        }

    }


    /*
           作用:求数组内任意两数之和是否为选定数值;
           参数一:存有数据的数组;
           参数二:选中的特定数值
           返回值:如果达成题目条件则返回对应的两数下标,
                   否则返回空;
        */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    //找到符合条件的元素则将其返回其下标
                    return new int[]{i, j};
                }
            }
        }
        //如果一直没找到则返回null
        return null;
    }
}
