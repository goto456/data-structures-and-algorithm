package com.goto456.chapter2;

public class MaxSubSum {
  //O(N^3)
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
  
  //O(N^2)
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
  
  private static int maxSumRec(int[] a, int left, int right) {
    if (left == right) {
      if (a[left] > 0) {
        return a[left];
      }
      else {
        return 0;
      }
    }
    
    int center = left + (right - left) / 2;
    int maxLeftSum = maxSumRec(a, left, center);
    int maxRightSum = maxSumRec(a, center + 1, right);
    
    int maxLeftBorderSum = 0;
    int leftBorderSum = 0;
    for (int i = center; i >= left; i--) {
      leftBorderSum += a[i];
      if (leftBorderSum > maxLeftBorderSum) {
        maxLeftBorderSum = leftBorderSum;
      }
    }
    
    int maxRightBorderSum = 0;
    int rightBorderSum = 0;
    for (int i = center + 1; i <= right; i++) {
      rightBorderSum += a[i];
      if (rightBorderSum > maxRightBorderSum) {
        maxRightBorderSum = rightBorderSum;
      }
    }
    
    if ((maxLeftBorderSum + maxRightBorderSum > maxLeftSum) 
        && (maxLeftBorderSum + maxRightBorderSum > maxRightSum)) {
      return maxLeftBorderSum + maxRightBorderSum;
    }
    else if (maxLeftSum >= maxRightSum) {
      return maxLeftSum;
    }
    else {
      return maxRightSum;
    }
  }
  
  //O(NlogN)
  public static int maxSubSum3(int[] a) {
    int maxSum = 0;
    maxSum = maxSumRec(a, 0, a.length - 1);
    return maxSum;
  }
  
  //O(N)
  public static int maxSubSum4(int[] a) {
    int maxSum = 0;
    int thisSum = 0;
    for (int i = 0; i < a.length; i++) {
      thisSum += a[i];
      if (thisSum > maxSum) {
        maxSum = thisSum;
      }
      if (thisSum < 0) {
        thisSum = 0;
      }
    }
    return maxSum;
  }
  
  public static void main(String[] args) {
    int[] a = {-2, 11, -4, 13, -5, -2};
    //int maxSum = maxSubSum1(a);
    //int maxSum = maxSubSum2(a);
    //int maxSum = maxSubSum3(a);
    int maxSum = maxSubSum4(a);
    System.out.println(maxSum);
  } 
}
