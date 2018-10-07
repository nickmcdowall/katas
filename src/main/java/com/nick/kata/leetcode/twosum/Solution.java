package com.nick.kata.leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> availableMatch = new HashMap<>();
        int currentIndex = 0;

        for (int num : nums) {
            Integer matchIndex = availableMatch.get(target - num);
            if (null != matchIndex) {
                return new int[]{matchIndex, currentIndex};
            }
            availableMatch.put(num, currentIndex++);
        }

        return null;
    }


}
