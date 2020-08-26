/*
 * @Description: int包装类测试 
    1. 两个Integer 变量比较，如果两个变量的值在区间-128到127 之间，则比较结果为true，如果两个变量的值不在此区间，则比较结果为 false。
    2. Integer 变量指向的是Java常量池中的对象，而new Integer指向的是堆内存中的对象，两者在内存中的地址不同。
 * @Version: v.1.0
 * @Author: want
 * @Date: 2020-08-24 12:00:04
 * @LastEditors: want
 */

public class IntegerTest {
  public static void main(String[] args) {
    Integer a = 12;
    Integer b = 12;
    System.out.println(a == b);
  }
}