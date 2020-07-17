# Tricky-Java-Programs
Sometimes we need very few things to apply in a program but the thing should be placed at right postion. In this repository I'm sharing simple but a bit tricky Java Programs.
*Questions Source is, https://hyperskill.org*

## Problem 1: Bus Tour 
A bus tour of Europe has been very successful. Due to an increase in the number of people that want to go on a tour, the tour company decided to increase the height of the bus. The new height of the bus is exactly N centimeters.

But the tour’s route runs under a lot of bridges, and there is a chance that the bus will crash into one of these bridges. Can you find out if this will happen?

The first line of the input contains the height of the bus and the number of bridges under which the bus passes. The second line contains the heights of these bridges.

You should output "Will not crash" if everything will be all right; otherwise, output "Will crash on bridge i" (where i is a number of a bridge) into which the bus will crash. If the height of a bridge equals the height of the bus, the bus will crash.

##### [Notice Array is not allowed, that's why is tricky]

### Sample Input 1:

      234 8
      465 453 981 463 1235 871 475 981
### Sample Output 1:

      Will not crash
### Sample Input 2:

     211 5
     871 205 123 871 1681
### Sample Output 2:

     Will crash on bridge 2

## Problem 2: The (un)-ordered sequence
Write a program that reads a sequence of integer numbers and outputs true if the sequence is ordered (in ascending or descending order), otherwise, false. Keep in mind, if a number has the same value as the following number, it does not break the order.

The sequence ends with 0. Do not consider this number as a part of the sequence. The sequence always has at least one number (excluding 0).

##### [Notice Array is not allowed, that's why is tricky]
##### [No Sorting Algorithm is required.]

### Sample Input 1:

     9 8 7 6 5 4 3 2 1 0
### Sample Output 1:

     true
### Sample Input 2:

     1 2 3 3 9 0
### Sample Output 2:

     true
### Sample Input 3:

     1 2 5 5 2 3 0
### Sample Output 3:

     false

## Problem 3: Iterating over arrays.java
Write a program that reads an unsorted array of integers and two numbers n and m. The program must check if n and m occur next to each other in the array (in any order).

Input data format

      The first line contains the size of an array.
      The second line contains elements of the array.
      The third line contains two integer numbers n and m.
      All numbers in the same line are separated by the space character.

Output data format

Only a single value: true or false.
### Sample Input 1:

    3
    1 3 2
    2 3
### Sample Output 1:

    true
### Sample Input 2:

    3
    1 2 3
    3 4
Sample Output 2:

    false
    
## Problem 4: The for-loop Grades

Find the number of D, C, B and A grades for the last test on informatics, where n students from a class have successfully passed the test.

In this task, we use a 5-point grading system and are interested only in passing grades: from 2 to 5. They correspond to the letter grades in the following way: 5 is for A, 4 is for B, 3 is for C and 2 is for D. The program gets number n as input and then gets the grades themselves: one by one.

The program should output four numbers in a single line: the number of D, C, B, and A grades respectively.

### Sample Input 1:
      13
      2
      5
      5
      5
      5
      3
      2
      4
      3
      3
      3
      2
      3
### Sample Output 1:
      3 5 1 4

## Problem 5: The longest ascending sequence
Write a program that reads an array of ints and outputs the length of the longest sequence in strictly ascending order. Elements of the sequence must go one after another. A single number is assumed to be ordered sequence with the length = 1.

### Input data format

The first line contains the size of an array.
The second line contains elements of the array separated by spaces.

### Example

The input array is 1 2 4 1 2 3 5 7 4 3. In this case, the length of the longest sequence in ascending order is 5. It includes the following elements: 1 2 3 5 7.

### Sample Input 1:

      10
      1 2 4 1 2 3 5 7 4 3
### Sample Output 1:

      5
      
## Problem 6: Snail Walk
Snail creeps up the vertical pole of height H feets. Per day it goes A feets up, and per night it goes B feets down. In which day the snail will reach the top of the pole?

