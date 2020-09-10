//  StringBuilder 常用于较短的字符串构建
/**
StringBuffer 效率会比StringBuilder 高，但是后者允许采用多线程的方式执行添加或删除字符的操作
 */
public class StringBuildTest {
  public static void main(String[] a) {
    StringBuilder stringBuff = new StringBuilder();
    stringBuff.append("want");
    stringBuff.append(" hello world");

    String result = stringBuff.toString();
    System.out.println(result);
  }
}