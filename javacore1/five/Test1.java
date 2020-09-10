/*
 * @Description: 【继承测试】 测试职员类和经理类工资结算
 * @Version: v.1.0
 * @Author: want
 * @Date: 2020-08-24 10:53:09
 * @LastEditors: want
 */

public class Test1 {
  public static void main(String[] args) {
    Manager m1 = new Manager("gcy", 10000000);
    m1.setBonus(100);
    int managerSalary = m1.getSalary();
    System.out.println(managerSalary);
  }
}