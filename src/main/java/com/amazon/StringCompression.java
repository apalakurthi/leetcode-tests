package com.amazon;

public class StringCompression {

  public int compress(char[] input) {

    int index =0;
    int i=0;
    while (i < input.length) {

      int j= i;
      while (j< input.length && input[j] == input[i]) {
        j++;
      }
        input[index++] = input[i];
        if (j-i > 1) {
          String charLength = j-i +"";
          for(char c : charLength.toCharArray()) {
            input[index++] = c;
          }
        }

      i = j;
    }
    return index;
  }


}
