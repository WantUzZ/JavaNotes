import java.util.*;
/**
  数组拷贝。Array.copyOf()
 */
public class ArrayTest {
  public static void main(String[] args) {
    int[] ages = {1,2,3,4};
    // for(int age : ages) {
    //   System.out.println(age);
    // }
    // System.out.println(Arrays.toString(ages));
    int[] copyAges = Arrays.copyOf(ages, ages.length + 2);
    System.out.println(Arrays.toString(copyAges));
  }
}