
import java.util.*;

public class ScannerTest {
  public static void main(String[] args) {
    System.out.println("what is your name?");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    // sc.nextDouble()
    // sc.nextInt()
    System.out.println(name);
  }
}