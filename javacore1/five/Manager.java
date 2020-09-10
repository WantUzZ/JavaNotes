/*
 * @Description: 【继承测试】经理类 经理 is a 职员
 * @Version: v.1.0
 * @Author: want
 * @Date: 2020-08-24 10:47:39
 * @LastEditors: want
 */

public class Manager extends Employee {
  private int bonus;

  public Manager(String name, int salary) {
    super(name, salary);
    bonus = 0;
  }

  public int getSalary() {
    int baseSalary = super.getSalary();
    return bonus + baseSalary;
  }

  public void setBonus(int newBonus){
    bonus = newBonus;
  }

}