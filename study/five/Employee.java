/*
 * @Description: 【继承测试】职员类
 * @Version: v.1.0
 * @Author: want
 * @Date: 2020-08-24 10:47:19
 * @LastEditors: want
 */
public class Employee {
  private String name;
  private int salary;

  public Employee (String name, int salary) {
    this.name = name;
    this.salary = salary;
  }

  public void setName(String newName) {
    name = newName;
  }

  public void setSalary(int newSalary) {
    salary = newSalary;
  }

  public String getName() {
    return name;
  }

   public int getSalary() {
    return salary;
  }

}