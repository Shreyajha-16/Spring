# Spring Program 2
This code is an example of using Spring's Dependency Injection (DI) to manage and configure a Student object in a Java application. It consists of three main parts:

## 1. Student.java Class
The Student class represents a student entity with properties for name, rollno (roll number), and email.
It includes getter and setter methods for each of these properties, allowing external code to retrieve and set the values.
The display() method is defined to print the details of the student (name, roll number, and email) to the console.

## 2. applicationContext.java Configuration Class
applicationContext.java is a Spring configuration class, marked with the @Configuration annotation to indicate it contains bean definitions.
The stdId1() method, annotated with @Bean, defines a Student bean. This tells Spring to create and manage an instance of Student with the ID stdId1.
In stdId1(), the method sets values for the student’s name, email, and rollno properties before returning the configured Student object.
This Student object is then accessible as a Spring-managed bean, meaning Spring handles its creation and lifecycle according to the defined configurations.

## 3. Main.java Class
This is the entry point of the application. It loads the Spring configuration from applicationContext.java using AnnotationConfigApplicationContext.
The ApplicationContext interface is used here to create and retrieve beans as defined in the configuration.
getBean("stdId1") retrieves the Student bean with ID stdId1, allowing access to this pre-configured Student object.
Finally, the display() method is called on this bean, printing the student details to the console.
### How the Code Works Together
The Student class defines the data structure and behavior for a student.
The applicationContext.java configuration class manages the setup for a Student object by defining a Student bean with initial values for its properties.
The Main class loads the Spring configuration, retrieves the Student bean, and calls display() to print the student’s details.
By using Spring, the application doesn't manually create Student objects. Instead, Spring takes care of creating and configuring these objects as beans, making the code modular and easy to modify or extend.
## Summary
This code demonstrates a simple Spring Dependency Injection pattern, where:

The Student class defines the properties and methods.
The applicationContext.java configuration defines the bean setup.
The Main class initializes Spring, retrieves the beans, and uses the objects.
Using DI, the application becomes flexible and maintainable, with Spring managing object creation and dependency injection, keeping the code more modular and organized.







