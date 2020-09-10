package study.nine;

import java.util.*;
 
public class ArrayTest1 {
  public static void main(String[] a) {
   LinkedList<Integer> list = new LinkedList();

   list.add(1);
   list.add(2);
   list.add(3);
   ListIterator li = list.listIterator();
   li.next();// 1 [*] 2 3
   li.add(4); // 1 4 [*] 2 3
   li.previous(); //1 [*] 4 2 3 previous方法会将右侧的元素删除掉，也不能调用两次remove方法
   li.remove(); // 1 [*] 2 3
   li.add(5); // 1 5 [*] 2 3
  

   for(int item : list) {
     System.out.println(item);
   }
  //  1 5 2 3
  }
}