Input data format

On the input the program receives non-negative integers H, A, B, where H > B and A > B. Every integer does not exceed 100.

### Sample Input 1:

      10
      3
      2
### Sample Output 1:

      8
### Sample Input 2:

      20
      7
      3
### Sample Output 2:

      5

## Problem 7: Reversing Int-String
Write a program that reads a three-digit number, calculates the new number by reversing its digits, and outputs a new number.
*Please Check Input 1, You need to omit the value 0 is it comes in last of number.*

### Sample Input 1:

      320
      
### Sample Output 1:

      23
      
### Sample Input 2:

      976
      
### Sample Output 2:

      679
     
## Problem 8: Java String Tokens
###### *(Question source hackerrank.com)*
Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.
### Sample Input

He is a very very good boy, isn't he?
### Sample Output

      10
      He
      is
      a
      very
      very
      good
      boy
      isn
      t
      he

## Problem 9: Check the clock time (Regex)
For a given string you should check if it shows correct time or not. Correct time consists of two integers separated by a colon. The first integer must be from 00 to 23 and the second integer must be from 00 to 59.
Output "YES" if the given string shows correct time, otherwise output "NO".
### Sample Input 1:

      09:00
### Sample Output 1:

      YES
### Sample Input 2:

      23:59
### Sample Output 2:

      YES
### Sample Input 3:

      24:00
### Sample Output 3:

      NO
### Sample Input 4:

      4:00
### Sample Output 4:

      NO

## Problem 10: Print - Overloading
There is a method print(String arg). The method outputs the name and its argument (in " ", cause it's a string). The output format for the string argument "test":

      print("test")
Overload this method by writing a new method with the same name and two arguments: a string and an integer. The new method should print the name and both parameters, like:

      print("test", 4)
Do not remove the existing method!
### Sample Input 1:

      test
      4
### Sample Output 1:

      print("test")
      print("test", 4)

## Problem  11 : Pattern - Regex
Using Regex, we can easily match or search for patterns in a text. Before searching for a pattern, we have to specify one using some well-defined syntax.

In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.

*Note: In this problem, a regex is only valid if you can compile it using the Pattern.compile method.* *Problem via https://www.hackerrank.com*

### Input Format

The first line of input contains an integer , denoting the number of test cases. The next  lines contain a string of any printable characters representing the pattern of a regex.

### Output Format

For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not print the quotes.

### Sample Input

      3
      ([A-Z])(.+)
      [AZ[a-z](a-z)
      batcatpat(nat
### Sample Output

      Valid
      Invalid
      Invalid

## Problem 12: Triples

Write a program that reads an array of ints and outputs the number of "triples" in the array.

A "triple" is three consecutive ints in increasing order differing by 1 (i.e. 3,4,5 is a triple, but 5,4,3 and 2,4,6 are not).

### Input data format

The first line contains the size of an array.
The second line contains elements of the array separated by spaces.

### Output data format

Only a single integer value: the number of "triples".

### Sample Input 1:

      6
      1 2 4 5 6 7
### Sample Output 1:

      2

## Problem 13: Parse URL

You want to hack a website now. First, get all the available parameters that you can find in the URL. Then print them in the __"key : value"__ format. If a parameter doesn't have value, print __"not found"__.

If you find the password (parameter __pass__), you should print its value after all parameters once again, but with a key **password**. If a URL does not contain parameter **pass**, do not print anything after the listed parameters. However, if **pass** parameter is present, its value cannot be empty.

**Note:** the order of parameters should be the same as in the URL.
**Advice:** Check examples for better understanding and carefully learn the structure of the URL.

### Sample Input 1:

      https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost
### Sample Output 1:

      pass : 12345
      port : 8080
      cookie : not found
      host : localhost
      password : 12345
### Sample Input 2:

      https://target.com/index.html?port=8080&cookie=&host=localhost
### Sample Output 2:

      port : 8080
      cookie : not found
      host : localhost
