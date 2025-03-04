// package static_Example;

// public class outer {
//   static void sayhello(){
//   System.out.println("Hello");
//   }
//   static class Inner {
//  void displayInnerclasssDetails(){
//   System.out.println("This is inner class");
//  } 
// }
// public static void main(String[] args) {
//   outer.Inner obj = new outer.Inner();
//   obj.displayInnerclasssDetails();
// }
// }      



// Wihtout object

package static_Example;

public class outer {
  static void sayHello() {
    System.out.println("Hello");
  }

  static class Inner {
    static void displayInnerClassDetails() { // Made this method static
      System.out.println("This is inner class");
    }
  }

  public static void main(String[] args) {
    sayHello(); // Calling static method directly
    Inner.displayInnerClassDetails(); // Calling static method of Inner class without an object
  }
}
