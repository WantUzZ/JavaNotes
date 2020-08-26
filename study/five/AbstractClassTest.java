/*
 * @Description:  【抽象类测试】 下辖 People Employee
 * @Version: v.1.0
 * @Author: want
 * @Date: 2020-08-24 14:23:13
 * @LastEditors: want
 */

public class AbstractClassTest {
  public static void main(String[] args) {
    Person[] persons = new Person[2];
    persons[0] = new Student("want", "Java");
    persons[1] = new Teacher("zhou juan", "ACM");

    for(Person p : persons) {
      String name = p.getName();
      String desc = p.getDescription(); // 从代码上看调用了一个没有定义的方法，但是因为抽象类是不能构造对象，所以变量p永远不会引用Person对象，而是引用诸如Teacher、Student这样的子类对象。
      System.out.println(name + desc);
    }
  }
}