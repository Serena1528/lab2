package week_2;

/**
 *
 When collecting data, it's common to get some bad data mixed in with the actual data.
 
 For this program, imagine that you are monitoring your internet speed once an hour.
 Sometimes the connection is lost completely. Due to a bug in the monitoring program,
 when the connection is lost, the speed is recorded as 2,147,483,647 Mbps, (mega bits per second)
 which is much too fast to be a valid speed.
 
 1-20 Mbps is typical for an average budget home cable internet connection.
 Fiber connections may be 1000Mbs or 1 gigabit.
 
 ( Question - what's special about 2,147,483,647? Why might the monitoring program record this number in particular? )
 
 Part 1: Complete the cleanData method to remove bad data from an array of data.
 A value of 2147483647 means the connection was lost, then 0 bytes were transferred.
 So, replace all the 2147483647 values in the array with the number 0.
 
 Part 2: Complete the graphData method to draw a basic vertical graph of the data.
 
 */


public class Question_6_Clean_And_Graph_Array {

    public static void main(String[] args) {
    
        // 24 speeds recorded, one per hour, over a 24-hour period
        // Don't modify this array, it represents the original data provided to the program.
        int[] speedsRecorded = { 8, 5, 8, 7, 8, 2147483647, 7, 8, 9, 7, 6, 6, 2147483647, 6, 2147483647, 5, 8, 7, 6, 6, 8, 9, 6, 8};
        
        cleanData(speedsRecorded);
        graphData(speedsRecorded);
        
    }
    
    public static void cleanData(int[] speeds) {
    
        // TODO finish this method.
        //  Replace any element in the speeds array that has the value 2147483647, with 0.
        // Don't modify any other elements in the array.
        
        // If you modify an object within a method, it's the same object that the method is called with.
        // The speeds parameter variable in this method is just another name for speedsRecorded in the main method.
        // So you don't actually need to return anything for main to know that you have modified the array.
        // This doesn't work with int or String values, so there will be many times where you will need to return a value.
    
    }
    
    public static void graphData(int[] speeds) {
        
        /* TODO Finish this method to draw a very simple vertical "graph" of the data.
        For the first element in the array, print that number of stars on a line.
        For the second element in the array, print that element's value of stars on a new line.
        
        Example: if the array was { 4, 5, 0, 3, 9 }
        Then print the following. Notice the first line has 4 stars, the second line has 5 stars,
        the third line has 0 stars, and the fourth line has 3 stars, and the fifth line has 9 stars


        ****
        *****

        ***
        *********

        
        If your computer takes a really long time to run this method, or is drawing a lot of stars,
        or crashes with an OutOfMemoryError,
        you may not have removed the very large numbers from
        the array. Make sure you've replaced the 2147483647 values with 0 in the array.
        Press the red stop button in the Run window to stop your program.
        
        Make sure this method works with any length array.
        */


        
    }

}
