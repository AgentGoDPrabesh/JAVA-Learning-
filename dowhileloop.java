import java.util.Scanner;

public class dowhileLoop {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int intNumber;

    do {
     System.out.println("Enter any number:");
      intNumber = scanner.nextInt();

        if (intNumber == 5) {
        System.out.println("Exiting....");
        break;
     }
 } 
 while (intNumber != 5);

        scanner.close(); 
    }
}
