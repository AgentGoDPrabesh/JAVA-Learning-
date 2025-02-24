// public class person {
//   // Data Members
//   String name;
//   int age;
//   float salary;

//   // Parameterized Constructor
//   public person (String name, int age, float salary) {
//       this.name = name;
//       this.age = age;
//       this.salary = salary;
//   }

//   // Method to display details
//   void displayDetail() {
//       System.out.println("Name: " + name);
//       System.out.println("Age: " + age);
//       System.out.println("Salary: " + salary);
//   }

//   // Main Method
//   public static void main(String[] args) {
//       person person = new person("Prabesh Khadka", 20, 500000.0f);
//       person.displayDetail(); 
//   }
// }



public class Student {
  // Attributes
  String name;
  int rollNumber;
  float marks;

  
  public Student(String name, int rollNumber, float marks) {
      this.name = name;
      this.rollNumber = rollNumber;
      this.marks = marks;
  }

  public char calculateGrade() {
      if (marks >= 90) {
          return 'A';
      } else if (marks >= 80) {
          return 'B';
      } else if (marks >= 70) {
          return 'C';
      } else if (marks >= 60) {
          return 'D';
      } else {
          return 'F';
      }
  }

  public void displayDetails() {
      System.out.println("Name: " + name);
      System.out.println("Roll Number: " + rollNumber);
      System.out.println("Marks: " + marks);
      System.out.println("Grade: " + calculateGrade
      ());
  }

  // Main Method
  public static void main(String[] args) {
    
      Student student1 = new Student("Prabesh Khadka", 101, 85.5f);

      student1.displayDetails();
  }
}

