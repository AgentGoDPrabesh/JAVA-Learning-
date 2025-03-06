
package static_Example;
public class outerdisplay {
  static void sayHello() {
    System.out.println("Hello");
  }
static class Inner {
  static void displayInnerClassDetails() { 
      System.out.println("This is inner class");
    }
  }
 public static void main(String[] args) {
  sayHello(); 
  Inner.displayInnerClassDetails(); 
  }
}
