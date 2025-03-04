public class PolymorphismExample {
  
  // Method Overloading
  // Examples:
  // 1. int add( int a, int b);
  // 2. double add( int a, int b, int c);
  // 3. double add( double a, double b, double c, double d);

  // Program example:
 
  int add( int a, int b){
  return a + b;
 }

//  Method Overloaded with 3 int type parameters
static int add( int a, int b, int c){
 return a + b + c;
}

// Method Overloaded with 2 double type parameters
 double add(double a, double b){
  return a + b;
 }

 // calling without statics
//  public static void main(String[] args) {
//   PolymorphismExample object1 = new PolymorphismExample();
//   int result = object1.add(4,6);
//   System.out.println("Result of add(4,6) is: " + result);
//  }

//  calling with statics
// public static void main(String[] args) {
//   int result1 = add(5, 3, 2);
//   System.out.println("Sum: " + result1);
//  }

//  calling without static

 public static void main(String[] args) {
  PolymorphismExample object3 = new PolymorphismExample();
  int result = object3.add(4.5,6.5,3.5);
  System.out.println resultThree;
 }
}
