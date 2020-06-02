package com.amazon.arrays;


import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * **/

public class TwoSum {
  /**
   * brute force approach
   * */
  public int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    for (int i=0; i< nums.length; i++) {
      for(int j=0; j<nums.length; j++) {
        if (i != j && nums[i]+nums[j] == target)  {
          result[0] = i;
          result[1] = j;
          return result;
        }
      }
    }
    return result;
  }

  public int[] twoSum1(int[] nums, int target) {
    int[] result = new int[2];
    for (int i=0; i< nums.length; i++) {
      int search = target - nums[i];
      for(int j=i+1; j<nums.length; j++) {
        if (nums[j] == search) {
          result[0] = i;
          result[1] = j;
          return result;
        }
      }
    }
    return result;
  }

  public int[] twoSum2(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[] { map.get(complement), i };
      }
      map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
  }
}
