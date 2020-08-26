/*
 * @Description: 【抽象类测试】人
 * @Version: v.1.0
 * @Author: want
 * @Date: 2020-08-24 14:22:08
 * @LastEditors: want
 */
public abstract class Person {
  private String name;

  public abstract String getDescription();

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String aName) {
    name = aName;
  }
}