package com.amazon.arrays;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 *
 *
 * */
public class SingleNumber {

  public int singleNumber(int[] nums) {

    if (nums.length > 1) {
      for (int i=0; i<nums.length; i++) {
        int count = 1;
        for (int j=0; j < nums.length; j++ ) {
          if (i != j && nums[i] == nums[j]) {
            count++;
          }
        }
        if (count == 1) {
          return nums[i];
        }
      }
    }
    return nums[0];
  }
}
