public class Cmd_Arg_Example {
//   public static void main(String[] args) {
//     for (int i=0; i< args.length; i++){
//    System.out.println(args[i]);

//     }
//   }
// }

  public static void main(String[] args) {
      if (args.length < 3) {
          System.out.println("Enter SI, Time , Rate ");
          return;
      }

    double principal = Double.parseDouble(args[0]);
    double rate = Double.parseDouble(args[1]);
    double time = Double.parseDouble(args[2]);

    double simpleInterest = (principal * rate * time) / 100;


    System.out.println("Simple Interest: " + simpleInterest);
  }
}

