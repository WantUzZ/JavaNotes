import java.util.*;

public class PairTest {
  public static void main(String[] args) {
    String[] words = {"want", "gcy", "zmm"};
    Pair<String> mm = ArrayAlg.minmax(words);
    // System.out.println("====?");
    System.out.println(mm.getFirst());
    System.out.println(mm.getSecond());
  }
}

class ArrayAlg {
  public static Pair<String> minmax(String[] arr) {
    if(arr == null || arr.length == 0) return null;

    String min = arr[0];
    String max = arr[0];

    for(int i = 1; i < arr.length; i++) { 
      if(arr[i].compareTo(min) < 0) min = arr[i]; // 数组是arr
      if(arr[i].compareTo(max) > 0) max = arr[i];
    }

    return new Pair<>(min, max);
  }
}