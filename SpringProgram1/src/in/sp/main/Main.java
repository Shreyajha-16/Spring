package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
    public static void main(String[] args) {
        // Specifies the location of the Spring configuration file
        String config_loc= "/in/sp/resources/applicationContext.xml";
        
        // Loads the Spring application context from the specified XML file
        ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
        
        // Retrieves the Student bean with ID 'stdId' from the context and casts it to a Student object
        Student std = (Student) context.getBean("stdId");
        
        // Calls the display() method on the std object to print its details
        std.display();
        
        System.out.println("--------------"); // Separator for clarity in output
        
        // Retrieves the Student bean with ID 'stdId2' from the context
        Student std1 = (Student) context.getBean("stdId2");
        
        // Calls the display() method on the std1 object to print its details
        std1.display();
    }
}

/*Explanation of Main.java

ApplicationContext: This is a Spring container that reads the configuration file (applicationContext.xml), creates the beans, and manages their lifecycle.

ClassPathXmlApplicationContext: Loads the XML configuration file from the classpath. Here, it uses config_loc, the file path of applicationContext.xml.

Retrieving Beans: The getBean() method retrieves the bean instances by their IDs (stdId and stdId2).

Calling display(): Each bean’s display() method outputs the properties (name, rollno, email) defined in applicationContext.xml, demonstrating that Spring successfully created and configured the beans*/

