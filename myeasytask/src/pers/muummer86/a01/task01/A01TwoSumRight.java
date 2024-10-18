package pers.muummer86.a01.task01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class A01TwoSumRight {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(twoSum(nums, 5)));
    }


    /*
        作用:求数组内任意两数之和是否为特定数值;
        参数一:存有数据的数组;
        参数二:选中的特定数值
        返回值:如果达成题目条件则返回对应的两数下标,
                否则返回空;
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}
