package com.goto456.chapter3;

import java.util.List;

public class ListProcess {
  public static void makeList1(List<Integer> list, int n) {
    list.clear();
    for (int i = 0; i < n; i++) {
      list.add(i);
    }
  }
  
  public static void makeList2(List<Integer> list, int n) {
    list.clear();
    for (int i = 0; i < n; i++) {
      list.add(0, i);
    }
  }
  
  public static int sum(List<Integer> list) {
    int total = 0;
    for (int i = 0; i < list.size(); i++) {
      total += list.get(i);
    }
    return total;
  }
}
