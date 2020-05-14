package program;

class SaveScore implements RuleStorage {

  private int data;
  private boolean present;

  SaveScore() {
    present = false;
  }

  public int peek() throws Exception {
    if (!present) {
      throw new Exception("Internt fel : försöker avläsa utan att ha sparat"); // "Internal error : reading without having stored"
    }
    return data;
  }

  public void store(int result) throws Exception {
    if (present) {
      throw new Exception("Internt fel : försöker spara två gånger"); // "Internal error : storing twice"
    }
    data = result;
    present = true;
  }
}
