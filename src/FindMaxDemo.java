
public class FindMaxDemo {
  public static Comparable findMax(Comparable[] arr) {
    int maxIndex = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].compareTo(arr[maxIndex]) > 0) {
        maxIndex = i;
      }
    }
    return arr[maxIndex];
  }
  
  public static void main(String[] args) {
    String[] strs = {
        "Joe",
        "Bob",
        "Bill",
        "Zoke"
    };
    System.out.println(findMax(strs));
//    String maxStr = (String)findMax(strs);
//    System.out.println(maxStr);
  }
}
