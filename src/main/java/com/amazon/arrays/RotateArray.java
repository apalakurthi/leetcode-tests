package com.amazon.arrays;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * Follow up:
 *
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]*
 *
 *
 * */

public class RotateArray {

  /**
   * using bruteforce approach
   * Time complexity : o(n)
   * space complexity : 0(1)
   *
   * */


  public int[] rotate1(int[] nums, int k) {

    int temp, previous;

    for (int i =0; i< k; i++) {
      previous = nums[nums.length-1];
      for (int j=0; j< nums.length; j++) {
        temp = nums[j];
        nums[j] = previous;
        previous = temp;
      }
    }

    return nums;
  }

  /**
   * using extra memory
   * Time complexity : o(n)
   * space complexity : 0(n)
   *
   * */


  public int[] rotate2(int[] nums, int k) {

    int temp[] = new int[nums.length];

    for (int i =0; i< nums.length; i++) {
      temp[(i+k)%nums.length] = nums[i];
    }

    for (int i =0; i< nums.length; i++) {
      nums[i] = temp[i];
    }
    return nums;
  }


  /**
   * reversing array
   * Time complexity : o(n)
   * space complexity : 0(n)
   *
   * */


  public int[] rotate3(int[] nums, int k) {
    reverse(nums, 0, nums.length-1);
    reverse(nums, 0, k-1);
    reverse(nums, k, nums.length-1);

    return nums;
  }

  private void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start ++;
      end--;
    }
  }

}
