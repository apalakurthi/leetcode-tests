package com.amazon;

import java.util.HashMap;
import java.util.PriorityQueue;

public class ReOrganizeString {

  public String reOrganize(String s) {

    HashMap<Character, Integer>  chars = new HashMap<>();

    for (char c : s.toCharArray()) {
      chars.put(c, chars.getOrDefault(c, 0) +1);
    }

    PriorityQueue<Character> priorityQueue = new PriorityQueue<>((a, b) -> chars.get(b) - chars.get(a));
    priorityQueue.addAll(chars.keySet());

    StringBuilder sb = new StringBuilder();
    while(priorityQueue.size() > 1) {
      Character current = priorityQueue.remove();
      sb.append(current);
      Character next = priorityQueue.remove();
      sb.append(next);

      chars.put(current, chars.get(current)-1);
      chars.put(next, chars.get(next)-1);

      if (chars.get(current) > 0) {
        priorityQueue.add(current);
      }

      if (chars.get(next) > 0) {
        priorityQueue.add(next);
      }
    }

    if (!priorityQueue.isEmpty()) {
      Character lastChar = priorityQueue.remove();
      if (chars.get(lastChar) > 1) {
        return " ";
      }
      sb.append(lastChar);
    }

    return sb.toString();
  }

}
