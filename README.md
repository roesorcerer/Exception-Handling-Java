# Exception Handling in Java

This is a simple Java program that generates random numbers, sorts them, and calculates the maximum, minimum, and average values. It also includes exception handling to demonstrate how to handle exceptions in Java.

## Program Description

This Java program is designed to perform the following tasks:

1. Generate 1000 random integers between 1 and 10000 and store them in an array.
2. Sort the array in ascending order using the insertion sort algorithm.
3. Calculate the maximum, minimum, and average values of the generated random numbers.
4. Handle exceptions using a try-catch block (although no exceptions are expected in this program).

## Usage

You can compile and run this Java program using a Java development environment or command line tools. Make sure you have Java installed on your system.

To compile the program, open a terminal and navigate to the directory containing the `ExceptionHandling.java` file. Then, use the `javac` command:

```bash
javac ExceptionHandling.java
```

To run the program, use the `java` command:

```bash
java module3lab.ExceptionHandling
```

## Output

The program will generate and sort random numbers, and then it will display the following output:

```
The maximum randomly generated number is: <max_value>
The minimum randomly generated number is: <min_value>
The average of all random numbers is: <average_value>
Program ends.
```

Replace `<max_value>`, `<min_value>`, and `<average_value>` with the actual calculated values.

## Exception Handling

This program includes a try-catch block for exception handling. However, it is unlikely to encounter exceptions in this specific code since it does not involve user input or file operations that might trigger exceptions. The catch block is there as a placeholder for handling any unforeseen exceptions that may occur during program execution.

If an exception occurs (though unlikely in this code), the catch block will print the message: "Numbers incorrectly classified."

## Author

- Author: Rowan Stratton

## Disclaimer

This program is provided as-is and may not cover all possible edge cases or error scenarios. It serves as an educational example of exception handling in Java and basic array manipulation.
