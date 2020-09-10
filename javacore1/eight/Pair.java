
// <T> 此处已经进行类型变量的声明
public class Pair<T> {
  private T first;
  private T second;

  public Pair() {} // 构造函数不要有函数的返回值类型

  public Pair(T first, T second) {
    this.first = first;
    this.second = second;
  }

  public T getFirst(){
    return first;
  }

  public T getSecond(){
    return second;
  }

  public void setFirst(T newValue) { this.first = newValue; } // 函数的返回值类型
  public void setSecond(T newValue) { this.second = newValue; }
}