public class Exception_Example {
  public static void main(String[] args) {
      int a = 1;
      int b = 0;

      try {
          int result = a / b;
          System.out.println("Result: " + result);
      } catch (ArithmeticException e) {
          System.out.println("Cannot divide by 0");
      }
  }
}


