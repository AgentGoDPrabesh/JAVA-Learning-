public class DeadlockExample {
  private static final Object resource1 = new Object();
  private static final Object resource2 = new Object();

  public static void main(String[] args) {
      // Thread 1 (task 1)
      Thread t1 = new Thread(() -> {
          synchronized (resource1) {
              System.out.println("Thread 1 is using resource 1");

              try {
                  Thread.sleep(100);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }

              synchronized (resource2) {
                  System.out.println("Thread 1 is using resource 2");
              }
          }
      });
        // thread 2 (task 2)3e4r44d
      Thread t2 = new Thread(() -> {
          synchronized (resource1) {
              System.out.println("Thread 2 is using resource 1");

              try {
                  Thread.sleep(100);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }

              synchronized (resource2) {
                  System.out.println("Thread 2 is using resource 2");
              }
          }
      });

      // Start 
      t1.start();
      t2.start();
  }
}