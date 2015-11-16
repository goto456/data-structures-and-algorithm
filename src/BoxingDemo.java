
public class BoxingDemo {
  public static void main(String[] args) {
    MemoryCell m = new MemoryCell();
    //MemoryCell<Integer> m = new MemoryCell<Integer>();
    m.write(37);
    int val = (int)m.read();
    System.out.println(val);
  }
}
