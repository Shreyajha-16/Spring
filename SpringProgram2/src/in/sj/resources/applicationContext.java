// Declares that this class is part of the package `in.sj.resources`
package in.sj.resources;

// Imports required Spring annotations and configuration classes
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import in.sj.Student.Student;

// Marks this class as a Spring configuration class
@Configuration
public class applicationContext {
    // Declares a bean (managed object) of type Student
    @Bean
    public Student stdId1(){
        // Creates a new Student object
        Student std = new Student();

        // Sets the properties of the Student object
        std.setName("shreya");         // Sets the name of the student
        std.setEmail("s@gmail.com");    // Sets the email of the student
        std.setRollno(11);              // Sets the roll number of the student

        // Returns the fully configured Student object, which will be managed by Spring
        return std;
    }
}
