
public class WrapperDemo {
  public static void main(String[] args) {
    MemoryCell m = new MemoryCell();
    m.write(new Integer(38));
    Integer integer = (Integer)m.read();
    int i = integer.intValue();
    //System.out.println(integer);
    System.out.println(i);
  }
}
