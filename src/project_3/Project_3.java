//  Christopher Burt

//  Project_3

//




package project_3;

public class Project_3 
{

    public static void main(String[] args) 
    {
       int [][] numbers ={ {20, 40, 60 },{ 80, 90, 100},{120, 140, 160} };
       getTotal(numbers);
    }
   

    public static void getTotal(int[][] numbers)
    {
        int total = 0;
        
        for (int row = 0; row< numbers.length; row++)
        {
            for(int col = 0; col <numbers[row].length; col++)
                total += numbers[row][col];
        }
        
        System.out.println("The total of all of the values inthe array is: " + total);
    }
    
}


