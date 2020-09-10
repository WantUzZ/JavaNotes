
import java.util.*;
import java.util.stream.Stream;

public class StreamTest1 {
  public static void main(String[] args) {
    // 流的创建
    // 数组形式
    // Stream<String> s = Stream.of(new String[] {"want", "gcy", "zmc", "oppo" });
    // long count = s.filter( i -> i.length() > 3).count();
    // System.out.println(count);

    // 
    Integer[] arr = new Integer[] {2,3,1,1,6};
    Stream<Integer> s2 = Arrays.stream(arr, 1, 4);
    long count2 = s2.filter(i -> i > 3).count(); 
    System.out.println(count2);
  }
}