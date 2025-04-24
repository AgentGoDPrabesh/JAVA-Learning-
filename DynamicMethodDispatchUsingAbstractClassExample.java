// An abstract class can have both abstract (without body) and concrete method

abstract class Animal{
  
 abstract void makeSound();

 void sleep(){
  System.out.println("Sleeping");
 }
 }
  
 class Dog extends Animal{
 @Override 
 void makeSound(){
  System.out.println("Barking");
 }
}
  
public class DynamicMethodDispatchUsingAbstractClassExample {
 public static void main(String[] args) {
  
 } 
}
