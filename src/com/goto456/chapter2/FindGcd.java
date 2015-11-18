package com.goto456.chapter2;

public class FindGcd {
  public static long gcd1(long m, long n) {
    long max = m > n ? m : n;
    for (long i = max; i > 0; i--) {
      if (m % i == 0 && n % i == 0) {
        return i;
      }
    }
    return -1;
  }
  
  //辗转相除法：(m, n) = (n, m % n)
  public static long gcd2(long m, long n) {
    while (n != 0) {
      long rem = m % n;
      m = n;
      n = rem;
    }
    return m;
  }
  
  public static void main(String[] args) {
    long m = 1989;
    long n = 1590;    
    //long result = gcd1(m, n);
    long result = gcd2(m, n);
    System.out.println(result);
  }
}
