class firstThread extends Thread{
  public void run(){
      System.out.println(
          getName() + " (Priority: " + getPriority() + ") is runnnign" 
      );
  }
}
class secondThread extends Thread{
  public void run(){
      System.out.println(
          getName() + " (Priority: " + getPriority() + ") is runnnign" 
      );
  }
}


public class Thread_priority {
  public static void main(String[] args) {
   // create instances of threads 
      FirstThread firstThread = new FirstThread();
      SecondThread secondThread = new SecondThread();
      
    
      firstThread.setPriority(Thread.MIN_PRIORITY);
      secondThread.setPriority(Thread.MAX_PRIORITY);
      
      try{
        firstThread.join();
        secondThread.join();
      } catch(Exception.e){
        e.printStackTrace();
      }

      System.out.println("all the thread execute completed");
  }
}