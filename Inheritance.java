// Inheritance : Extracting the peoperty from parent class( superclass) to child class (sub class)
            // Functions:
// a. polymorphism
// b. code reasobility
// c.Method over rdiing
           // Types of Inheritance:
// a.single Inheritance
// b. multiple Inheritance
// c. multilevel Inheritance
// d. hybrid Inheritance

class Vehicle {
 void run(){
  System.out.println("vechile is running");
 }
}

class Car{
  void stop(){
    System.out.println("Vechile stopped");
  }
}
public class Inheritance {
  public static void main(String[] args) {
    Vehicle vechile = new Vehicle();
    vechile.run();

    Car car = new Car();
    car.stop();
  }
}

