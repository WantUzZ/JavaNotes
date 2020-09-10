public class Student implements Comparable<Student> {
  private int age;
  private String name;

  public Student (String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName(){
    return name;
  }

  public int getAge(){
    return age;
  }

  public int compareTo(Student otherStudent) {
    return age > otherStudent.age ? -1 : 1;
  }
}