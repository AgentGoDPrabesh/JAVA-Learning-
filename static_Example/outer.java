package static_Example;

// static Nested class 

public class outer {
  static void sayhello(){
  System.out.println("Hello");
  }
  static class Inner {
 void displayInnerclasssDetails(){
  System.out.println("This is inner class");
 } 
}
public static void main(String[] args) {
  outer.Inner obj = new outer.Inner();
  obj.displayInnerclasssDetails();
}
}      



