package program;

public class SaveScore implements RuleStorage {

  private int data;
  private boolean empty = true;
  
  public boolean empty() {
      return empty;
  }

  public int peek() throws Exception {
    if (empty) {
      throw new Exception("Internt fel : försöker avläsa utan att ha sparat"); // "Internal error : reading without having stored"
    }
    return data;
  }

  public void store(int result) throws Exception {
    if (!empty) {
      throw new Exception("Internt fel : försöker spara två gånger"); // "Internal error : storing twice"
    }
    data = result;
    empty = false;
  }
}
