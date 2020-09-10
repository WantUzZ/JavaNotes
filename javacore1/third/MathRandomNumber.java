import java.util.*;

public class MathRandomNumber{ 
  // 抽取数值的个数
  public static final int NUMBER_COUNT = 10;

  public static void main(String[] args){
    int[] initArr = new int[100];
    int[] fetchArr = new int[10];
    int fetchIndex = 0;
    int indexOfInitArr = 0;
    for(int i = 0 ; i < initArr.length; i++) {
      initArr[i] = i * 2;
    }

    System.out.println(Arrays.toString(initArr));

    while(fetchIndex < NUMBER_COUNT) {
      indexOfInitArr = (int)(Math.random() * initArr.length);
      System.out.println("获取到的数组下标为：" + indexOfInitArr);
      fetchArr[fetchIndex] = initArr[indexOfInitArr];
      fetchIndex++;
    }
    System.out.println(Arrays.toString(fetchArr));
  }
}