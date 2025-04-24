// Dynamic Method dispatch also know as runtime polymorphism , is a mechanism in java where the 
// method call is resolved at runtime rather thsn compile time
// it can be achieve using abstract classes and interfaces
// Achieves routine polymorphism
// supports loose coupling


class Animal{
  void makeSound(){
   System.out.println("Animal make sound ");
  }
}

class Dog extends Animal{
  @Override
  void makeSound(){
    System.out.println("Dog barked");
  }
}

class Cat extends Animal{
  @Override
  void makeSound(){
    System.out.println("Cat meowed");
  }
}

public class DynamicMethodDispatch {

  public static void main(String[] args) {
  Animal animal;
 animal = new Dog();
 animal.makeSound();

 animal = new Cat();
 animal.makeSound();
  }
}