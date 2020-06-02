package com.amazon;

import java.util.HashSet;
import java.util.Set;

public class RottenOranges {

  public int findTime(int[][] oranges) {

    Set<String> fresh = new HashSet<>();
    Set<String> rotten = new HashSet<>();

    for (int i =0; i<oranges.length; i++) {
      for (int j=0; j<oranges[i].length; j++) {
        if (oranges[i][j] == 2) {
          rotten.add(""+i+j);
        }

        if (oranges[i][j] == 1) {
          fresh.add(""+i+j);
        }
      }
    }

    int[][] directions = new int[][]{{0,1}, {0,-1}, {1,0}, {-1,0}};

    int minutes = 0;
    while (fresh.size() > 0) {
      Set<String> infected = new HashSet<>();
      for (String s : rotten) {
        int i = s.charAt(0) - '0';
        int j = s.charAt(1) - '0';

        for (int[] direction : directions) {
          int newI = i + direction[0];
          int newJ = j+ direction[1];

          if (fresh.contains(""+newI+newJ)) {
            fresh.remove(""+newI+newJ);
            infected.add(""+newI+newJ);
          }
        }
      }
      if (infected.isEmpty()) {
        return -1;
      }
      minutes ++;
      rotten = infected;
    }
    return minutes;
  }

}
