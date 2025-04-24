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

public class OverrideExample {

  public static void main(String[] args) {
  Animal animal = new Animal();
  animal.makeSound();

  Dog dog = new Dog();
  dog.makeSound();
  }
}