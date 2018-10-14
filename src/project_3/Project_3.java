//  Christopher Burt

//  Project_3

//  This program creates a two-dimensional array and has multiple methods displaying different data associated with the array.

package project_3;

public class Project_3 
{
    //  Main method initializing test data and calling demonstrations of methods
    public static void main(String[] args) 
    {
       int [][] numbers ={ {20, 40, 60 },{ 80, 90, 100}, {120,140,160}};
       getTotal(numbers);
       getAverage(numbers);
       getRowTotal(numbers, 0);
       getColumnTotal(numbers,0);
       getHighestInRow(numbers,0);
       getLowestInRow(numbers,0);

    }
   
    // getTotal method accepts two dimensional array arg and returns the total of all values in the array
    public static int getTotal(int[][] numbers)
    {
        int total = 0;
        
        for (int row = 0; row< numbers.length; row++)
        {
            for(int col = 0; col <numbers[row].length; col++)
                total += numbers[row][col];
        }
                System.out.println("The total of all of the values inthe array is: " + total);
        return total;
    }
    
    // getAverage Method accepts array arg and returns the average of all of the values in the array
    public static int getAverage(int[][] numbers)
    {
        int average = 0;
        int total = 0;
        
         for (int row = 0; row< numbers.length; row++)
        {
            for(int col = 0; col <numbers[row].length; col++)
            total += numbers[row][col];
        }
        average = total / numbers.length;
        System.out.println("The average of all of the values in the array is: " + average);
        return average;
    }
    
    //  GetRowTotal Method accepts array argument and an int associated with the row subscript to be totaled
    public static int getRowTotal(int[][] numbers, int row) 
    {
    int total = 0;

    for (int col = 0; col < numbers[row].length; col++) 
    {
        total += numbers[row][col];
    }
    System.out.println("The total of row 0 is: " + total);
    return total;
}
    
//  getColumnTotal Method accepts array and subscript to be totaled and displays outcome    
public static int getColumnTotal(int[][] numbers, int col)
{
    int total = 0;

    for (int row = 0; row < numbers.length; row++) 
    {
        total += numbers[row][col];
    }
    System.out.println("The total of column 0 is: " + total);
    return total;    
}

//  getHighestInRow accepts the array as an arg and a subscript of a row to be searched for highest element value
public static int getHighestInRow(int[][] numbers, int row)
{
    int highest = numbers[row][0];

    for (int col = 1; col < numbers[row].length; col++) 
    {
        if (numbers[row][col] > highest)
        {
            highest = numbers[row][col];
        }
    }
    System.out.println("The highest in row 0 is: " + highest); 
    return highest;
}

//  getLowestInRow accepts array as an arg and a subscript of a row to be searched for the lowest element value 
public static int getLowestInRow(int[][] numbers, int row)
{
    int lowest = numbers[row][0];

    for (int col = 1; col < numbers[row].length; col++) 
    {
        if (numbers[row][col] < lowest)
        {
            lowest = numbers[row][col];
        }
     }
    System.out.println("The lowest in row 0 is: " + lowest); 
    return lowest;
}
}


