public class StaticKeywordExample {
  // Instance variables
  String employeeName;
  static String employeeCeo;
  double employeeSalary;

  // Method to display details
  void displayDetails() {
      System.out.println("Employee Name: " + employeeName);
      System.out.println("Employee CEO: " + employeeCeo);
      System.out.println("Employee Salary: " + employeeSalary);
  }

  public static void main(String[] args) {
      // Creating two objects of the class
      StaticKeywordExample object1 = new StaticKeywordExample();
      StaticKeywordExample object2 = new StaticKeywordExample();

      // Static data initialization
      StaticKeywordExample.employeeCeo = "Alpha"; // Static variable can be accessed using class name

      // Initializing instance variables
      object1.employeeName = "Prabesh";
      object1.employeeSalary = 12000.0; 

      object2.employeeName = "Srijit"; // Another instance initialization
      object2.employeeSalary = 15000.0;

      // Displaying details
      object1.displayDetails();
      object2.displayDetails();
  }
}
