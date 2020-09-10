/*
 * @Description: 【抽象类测试】 学生类
 * @Version: v.1.0
 * @Author: want
 * @Date: 2020-08-24 14:22:15
 * @LastEditors: want
 */

public class Student extends Person {
  private String major;

  public Student(String name, String major) {
    super(name);
    this.major = major;
  }

  public String getDescription() {
    // 一开始写成了： return name + "study" + major; 还是不理解自治。name 不是Teacher的属性。它是Person这个类的属性，所以访问不到。
    return  "study" + major; 
  }
}