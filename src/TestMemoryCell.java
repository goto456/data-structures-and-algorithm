
public class TestMemoryCell {
  public static void main(String[] args) {
    MemoryCell memoryCell = new MemoryCell();
    memoryCell.write("37");
    String str = (String)memoryCell.read();
    System.out.println(str);
  }
}
