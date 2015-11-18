package com.goto456.chapter3;

public class ArrayProcess {
  public static void main(String[] args) {
    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i;
    }    

    int[] newArr = new int[arr.length * 2];
    for (int i = 0; i < arr.length; i++) {
      newArr[i] = arr[i];
    }
    arr = newArr;
    
    for (int item : newArr) {
      System.out.println(item);
    }
    //System.out.println(newArr[10]);
  }
}
