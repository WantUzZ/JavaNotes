import java.util.*;

public class PersonLambdaSort {
  public static void main(String[] args){
    Person[] persons = new Person[3];
    persons[0] = new Person("zm", 26);
    persons[1] = new Person("want", 25);
    persons[2] = new Person("gcy", 28);

    Arrays.sort(persons, (Person first, Person second) -> { return first.getName().length() - second.getName().length(); });

    for(Person p : persons) {
      System.out.println(p.getName() + "==" + p.getAge());
    }
  }
}
