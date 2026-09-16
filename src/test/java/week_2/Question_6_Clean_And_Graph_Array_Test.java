package week_2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static week_2.Question_6_Clean_And_Graph_Array.cleanData;
import static week_2.Question_6_Clean_And_Graph_Array.graphData;


public class Question_6_Clean_And_Graph_Array_Test {
    
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test(timeout = 3000)
    public void cleanDataTest() {
        
        int[] exampleData = { 2147483647, 9, 2147483647, 0, 234, 2147483646, 34, -234};
        int[] expectedCleanedData = { 0, 9, 0, 0, 234, 2147483646, 34, -234};
        
        cleanData(exampleData);
        
        assertArrayEquals("Every time 2147483647 appears in the array, replace it with 0.\n" +
                "Make sure your method works for any length array. ", expectedCleanedData, exampleData);
    }

    @Test(timeout = 3000)
    public void graphDataTest() {
        
        int[] exampleData = { 5, 2, 4, 0, 3};
        String expectedGraph = "*****\n**\n****\n\n***";
        
        graphData(exampleData);
        
        String graph = systemOutRule.getLog().replace("\r", "").trim();
        
        assertEquals("For each element of the array, print the same number of stars on each line as" +
                "\nthe value in the array. " +
                "\nMake sure your method works for any length array." +
                "\nSee example output in the instructions. ", expectedGraph, graph);
    }
    
}