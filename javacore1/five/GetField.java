/*
 * @Description: 运行时使用反射分析对象
 * @Version: v.1.0
 * @Author: want
 * @Date: 2020-08-26 10:13:25
 * @LastEditors: want
 */

import java.util.*;
import java.lang.reflect.*;

public class GetField {
  public static void main(String[] args) {
    Employee p = new Employee("want", 100);
    Class cl = p.getClass();
    Field f = cl.getDeclaredField("name");
    f.setAccessible(true);
    Object v = f.get(p);
    // System.out.println(v);
  }
}
