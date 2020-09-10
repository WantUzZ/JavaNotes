/*
 * @Description:  【抽象类测试】 老师类
 * @Version: v.1.0
 * @Author: want
 * @Date: 2020-08-24 14:31:31
 * @LastEditors: want
 */

public class Teacher extends Person {
  private String course;

  public Teacher(String name, String course) {
    super(name);
    this.course = course;
  }

  public String getDescription(){
    return " is teach" + course;
  }
}