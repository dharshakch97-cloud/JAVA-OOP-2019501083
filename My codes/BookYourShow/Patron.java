public class Patron {
    /**
     * @param args
     */
    private String name;
    private int mobileNum;
    public Patron() {
      this.name = name;
      this.mobileNum = mobileNum;
    }
    public Patron(String name, int mobileNum) {
      this.name = name;
      this.mobileNum = mobileNum;
    }
    public String getName() {
      return this.name;
    }
    public int getMobileNum() {
      return this.mobileNum;
    }
  
  public String toString() {
    String s;
    s = "-------------------" + "\n";
    s = s + "Name->" + name + "\n";
    s = s + "Mobile Number->" + mobileNum + "\n";
     return s;
  }
  }