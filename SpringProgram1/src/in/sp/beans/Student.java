package in.sp.beans;

// Defining the Student class
public class Student {
    // Private fields to store student's name, roll number, and email
    private String name;
    private int rollno;
    private String email;
    
    // Getter method for 'name' (used to access the private 'name' field from outside the class)
    public String getName() {
        return name;
    }
    
    // Setter method for 'name' (used to modify the 'name' field from outside the class)
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter method for 'rollno' (used to access the private 'rollno' field)
    public int getRollno() {
        return rollno;
    }
    
    // Setter method for 'rollno' (used to modify the 'rollno' field)
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    
    // Getter method for 'email' (used to access the private 'email' field)
    public String getEmail() {
        return email;
    }
    
    // Setter method for 'email' (used to modify the 'email' field)
    public void setEmail(String email) {
        this.email = email;
    }
    
    // Method to display the student information to the console
    public void display() {
        System.out.println("name: " + name);
        System.out.println("rollno: " + rollno);
        System.out.println("email: " + email);        
    }
}

/*Explanation of Student.java
Fields: name, rollno, and email represent the properties of a student, stored as private fields to follow the encapsulation principle.
Getter and Setter Methods: Allow external classes to read and modify private fields while still protecting direct access.

display() Method: Outputs the student’s name, roll number, and email to the console. This helps verify the data assigned to each instance of Student.
*/