
public class MemoryCell {
  private Object storedValue;
  
  public Object read() {
    return storedValue;
  }
  
  public void write(Object obj) {
    this.storedValue = obj;
  }
}
