public class paramatricconstructor {
// data Members
  int length;
  int breadth;
 
paramatricconstructor(int length, int breadth){
  this.length = length;
  this.breadth = breadth;
}
void displayDetail(){
  System.out.println("length "+ length);
  System.out.println("breadth" + breadth);
}
  public static void main(String[] args) {
    paramatricconstructor paramatricconstructor = new paramatricconstructor(5, 10);
    paramatricconstructor.displayDetail();
  }
}
