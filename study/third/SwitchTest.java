import java.util.*;

public class SwitchTest {
  public static void main(String[] a) {
    Scanner sc = new Scanner(System.in);
    String choose = sc.nextLine();

    // case 后面跟的类型： char byte short int 
    // JavaSE7之后支持字符串字面量 
    switch(choose) {
      case "好": 
        System.out.println("你真棒");
        break;
      case "不好":
        System.out.println("OK");
        break;
    }

  }
}