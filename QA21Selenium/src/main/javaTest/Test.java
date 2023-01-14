public class Test {
  private long id;
  private String name;
  protected String lastName;
  protected String password;


  public Test() {
    this.id = 0L;
    this.name = "";
  }

  public Test(String name) {
    this.name = name;
  }

  public Test(long id) {
    this.id = id;
  }

  public Test(long id, String name) {
    this.id = id;
    this.name = name;
  }


  public long getId() {
    return id;
  }

//  public void setId(long id) {
//    this.id = id;
//  }

  public String getName() {
    return "Test " + name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
