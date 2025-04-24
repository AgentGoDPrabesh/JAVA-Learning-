// Thread--> Single unit of task
  //Java.lang.Thread (class)-> small project
  //java.lang.runable()-> large project (decoupling , loose coupling)

import java.lang.Thread;
class InnerMyThreadclass extends Thread {
  public void run(){
    for (int i = 1; i<=5; i++){
    System.out.println("Thread:" + i);
  }
 } 
}

public class MyThreadExample {
  public static void main(String[] args) {
    InnerMyThreadclass t1 = new InnerMyThreadclass();
    t1.start();
  }
}
