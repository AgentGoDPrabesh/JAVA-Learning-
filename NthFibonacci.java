public class NthFibonacci{
  static int factorial(int n){
    if (n <= 0) {
      return -1; 
  } else if (n == 1) {
      return 0;
  } else if (n == 2) {
      return 1;
  }
  return factorial(n - 1) + factorial(n - 2);
} 
public static void main(String[] args) {
int n = 10; // Find the 10th Fibonacci number
System.out.println("Fibonacci number at position " + n + " is: " + factorial(n));
 }
}