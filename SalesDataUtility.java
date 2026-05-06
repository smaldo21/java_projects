/*
 * Class: CMSC203 
 * Instructor:Professor Grinberg
 * Description: This class provides algorithms that are able
 * to get specific info from the file provided.
 * Due: 5/5/2026
 * Platform/compiler: JVM
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Steffano Maldonado
*/

public class SalesDataUtility {
	
	
	/*
	The getTotal method works by first accessing rows and columns
	through for loops and then adding and setting the total variable to the new
	row and column accessed until it reaches the end 
	*/
	public static double getTotal(double[][] data)
	{
		double total = 0;
		
		for(int row = 0; row < data.length; row++)
		{
			for(int col = 0; col < data[row].length; col++)
			{
				total += data[row][col];
			}
		}
		return total;
	}
	
	/*
	The getAverage method first defines variables to keep track of the count of numbers and 
	sum, then creates for loops in order to access rows and columns, and finally the sum
	is set to the values of each row and the counter is incremented for every number in the
	jagged array. Then the avg is returned by dividing.
	  
	 */
	public static double getAverage(double[][] data)
	{
		double sum = 0;
		int counter = 0;
		
		for(int row = 0; row < data.length; row++)
		{
			for(int col = 0; col < data[row].length; col ++)
			{
				sum += data[row][col];
				counter ++;
			}
		}
		return sum/counter;
	}
	
	/*
	In order to get total of rows, access the rows through for loop and 
	set variable to zero before using it in the col loop which accesses
	the columns and prevents an error that would include columns with different
	numbers of columns.Then the row variable is set to the sum of the rows.
	 */
	public static double getRowTotal(double[][] data, int row)
	{
		
		double total = 0;
		
		for(int col = 0; col < data[row].length; col++)
		{
			total += data[row][col];
		}		
			
		return total;
	}
	
	
	/*
 	First define a variable that keeps count and then create a for loop that accesses the 
 	length of each row in the jagged array and if the col var inside the parameter is less
 	than the length of rows in the array, add the value in the specified column for the row
 	to total.
	 */
	public static double getColumnTotal(double[][] data, int col)
	{
		double total = 0; 
		
		for(int row = 0; row < data.length; row++)
		{
			if(col < data[row].length)
			{
				total += data[row][col];
			}
		}
		
		return total;
			
	}
	
	
	/*
	 This method first declares a high var which is set to the beginning of row and col.
	 Then, a for loop is created in order to traverse throughout the array and if the new
	 value is greater than the last, it gets replaced. 
	 */
	public static double getHighestInRow(double[][] data, int row)
	{
		double high = data[row][0];
		
		for(int col = 0; col < data[row].length; col++)
		{
			if(data[row][col] > high)
			{
				high = data[row][col];
			}
		}
		return high;
	}
	
	
	/*
	 This method will do the same as above, except the if statement line will read "<"
	 instead of ">" in order to determine the lowest val
	 */
	public static double getLowestInRow(double[][] data, int row)
	{
		
		double low = data[row][0];
		
		for(int col = 0; col < data[row].length; col++)
		{
			if(data[row][col] < low)
			{
				low = data[row][col];
			}
		}
		
		return low;
	}
	
	/*
	 In order to get the highest value in the array, a variable is set to an initial value
	 and then a for loop is created in order to access rows and another for columns. Then 
	 an if statement determines the highest value in both row and column and replaces the
	 highest value inside the max variable
	 */
	public static double getHighestInArray(double[][] data)
	{
		double max = data[0][0];
		
		for(int i = 0; i < data.length; i++)
		{
			for(int j = 0; j < data[i].length; j++)
			{
				if(data[i][j] > max)
				{
					max = data[i][j];
				}
			}
		}
		return max;
		
		
	}
	
	/*
	 This method does the same as above except the if statement is changed to "<" instead of
	 ">"
	 */
	public static double getLowestInArray(double[][] data)
	{
		
		double lowest = data[0][0];
		
		for(int i = 0; i < data.length; i++)
		{
			for(int j = 0; j < data[i].length; j++)
			{
				if(data[i][j] < lowest)
				{
					lowest = data[i][j];
				}
			}
		}
		return lowest;	
	}
}
