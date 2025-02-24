// public class Assigement {
//     public static void main(String[] args) {
//         int a = 20;
//         int b = 30;
//         float c = 20f;
//         float d = 30f;
//         float e = 20f;
//         float f = 30f;
        
//         int addResult = a + b;
//         int subbResult = a - b;
//         float subResult = c - d;
//         int mulResult = a * b;
//         float divResult = e / f;
//         char ASCII = 66;
        
//         System.out.println("Addition: " + addResult);
//         System.out.println("Subtraction (float): " + subResult);
//         System.out.println("Subtraction (int): " + subbResult);
//         System.out.println("Multiplication: " + mulResult);
//         System.out.println("Division: " + divResult);
//         System.out.println("Java is a programming language");
//         System.out.println("ASCII Character: " + ASCII);
//     }
// }




// class Assigement {
//     private String title;
//     private String author;
//     private double price;

//     public Assigement (String title, String author, double price) {
//         this.title = title;
//         this.author = author;
//         this.price = price;
//     }

//     public void displayDetails() {
//         System.out.println("Title: " + title + ", Author: " + author + ", Price: NPR " + price);
//     }

//     public static void main(String[] args) {
//         Book book1 = new Book("Math", "prabesh khadka", 500);
//         Book book2 = new Book("Science", "Diproj giri", 700);
//         Book book3 = new Book("English", "Srijit gaywali", 1000);

//         book1.displayDetails();
//         book2.displayDetails();
//         book3.displayDetails();
//     }
// }




// public class Assigement {

//     public class Employee {
//         String name;
//         int id;
//         double salary;
//         public double calculateBonus() {
//             return salary * 0.2;
//         }
//         public void displayEmployeeDetails() {
//             System.out.println("Name: " + name);
//             System.out.println("ID: " + id);
//             System.out.println("Salary: " + salary);
//             System.out.println("Bonus: " + calculateBonus());
//             System.out.println("Total Salary: " + (salary + calculateBonus()));
//         }
//         public Employee(String name, int id, double salary) {
//             this.name = name;
//             this.id = id;
//             this.salary = salary;
//         }
//         public static void main(String[] args) {
//             Employee employee = new Employee("Prabesh", 69, 50000);
//             employee.displayEmployeeDetails();
//             System.out.println();
//         }
//     }
// }


public class Assignment {

    // Attributes
    int accountNumber;  // Fixed variable name to match Java conventions
    String accountHolderName; // Changed 'string' to 'String' (Java is case-sensitive)
    double balance;

    // Constructor
    Assignment(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited Amount: NPR " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawn Amount: NPR " + amount);
        } else if (amount > 0) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Invalid amount");
        }
    }

    // Display balance method
    void displayBalance() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: NPR " + balance);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating objects of Assignment class
        Assignment acc1 = new Assignment(123456, "Prabesh khadka", 5000.0);
        Assignment acc2 = new Assignment(789012, "Diproj Giri", 10000.0);
        
        // Performing transactions
        acc1.displayBalance();
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.withdraw(10000); 
        acc1.displayBalance();
        
        System.out.println("------------------------------------------");
        acc2.displayBalance();
        acc2.deposit(5000);
        acc2.withdraw(3000);
        acc2.displayBalance();
    }
}

