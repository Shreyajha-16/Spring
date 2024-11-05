// Declares that this class is part of the package `in.sj.Student`
package in.sj.Student;

public class Student {
    // Private variables to store student details
    private String name; // The student's name
    private int rollno;  // The student's roll number
    private String email; // The student's email address

    // Getter method for the name property
    public String getName() {
        return name; // Returns the value of the `name` variable
    }

    // Setter method for the name property
    public void setName(String name) {
        this.name = name; // Sets the `name` variable to the provided value
    }

    // Getter method for the roll number property
    public int getRollno() {
        return rollno; // Returns the value of the `rollno` variable
    }

    // Setter method for the roll number property
    public void setRollno(int rollno) {
        this.rollno = rollno; // Sets the `rollno` variable to the provided value
    }

    // Getter method for the email property
    public String getEmail() {
        return email; // Returns the value of the `email` variable
    }

    // Setter method for the email property
    public void setEmail(String email) {
        this.email = email; // Sets the `email` variable to the provided value
    }

    // Method to display the details of the student
    public void display() {
        // Prints each of the student's properties to the console
        System.out.println("name: " + name);
        System.out.println("rollno: " + rollno);
        System.out.println("email: " + email);
    }
}

