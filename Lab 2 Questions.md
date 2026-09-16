# Lab 2 


### Question 1, print a range of numbers

Write a program that prints a list of numbers, for example all the numbers between 1 and 10.
 
Your loop should be in the printNumbers method. Use the method's `from` and `to`
parameters in your code.
 
Your method should work for any to and from numbers, not just 1 and 10.
Make sure you use the method's parameters.
 

### Question 2, tip amount calculator 

Write a program that prints suggested tip amounts for a food check in a restaurant.

The user will enter the amount of the check.

The program will print the amount of tip for various percentages.

It will print a table of suggested tip amounts from 10% to 30%, in 5% increments.

For example, if the user has a check of $30, the program will print

```
10% tip $3.00 total $33.00
15% tip $4.50 total $34.50
20% tip $6.00 total $36.00
25% tip $7.50 total $37.50
30% tip $9.00 total $39.00
``` 

Your program's output should look exactly as shown above.


### Question 3, while loop input validation

Write a program that asks for a college class code.
A code must be a number between 1000 and 2999.

Your program should validate that the class code entered is between 1000 and 2999.
If it is not, then ask for the code again. Repeat until the user enters a valid class code.

 
### Question 4, many copies of a String

Finish the `multiplyString` method to create a new String from many copies of itself.
The user will decide how many copies to make.
 
If the method is given the String "cat" and n = 3 copies, it will return "catcatcat".  
If the method is given the String "Hello" and n = 5 copies, it will return "HelloHelloHelloHelloHello".  
 
If the method is given the String "Hello" and n = 1 copies, it will return "Hello".  
If the method is given the String "Hello" and n = 0 copies, it will return "". (An empty String)  
If the method is given the String "Hello" and n = -1 copies, or any negative number it will return "". (An empty String)  
 
**DON'T USE THE String `repeat()` LIBRARY METHOD.**

For this lab, you should solve this problem using a loop.

Hint: Start with an empty string, and add userString on to the end of that string multiple times.
       
### Question 5, filter array

Write a program that prints only the program file names from an array.

For this question, a program file is any file that ends with .py or .java or .cs

For example, if the filenames array = `{ "lab1.py", "assignment.docx", "music.mp3", "Website.cs", "Calculator.java" }`
Then the program should print

```
lab1.py
Website.cs
Calculator.java
```


### Question 6, remove bad data from an array

When collecting data, it's common to have bad data mixed in with the actual data.

For this program, imagine that you are monitoring your internet speed once an hour.
Sometimes the connection is lost completely and due to a bug in the monitoring program,
the speed is recorded as 2,147,483,647 Mbps, (mega bits per second) which is much too fast to be a valid speed.

1-20 Mbps is typical for an average budget home cable internet connection. Fiber connections may be 1000Mbs or 1 gigabit.

(Question - what's special about 2,147,483,647? Why might the monitoring program record this number in particular? )

Part 1: In this program, complete the cleanData method to remove bad data from an array of data.
Since 2147483647 means the connection was lost, then 0 bytes were transferred.
So, replace each 2147483647 values in the array with 0.

Part 2: Complete the graphData method to draw a basic vertical graph of the data.
 

### Question 7, average utility bills

Customers of an energy (gas, electricity) utility company have much larger bills in the cold winter than in the summer.

The utility company allows customers to spread the cost of bills through the year by charging the average bill payment every month. 

So, the customer will pay the same amount every month, to make budgeting easier. A customer will pay less than their actual bill in the winter, and more than their actual bill in the summer. But over the year, they will pay the same total amount. 

The utility company averages all the last year's bills, and uses that to estimate the average payment for next year.
 
Write a program to calculate the average bill for all 12 monthly bills.

Ask the user for each month's bill for last year. 
Store this data in an array.
Store January's bill in element 0, February's in element 1, March's in element 3...
 
Then, add up all the bills and calculate, and display the average.
 
Also, display the user's data in a table of months and bill amount, so they can review it for accuracy.
 
Tip: use the `months` array provided, with the names of the months, to help ask for data and display data.
