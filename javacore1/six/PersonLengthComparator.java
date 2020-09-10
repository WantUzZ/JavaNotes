import java.util.*;

class PersonLengthComparator implements Comparator<Person> {
  public int compare(Person first, Person second) {
    return first.getName().length() - second.getName().length();
  }
}