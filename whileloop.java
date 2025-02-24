import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

    // while loop
    int a = 5;
    Scanner scanner = new Scanner(System.in);

    while (true) {
     System.out.println("Enter any number:");
     int intNumber = scanner.nextInt();

       if (intNumber == 5) {
        System.out.println("Exiting....");
    break;
    }
 }

        scanner.close();
    }
}
