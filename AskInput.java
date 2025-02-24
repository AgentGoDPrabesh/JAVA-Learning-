import java.util.Scanner; //package
public class AskInput{
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter any number:");
    
    int intNumber = scanner.nextInt();
    float floatNumber = scanner.nextFloat();
    double doubleNumber = scanner.nextDouble();

    System.out.println("The entered intgers num is:"+ intNumber);
    System.out.println("The entered float num is:"+ floatNumber);
    System.out.println("The entered intgers num is:"+ doubleNumber);

    scanner.close();
  }
}
