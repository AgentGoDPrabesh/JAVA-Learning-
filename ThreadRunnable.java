class MyThreadRunnable{
  public void run(){
    for (int i= 1; i<=5; i++){
      System.out.println("Runnable Thread: " + i);
    }
 }
}


public class ThreadRunnable {
  public static void main(String[] args) {
    MyThreadRunnable t1 = new MyThreadRunnable();
    Thread t1 = new Runnable;
    t1.start();
  }
}
