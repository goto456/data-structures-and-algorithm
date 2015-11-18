package com.goto456.chapter2;

public class BinarySearch {
  public static int binarySearch(int[] a, int target) {
    int left = 0;
    int right = a.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (a[mid] == target) {
        return mid;
      }
      else if (a[mid] < target) {
        left = mid + 1;
      }
      else {
        right = mid - 1;
      }
    }
    return -1;
  }
  
  public  static void main(String[] args) {
    int[] a = {-1, 0, 3, 6, 7, 11, 15, 18, 23, 29, 31};
    int target = 7;
    int result = binarySearch(a, target);
    System.out.println(result);
  }
}
