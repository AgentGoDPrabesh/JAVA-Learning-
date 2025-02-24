import java.util.Scanner;
public class multi {


public static int multi(int a, int b, int c) {
  return a * b * c; 
}

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter three number:");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int num3 = scanner.nextInt();

   int multiply = multi( num1, num2, num3);

    System.out.println(multiply);
    }
}
