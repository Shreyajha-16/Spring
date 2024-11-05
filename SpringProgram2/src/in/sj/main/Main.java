// Declares that this class is part of the package `in.sj.main`
package in.sj.main;

// Imports required Spring classes and custom classes
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sj.Student.Student;
import in.sj.resources.applicationContext;

public class Main {
    // Main method: Entry point of the application
    public static void main(String[] main) {
        // Loads the Spring configuration defined in the `applicationContext` class
        ApplicationContext context = new AnnotationConfigApplicationContext(applicationContext.class);

        // Retrieves the `stdId1` bean from the Spring container, casting it to a Student type
        Student std = (Student) context.getBean("stdId1");

        // Calls the `display` method to print the details of the Student object to the console
        std.display();
    }

}
    