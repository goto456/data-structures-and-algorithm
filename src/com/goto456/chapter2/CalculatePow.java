package com.goto456.chapter2;

public class CalculatePow {
  public static long pow(long x, int n) {
    if (n == 1) {
      return x;
    }
    if (n % 2 == 0) {
      //return pow(x, n / 2) * pow(x, n / 2);
      return pow(x * x, n / 2);
    }
    else {
      //return pow(x, (n - 1) / 2) * pow(x, (n - 1) / 2) * x;
      return pow(x * x, (n - 1) / 2) * x;
    }
  }
  
  public static void main(String[] args) {
    //System.out.println("xxxxx");
    long x = 2;
    int n = 3;
    long result = pow(x, n);
    System.out.println(result);
  }
}
