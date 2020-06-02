package com.amazon.arrays;
/**
 * Rotate Image
 * Solution
 * You are given an n x n 2D matrix representing an image.
 *
 * Rotate the image by 90 degrees (clockwise).
 *
 * Note:
 *
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 *
 * Example 1:
 *
 * Given input matrix =
 * [
 *   [1,2,3],
 *   [4,5,6],
 *   [7,8,9]
 * ],
 *
 * rotate the input matrix in-place such that it becomes:
 * [
 *   [7,4,1],
 *   [8,5,2],
 *   [9,6,3]
 * ]
 *
 **/
public class RotateImage {

  public int[][] rotate(int[][] req) {
    /**
     * First recursively flip the diagonal elements.
     * [
     *   [1,2,3],
     *   [4,5,6],
     *   [7,8,9]
     * ]
     *  flip 4 with 2
     *  flip 7 with 3
     *  flip 8 with 6
     *
     * will be
     * [
     *   [1,4,7],
     *   [2,5,8],
     *   [3,6,9]
     * ]
     * */
    for (int i=0; i < req.length; i++) {
      for (int j=i+1 ; j<req[i].length; j++) {
        int temp = req[i][j];
        req[i][j] = req[j][i];
        req[j][i] = temp;
      }
    }

    /**
     * flip the first column with last column
     * [
     *   [1,4,7],
     *   [2,5,8],
     *   [3,6,9]
     * ]
     *  flip 1 with 7
     *  flip 2 with 8
     *  flip 3 with 9
     *
     * will be
     * [
     *   [7,4,1],
     *   [8,5,2],
     *   [9,6,3]
     * ]
     * */

    for (int i=0; i < req.length; i++) {
      for (int j=0,k=req[i].length-1 ; j<k; j++, k--) {
        int temp = req[i][j];
        req[i][j] = req[i][k];
        req[i][k] = temp;
      }
    }
    return req;
  }
}
