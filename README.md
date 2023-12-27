# First-Order Linear Recurrence Solver

## Overview
This Java application is designed to solve first-order linear recurrence relations. It reads input from the standard input, calculates the closed form of the recurrence relation, and outputs the first ten terms of the series. The program is based on the algorithm outlined in Section 3.2 of the referenced textbook.

## Features
- **Input Processing**: Reads three lines of input representing the components of a first-order linear recurrence relation.
- **Closed Form Calculation**: Converts the first-order recurrence relation into its closed form.
- **Series Generation**: Calculates and prints the first ten terms of the series.

## Input Format
The program expects input in the following format:  
S(1) [initial_value]  
c [common_ratio]  
g(n) [constant_term]  

Where `[initial_value]`, `[common_ratio]`, and `[constant_term]` are numerical values defining the recurrence relation. The program assumes `g(n)` to be constant.

## Example
Input:  
S(1) 4  
c 2  
g(n) 3  

Output:  
S(n) = 2.0^(n-1) * 4.0 + sigma(2.0^(n-i) * 3.0)  
S(1) = 4.0  
S(2) = 11.0  
...  
S(10) = 3581.0  

## Usage
To use this application:
1. Compile the Java code.
2. Run the program.
3. Enter the required values (`S(1)`, `c`, and `g(n)`) when prompted.

## Contributing
Contributions to this project are welcome. Please ensure to follow the existing coding style and add unit tests for any new or changed functionality.

