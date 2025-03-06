 class Car{  
    int price;
    string name;
  }
  public class PassByReference {
     public static void main(String[] args) {
    Car car = new Car();
    car.price = 20000;
    car.name = "Toyota";
    System.out.println(car.name);
    System.out.println("car.price");
   }
}
