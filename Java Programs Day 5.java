/**
public abstract class Car {  // Abstract class – cannot be instantiated directly

    private String model;
    private String make;
    private int year;
    private double speed;

    public Car(String model, String make, int year) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.speed = 0;
    }

    public void start() {
        System.out.println("Starting the car...");
        // Complex engine start-up logic hidden here (abstracted)
    }
    public void accelerate(double amount) {
        speed += amount;
        System.out.println("Accelerating. Speed: " + speed);
        // Complex mechanics of acceleration hidden
    }


    public void brake(double amount) {
        speed = Math.max(0, speed - amount); // Ensure speed doesn't go below 0
        System.out.println("Braking. Speed: " + speed);
        // Complex braking system logic hidden
    }


    public abstract void playMusic();  // Abstract method – must be implemented by subclasses


    public String getCarInfo() { // Concrete method
        return year + " " + make + " " + model;
    }

}

// Example of a concrete class implementing the abstract class
public class SportsCar extends Car {

    private boolean turboEnabled;


    public SportsCar(String model, String make, int year) {
        super(model, make, year);
        this.turboEnabled = false;
    }


    @Override // Implementing the abstract method
    public void playMusic() {
        System.out.println("Playing rock music!");
    }


    public void enableTurbo() {
        turboEnabled = true;
        System.out.println("Turbo enabled!");
    }

    @Override
    public void accelerate(double amount) { // Example of method overriding to specialize behavior
        if (turboEnabled) {
            amount *= 1.5;  // Turbo boost!
        }
        super.accelerate(amount); // Call the parent class's accelerate method
    }


    public static void main(String[] args) {
        SportsCar myCar = new SportsCar("Roadster", "Generic Motors", 2024);
        myCar.start();
        myCar.accelerate(20);
        myCar.enableTurbo();
        myCar.accelerate(20);
        myCar.playMusic();
        myCar.brake(10);
        System.out.println(myCar.getCarInfo()); //Accessing the concrete method
    }
}
*/

class Employee {
    int salary;
    String name;

    // Getter method for salary
    public int getSalary() {
        return salary;
    }

    // Setter method for salary
    public void setSalary(int s) {
        salary = s;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String n) {
        name = n;
    }
}

public class EmployeeCustom {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee();
        
        // Set the name of the employee
        emp.setName("John");
        
        // Set the salary of the employee
        emp.setSalary(1000);
        
        // Print the name of the employee
        System.out.println("Name: " + emp.getName());
        
        // Print the salary of the employee
        System.out.println("Salary: " + emp.getSalary());
    }
}




