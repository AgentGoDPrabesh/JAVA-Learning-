public class breakcontinue {
    public static void main(String[] args) {

  //break example
   for (int i=0; i<=10; i++){
    if (i==4){
        break;
    }
    System.out.println(i); // 0 1 2 3
   }

   // continue example
   for (int i= 1; i<= 10; i++){
    if (i % 2 == 0){
     continue;
    }
    System.out.println(i);
   }





 }
}     