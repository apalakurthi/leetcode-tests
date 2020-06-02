/*
package com.amazon.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

*/
/**
 * First Unique Character in a String
 * Solution
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 *
 * Examples:
 *
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 *
 * *//*

public class FirstUniqueCharInString {

  public int uniqueChar(String s) {
    Map<Character, Integer> map = new HashMap<>();

    SortedMap<String, Integer> map1 = new TreeMap<>();
    map1.put("test", 1);
    map1.put("abc", 2);

    for (int i = 0; i < s.length(); i++) {
      map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
    }

    for (int i = 0; i < s.length(); i++) {
      if (map.get(s.charAt(i)) == 1) {
        return i;
      }
    }

  }



}
*/
