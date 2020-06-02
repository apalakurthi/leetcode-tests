package com.amazon.arrays;

public class MoveZeros {

  /**
   * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
   *
   * Example:
   *
   * Input: [0,1,0,3,12]
   * Output: [1,3,12,0,0]
   * Note:
   *
   * You must do this in-place without making a copy of the array.
   * Minimize the total number of operations.
   *
   * **/

  public int[] moveZeroes(int[] nums) {
    int index =0;
    int[] result = new int[nums.length];
    for (int i =0; i < nums.length; i++) {
      if (nums[i] != 0) {
        result[index++] = nums[i];
      }
    }

    for (int i =0; i<nums.length; i++) {
      nums[i] = result[i];
    }
    return result;
  }

  /**
   * using two pointers.
   * */
  public int[] moveZeroes1(int[] nums) {
    int j =0;
    for (int i =0; i < nums.length; i++) {
      if (nums[i] != 0 && nums[j]==0) {
        swap(nums, i, j);
      }

      if (nums[j] != 0) {
        j++;
      }
    }
    return nums;
  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[j];
    nums[j] = nums[i];
    nums[i] = temp;
  }

}
