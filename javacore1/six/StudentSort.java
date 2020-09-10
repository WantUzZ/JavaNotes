import java.util.*;

public class StudentSort {
  public static void main(String[] args) {

    1、测试排序 
    Student[] students = new Student[3];
    students[0] = new Student("zm", 26);
    students[1] = new Student("want", 25);
    students[2] = new Student("gcy", 28);

    Arrays.sort(students);
    for(Student s : students) {
      System.out.println(s.getName() + s.getAge());
    }
  
  }
}