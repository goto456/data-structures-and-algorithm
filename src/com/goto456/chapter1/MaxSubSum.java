package com.goto456.chapter1;

public class MaxSubSum {
  public static int  maxSubSum1(int[] a) {
    int maxSum = 0;
    
    for (int i = 0; i < a.length; i++) {
      for (int j = i; j < a.length; j++) {
        int thisSum = 0;
        for (int k = i; k <= j; k++) {
          thisSum += a[k];
        }
        if (thisSum > maxSum) {
          maxSum = thisSum;
        }
      }
    }
    return maxSum;
  }
  
  public static int maxSubSum2(int[] a) {
    int maxSum = 0;
    for (int i = 0; i < a.length; i++) {
      int thisSum = 0;
      for (int j = i; j < a.length; j++) {
        thisSum += a[j];
        if (thisSum > maxSum) {
          maxSum = thisSum;
        }
      }
    }
    return maxSum;
  }
  
  public static void main(String[] args) {
    int[] a = {-2, 11, -4, 13, -5, -2};
    //int maxSum = maxSubSum1(a);
    int maxSum = maxSubSum2(a);
    System.out.println(maxSum);
  }
}
