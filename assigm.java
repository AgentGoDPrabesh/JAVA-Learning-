      // QN NO 1

// import java.util.Scanner;
// public class assigm {

//  static double length, width, height;

//  static double calculateVolume() {
//         return length * width * height;
//     }
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);

//   System.out.print("Enter Length: ");
//   length = scanner.nextDouble();

//   System.out.print("Enter Width: ");
//    width = scanner.nextDouble();

//         System.out.print("Enter Height: ");
//         height = scanner.nextDouble();
//         System.out.println("The volume of the cuboid is: " + calculateVolume());

//         scanner.close();
//     }
// }


      // Q NO 2

 import java.util.Scanner;
public class assigm {
          
// Static method
 static double calculateSimpleInterest(double principle, double rate, double time) {
     return (principle * rate * time) / 100;
          }
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
      
    System.out.print("Enter Principle: ");
     double principle = scanner.nextDouble();
      
    System.out.print("Enter Rate: ");
     double rate = scanner.nextDouble();
      
    System.out.print("Enter Time (in years): ");
     double time = scanner.nextDouble();
  
     // Calling the static method
     double simpleInterest = calculateSimpleInterest(principle, rate, time);
    System.out.println("The Simple Interest is: " + simpleInterest);
      scanner.close();
     }
}