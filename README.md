# Tricky-Java-Programs
Sometimes we need very few things to apply in a program but the thing should be placed at right postion. In this repository I'm sharing simple but a bit tricky Java Programs.

## Problem 1: Bus Tour 
A bus tour of Europe has been very successful. Due to an increase in the number of people that want to go on a tour, the tour company decided to increase the height of the bus. The new height of the bus is exactly N centimeters.

But the tour’s route runs under a lot of bridges, and there is a chance that the bus will crash into one of these bridges. Can you find out if this will happen?

The first line of the input contains the height of the bus and the number of bridges under which the bus passes. The second line contains the heights of these bridges.

You should output "Will not crash" if everything will be all right; otherwise, output "Will crash on bridge i" (where i is a number of a bridge) into which the bus will crash. If the height of a bridge equals the height of the bus, the bus will crash.

##### [Notice Array is not allowed, that's why is tricky]

### Sample Input 1:

*234 8*
*465 453 981 463 1235 871 475 981*
### Sample Output 1:

*Will not crash*
### Sample Input 2:

*211 5*
*871 205 123 871 1681*
### Sample Output 2:

*Will crash on bridge 2*

## Problem 2: The (un)-ordered sequence
Write a program that reads a sequence of integer numbers and outputs true if the sequence is ordered (in ascending or descending order), otherwise, false. Keep in mind, if a number has the same value as the following number, it does not break the order.

The sequence ends with 0. Do not consider this number as a part of the sequence. The sequence always has at least one number (excluding 0).

##### [Notice Array is not allowed, that's why is tricky]
##### [No Sorting Algorithm is required.]

### Sample Input 1:

*9 8 7 6 5 4 3 2 1 0*
### Sample Output 1:

*true*
### Sample Input 2:

*1 2 3 3 9 0*
### Sample Output 2:

*true*
### Sample Input 3:

*1 2 5 5 2 3 0*
### Sample Output 3:

*false*

## Problem 3: Write a program that reads an unsorted array of integers and two numbers n and m. The program must check if n and m occur next to each other in the array (in any order).

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
