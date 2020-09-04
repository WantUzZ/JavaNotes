package study.nine;

public class Student {
  private String name;
  private int sno;

  public Student() {}

  public Student(String name, int sno) {
    this.name = name;
    this.sno = sno;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public String getName() {
    return this.name;
  }

  public int getSno() {
    return this.sno;
  }

  public String toString() {
    return "" + this.name + this.sno;
  }
}