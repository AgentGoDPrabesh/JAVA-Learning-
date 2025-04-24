// Interface is a blueprint of class
// It consits of abstract method and keywords such as public, static, fina
// Inteface is used to achieve  multiple inheritance



// interface Parent1 {
//   void show(); 
//   System.out.println("Display Parent1");
// }

// interface Parent2 {
//   void show(); 
//   System.out.println("Display Parent2");
// }

// class Child implements Parent1, Parent2 {
//   public void show() {
//       System.out.println("Display Child");
//   }
// }

// public class Interface {
//   public static void main(String[] args) {
//       Child c = new Child();
//       c.show(); 
//   }
// }


// ---------<<--------------

interface SoundMaker {
  void makeSound();
}


class Child implements SoundMaker {
  @Override
  public void makeSound() {
      System.out.println("Sound of child class");
  }
}


public class INterfaceexample {
  public static void main(String[] args) {
      Child child = new Child();
      child.makeSound(); 
  }
}