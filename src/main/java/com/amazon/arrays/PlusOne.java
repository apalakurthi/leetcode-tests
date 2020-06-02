package com.amazon.arrays;

public class PlusOne {

  public int[] plusOne(int[] input) {
    int[] result = new int[input.length];

    int carry = 0;

    for(int i =input.length-1; i>=0; i--) {
      int sum;

      if (i == input.length - 1) {
        sum = input[i] + 1;
        if (sum > 9) {
          result[i] = 0;
          carry = 1;
        } else {
          result[i] = sum;
        }
      } else {
        sum = input[i] + carry;
        if (sum > 9) {
          result[i] = 0;
          carry = 1;
        } else {
          result[i] = sum;
          carry = 0;
        }
      }
    }

    if (carry ==1) {
      int[] temp = new int[input.length+1];
      temp[0] = 1;
      for (int i=0; i<result.length; i++) {
        temp[i+1] = result[i];
      }
      return temp;
    }
    return result;

  }

}
