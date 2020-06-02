package com.amazon.arrays;

/**
 * Given nums = [0,0,1,1,1,2,2,3,3,4],
 *
 * Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
 *
 * It doesn't matter what values are set beyond the returned length. *
 *
 * **/

public class RemoveDuplicates {
  public int removeDuplicates(int[] nums) {
    int index =0;
    int i =0;
    while(i < nums.length) {
      int j=i;
      while (j< nums.length && nums[i] == nums[j]) {
        j++;
      }

      nums[index++] = nums[i];
      i =j;

    }
    return index;

  }
}
