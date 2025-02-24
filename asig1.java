import java.util.Scanner; 
public class asig1 {
  public static void main(String[] args){

  int n = 10; 
  int sum = 0;
   for (int i = 1; i <= n; i++) {
    sum += i; 
   }

  System.out.println("Sum of first " + n + " natural numbers is: " + sum);
   System.out.println("--------------------------------------------------------");

//2nd qn 

 int i = 2; 
  while (i <= 50) {
  System.out.print(i + " "); 
  i += 2;
 }
   System.out.println("--------------------------------------------------------");
//3rd qn

 int j = 100; 
  while (i >= 1) {
   System.out.print(i + " "); 
   i--; 
 }
  System.out.println("--------------------------------------------------------");
//4th qn

int N = 5; 
long factorial = 1;

  for (int k = 1; i <= N; i++) {
   factorial *= i; // Multiply factorial by i
   }

  System.out.println("Factorial of " + N + " is: " + factorial);
  System.out.println("--------------------------------------------------------");

//5th qn

  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter the number of Fibonacci terms: ");
    int y = scanner.nextInt();
      int first = 0, second = 1;
    System.out.print("Fibonacci Series: ");
     for (int k = 1; k <= y; k++) {
    System.out.print(first + " ");
      int next = first + second;
    first = second;
    second = next;
}

//7th qn

   System.out.print("Enter a number: ");
  int num = scanner.nextInt();
   int largest = 0; 
       while (num > 0) {
      int digit = num % 10; 
    if (digit > largest) {
    largest = digit; 
  }
    num /= 10; 
  }
 System.out.println("Largest digit in the number is: " + largest);
  }
}