# Spring
The Spring framework Codes from the very basic and with the detailed explanation

## SpringProgram1
This code is an example of using Spring's Dependency Injection (DI) framework to create and manage objects of a Student class in a Java application. Here’s an overview of the code’s purpose and how it works as a whole:

## Overview
The code demonstrates how to use Spring to:

Define a simple Java class (Student) with properties like name, rollno, and email.
Configure and initialize instances of this class (called "beans") in an external XML configuration file (applicationContext.xml).
Use the main application code (Main.java) to retrieve and work with these beans created by Spring.
## Key Components and Their Roles
## Student.java Class:

This class represents a Student object with three properties: name, rollno (roll number), and email.
It includes getter and setter methods for each property, allowing their values to be accessed and modified.
It also has a display() method to print the details of a Student object to the console.
applicationContext.xml Configuration File:

This file is an XML-based Spring configuration file.
It defines two Student beans (objects), specifying their initial values for name, rollno, and email properties.
Each bean has a unique id (stdId and stdId2), which allows these specific objects to be referenced later in the code.
Spring uses this file to create and manage the Student beans based on the provided configurations.
## Main.java Class:

This is the entry point of the application.
It loads the Spring configuration file (applicationContext.xml) and uses the ApplicationContext to initialize the beans as per the configurations defined in the XML.
The getBean() method retrieves each Student bean by its ID (stdId and stdId2), so that they can be used in the code.
Finally, it calls the display() method on each retrieved bean to print the properties of each Student object to the console.
How It All Works Together
When you run the Main class:

Spring reads the applicationContext.xml file and creates two Student objects with the specified properties.
These objects are managed by Spring and can be accessed through their IDs (stdId and stdId2) in the code.
The Main class retrieves these objects and calls their display() methods, outputting their details to the console.
Why Use Spring Here?
This example demonstrates Dependency Injection—a design principle where Spring creates and manages objects for us, reducing the need to write new statements directly in code. Instead of manually creating and setting up each Student object, Spring does it automatically based on the configuration, making the application more modular and easy to maintain.

## Summary
The code provides a simple example of using Spring’s DI capabilities to:

Define and configure objects (beans) externally in an XML file.
Retrieve and use these objects in the main application code, without needing to instantiate them directly.
