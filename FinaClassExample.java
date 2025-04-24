final class First{
  void firstmethod(){
    System.out.println("This is first method");
  }
}

class Second {
  void secondmethod(){
    System.out.println("This is second method");
}

class Person{
  String name;
  double salary;

 Person (String name, double salary){
  this.name = name;
  this.salary = salary;

  }
}

class Child extends Person
void child(){
  System.out.println("This is child class");
}


public class FinaClassExample {
  public static void main(String[] args) {
    // final String name = "prabesh";
    // name= "prabhat";
    // System.out.println(name);

    Second second = new Second();
    second.secondmethod();

    Person person = new Person("prabesh", 1000.0)


  }
}
}