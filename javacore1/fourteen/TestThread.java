public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> {
          int i = 1;
          while (i < 5) {
              System.out.println(i++);
              try {
                  Thread.sleep(500);
              } catch (InterruptedException e) {
                  System.out.println("interrupt");
              }
          }
            System.out.println("out");
        };

        Thread t = new Thread(r);
        t.start();

        Thread.sleep(2 * 400);
        t.interrupt();
    }
}