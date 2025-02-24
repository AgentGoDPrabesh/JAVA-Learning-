import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int intNumber = scanner.nextInt();
    if (intNumber % 2 == 0) {
   System.out.println(intNumber + " is an even number.");
      } else {
      System.out.println(intNumber + " is an odd number.");
        }
        
        scanner.close();
    }
}


  