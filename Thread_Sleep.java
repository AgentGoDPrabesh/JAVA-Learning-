public class Thread_Sleep {

  public static void main(String[] args) {
      // First Thread
      Thread firstThread = new Thread(() -> {
          try {
              for (int i = 1; i <= 3; i++) {
                  System.out.println("First Thread - Count: " + i);
                  Thread.sleep(500); // Sleep for 500 milliseconds
              }
          } catch (Exception e) {
              e.printStackTrace();
          }
      });

      //    second thread
      Thread secondThread = new Thread(() -> {
          try {
              for (int i = 1; i <= 3; i++) {
                  System.out.println("First Thread - Count: " + i);
                  Thread.sleep(1000); // Sleep for 500 milliseconds
              }
          } catch (Exception e) {
              e.printStackTrace();
          }
      });
      firstThread.start();
      secondThread.start();
  }
}