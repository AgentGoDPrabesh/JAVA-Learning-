public class ThrowKeyWordEg {
  
//   //Developer A
//   public static int divide (int a, int b) throws ArithmeticException{
//     return a/b;
//   }

//   //Developer B

//    public static void main(String[] args) {
//     try{
//     int result = divide(5, 5);
//     System.out.println(result);
//   } catch (Exception e){
//     System.out.println("cannot divide ");
//   }
// }
// }



  public static void main(String[] args) {
      int number=10;
      try {
          if (number<0) {
              
          }
          System.out.println("Valid Number"+number);
          
      }
      catch(Exception e){
          System.out.println("Customer Error:"+e.getMessage());
      
      }
      }
}
