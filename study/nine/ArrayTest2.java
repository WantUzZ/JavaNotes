package study.nine;

import java.util.*;
import study.nine.Student;

public class ArrayTest2 {
  public static void main(String[] a) {
    ArrayList<Student> list = new ArrayList();

    list.add(new Student("want", 25));
    list.add(new Student("zmm", 26));
    list.add(new Student("gcy", 27));

    for(Student s: list) {
      System.out.println(s.toString());
    }
  }
}