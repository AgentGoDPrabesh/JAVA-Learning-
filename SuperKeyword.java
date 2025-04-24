class Parent {
  int num = 67;

  Parent() {
      System.out.println("Parent class constructor");
  }

  void display() {
      System.out.println("Parent class method");
  }

  void secondMethod() {
      System.out.println("Second method of parent class");
  }
}

class Child extends Parent {
  int num = 89;

  Child() {
      System.out.println("Child class constructor");
  }

  void otherDisplay() {
      System.out.println("Child class method");
  }

  void showNumbers() {
      System.out.println("Child num: " + num);       
      System.out.println("Parent num: " + super.num); 
  }
}

public class SuperKeyword {
  public static void main(String[] args) {
    Child obj = new Child();
    
    obj.display();        
    obj.secondMethod();   
    obj.otherDisplay();   
    obj.showNumbers();   
  }
}
