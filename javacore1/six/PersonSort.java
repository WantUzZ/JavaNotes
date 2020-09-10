import java.util.*;

/**
  Comparator 是一个比较器接口，其不会侵入到具体的被比较的类中。
 */
public class PersonSort {
  public static void main(String[] args) {

    Person[] persons = new Person[3];
    persons[0] = new Person("zm", 26);
    persons[1] = new Person("want", 25);
    persons[2] = new Person("gcy", 28);

    Arrays.sort(persons, new PersonLengthComparator());

    for(Person p : persons) {
      System.out.println(p.getName() + "==" + p.getAge());
    }

  }
}