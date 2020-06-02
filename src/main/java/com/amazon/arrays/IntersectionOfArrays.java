package com.amazon.arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Intersection of Two arrays II
 * Solution
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 *
 * **/
public class IntersectionOfArrays {

  public int[] getIntersection(int[] a, int[] b) {

    Arrays.sort(a);
    Arrays.sort(b);

    List<Integer> result = new ArrayList<>();
    int i=0; int j=0;
    while(i<a.length && j<b.length) {
      if (a[i] > b[j]) {
        j++;
      } else if (a[i]< b[j]){
        i++;
      } else {
        result.add(a[i]);
        i++;
        j++;
      }
    }


    return result.stream().mapToInt(k -> k).toArray();
  }

}
