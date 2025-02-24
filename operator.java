public class operator {
  public static void main(String[] args){
    //operators:  Operator are the symbol used to perform operations (+, _, < , >, !=, ==)
 //Types of opeations: 
   //1. Arthimatic Operator: pefroms MAthematical calculation. ( +, _,* , /) 
     int a= 9;
     int b= 10;
     double addResult = a + b;
     System.out.println("Addition: " + addResult);
     double subResult = a - b;
     System.out.println("Subtraction: " + subResult);
     double MulResult = a * b;
     System.out.println("Multipication: " + MulResult);
     double DivResult = a / b;
     System.out.println("Divison: " +DivResult);
 System.out.println("-------------------------------------");

   // 2. Realtional Operator: compare two or more than two values.( ==, <=, >=, )
   int c= 30;
   int d= 40;
   System.out.println("c < d: " +(c < d));
   System.out.println("c > d: " +(a > b));
   System.out.println("c == d: " +(a == b));
   System.out.println("c <= d: " +(a <= b));
   System.out.println("c >= d: " +(a >= b));
   System.out.println("c > d: " +(a > b));
   System.out.println("c != d: " +(a != b));

System.out.println("-------------------------------------");

  //3. Logical Operator: Operation on  boolean values. ( Add && , OR || , NOT !)
   boolean x= true;
   boolean y= false;
   System.out.println("x && y: " + (x && y));
   System.out.println("x || y: " + (x || y)); 
   System.out.println("!x: " + (!x));
   System.out.println("!y: " + (!y));
 System.out.println("-------------------------------------");

  //4. Assignment Operator: assign value to a variable. (=, +=, -=, *=, /=, %=)
   int f = 2;
   int g = 3;
   f += g; // Equivalent to: f = f + g;
   System.out.println(f); 
   f -= g; // Equivalent to: f = f - g;
   System.out.println(f);
   f *= g; // Equivalent to: f = f * g;
   System.out.println(f);
   f /= g; // Equivalent to: f = f / g;
   System.out.println(f);
   f %= g; // Equivalent to: f = f % g;
   System.out.println(f);
 System.out.println("-------------------------------------");

// 5. Ternary Operato: 
  int j = 10;
  int k = 20;
  int min = (j < k) ? j : k;
  System.out.println("Minimum value: " + min);
  int max = (j > k) ? j : k;
  System.out.println("Maximum value: " + max);
  System.out.println("-------------------------------------");

 //6. Bitwise Operators: & (Bitwise AND), | (Bitwise OR), | (Bitwise OR), ^ (Bitwise XOR), ~ (Bitwise Complement),<< (Left Shift),>> (Right Shift)

  System.out.println("a & b  : " + (a & b));  // AND  -> 1000 = 8
  System.out.println("a | b  : " + (a | b));  // OR   -> 1011 = 11
  System.out.println("a ^ b  : " + (a ^ b));  // XOR  -> 0011 = 3
  System.out.println("~a     : " + (~a));     // NOT  -> -10 (bit inversion)
System.out.println("-------------------------------------");







 }
}







    //Operands: operands are the variables:-> (a+b) --> a and b are the oeprands and + is operator 

