import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
System.out.print("Enter a number: ");
int intNumber = scanner.nextInt();
    

    for (int i = 1; i <= 10; i++) {
            System.out.println(intNumber + " * " + i + " = " + (intNumber * i));
        }
        
        scanner.close();
    }
}
