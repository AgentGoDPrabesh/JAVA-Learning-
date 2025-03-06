package static_Example;

// Non static Nested class / inner class

public class outeer {
  class Inner {
    void displayInnerClassDetails(){
      System.out.println("inside Non-static Nested (inner) class ");
    }
  }

  public static void main(String[] args) {
    outeer outeer = new outeer();
    outeer.Inner nonStaticObjectExample = outeer.new Inner();
    nonStaticObjectExample.displayInnerClassDetails();

  }
}
