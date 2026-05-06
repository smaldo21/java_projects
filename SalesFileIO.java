/*
 * Class: CMSC203 
 * Instructor:Professor Grinberg
 * Description: This class provides file reading structure
 * Due: 5/5/2026
 * Platform/compiler: JVM
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Steffano Maldonado
*/

import java.io.*;
import java.util.Scanner;

public class SalesFileIO {
	
public static double[][]readSalesData(String filename) throws FileNotFoundException{
		
	int rowCount = 0;
	
	Scanner scanner = new Scanner(new File(filename));
	
	//While loop reads next line from file
	while(scanner.hasNextLine())
	{
		if(!scanner.nextLine().isEmpty())
		{
			rowCount++;
		}
	}
	scanner.close();
	
	//Create new 2D array with the number of rows found
	double[][] data = new double[rowCount][];
	
	//Read file again
	Scanner dataScanner = new Scanner(new File(filename));
	int currentRow = 0;
	
	//While loop to check for lines
	while(dataScanner.hasNextLine())
	{
		//Scans lines and removes trailing whitespace
		String line = dataScanner.nextLine().trim();
		
		if(line.isEmpty()) continue;
		
		//Splitting on spaces
		String[] tokens = line.split(" ");
		
		//Prepares space to convert tokens to doubles
		data[currentRow] = new double[tokens.length];
		
		//Use for loop in order to access every token and
		//convert it into a double
		for(int i = 0; i < tokens.length; i++)
		{
			data[currentRow][i] = Double.parseDouble(tokens[i]);
		}
		
		currentRow++;
	}
	dataScanner.close();
	
	return data;
}



public static void writeSummary(String filename, double[][]data) throws IOException{
	
	PrintWriter writer = new PrintWriter(new FileWriter(filename));
	
	writer.println("Sales Report");
	
	//Use methods from SalesDataUtility in order to get specific data
	double total = SalesDataUtility.getTotal(data);
	double avgSales = SalesDataUtility.getAverage(data);
	double highest = SalesDataUtility.getHighestInArray(data);
	double lowest = SalesDataUtility.getLowestInArray(data);
	
	writer.println("Total Sales " + total);
	writer.println("Avg Daily Sales: " + avgSales);
	writer.println("Highest Sale: " + highest);
	writer.println("Lowest Sale" + lowest);
	
	//Traverses through each department and gets the total
	for(int i = 0; i < data.length; i++)
	{
		double rowTotal = SalesDataUtility.getRowTotal(data, i);
		writer.println("Department " + i + " Total: " + rowTotal);
	}
	
	writer.close();
	
	}
}
