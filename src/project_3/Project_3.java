//  Christopher Burt

//  Project_3

//




package project_3;

public class Project_3 
{

    public static void main(String[] args) 
    {
       int [][] numbers ={ {20, 40, 60 },{ 80, 90, 100}, {120,140,160}};
       getTotal(numbers);
       getAverage(numbers);
       getRowTotal(numbers, 0);
       getColumnTotal(numbers,0);

    }
   

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
     
    public static int getRowTotal(int[][] numbers, int row) 
    {
    int total = 0;

    for (int col = 0; col < numbers[row].length; col++) 
    {
        total += numbers[row][col];
    }
    System.out.println("  The total of row 0 is: " + total);
    return total;
}
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


}


