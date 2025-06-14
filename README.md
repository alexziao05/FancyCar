# Overview
This project demonstrates foundational object-oriented programming by defining a custom class called `FancyCar`. It consists of two main Java files: 

- `FancyCar.java`: Defines the structure and behavior of a car object.
- `FancyCarClient.java`: Act as the driver class to test and showcase the functionality of `FancyCar`. 

This was a learning exercise in class-based design, constructors, encapsulation, and interaction between classes. 

# File Descriptions
### `FancyCar.java`

This file contains the **`FancyCar` class**, which is a blueprint for creating car objects with three main attributes:

- **Make** (e.g., Honda, BMW)
- **Model** (e.g., Civic, M3)
- **Year** (e.g., 2020)

**Key Features:**

- A **default constructor** and a **parameterized constructor** to initialize objects.
- **Getter and setter methods** for each attribute to follow the principle of **encapsulation**.
- A **`toString()` override** that returns a human-readable summary of the car's properties.
  
### `FancyCarClient.java`

This file serves as the **entry point** (`main` method) of the program. It demonstrates how to:

- Instantiate `FancyCar` objects using both constructors.
- Modify object properties using setters.
- Access object data using getters.
- Print objects directly using `System.out.println()` and the `toString()` method.

This class is where the real usage of the `FancyCar` class is tested and displayed.

# What I Learned
- Encapsulation: Keeping class variables private and accessing them via getters/setters.
- Constructors: Writing multiple constructors for flexibility in object creation.
- Method Overriding: Customizing behavior of built-in methods like `toString()`.
- Class Interaction: Understanding how one class (the client) interacts with another (the model/data class).
- How to compile Java files using `javac` and run them using the `java` command.
- Importance of naming conventions (e.g., file name must match the public class name).
- Understanding compilation errors (e.g., class not found, syntax issues).

# How to Compile and Run 
### 1. Compile Both Files
```bash
javac FancyCarClient.java
```
### 2. Run the Program
```bash
java FancyCarClient.java
```
### 3. Expected Output 
```text
Miles driven: 105
Gas Tank: 9.833333333333332 gallons
New Gas Tank: 11.833333333333332 gallons
The Toyota says beep beep!
```


