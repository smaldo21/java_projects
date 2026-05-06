/*
 * Class: CMSC203 
 * Instructor:Professor Grinberg
 * Description: This class connects all the parts together
 * Due: 5/5/2026
 * Platform/compiler: JVM
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Steffano Maldonado
*/


import java.util.Scanner;
import java.io.IOException;

public class SalesAppDriver {

	public static void main(String[] args) throws IOException{
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Sales Data Processor");
		
		System.out.println("Get input file name: ");
		String fileName = keyboard.nextLine();
		
		double[][] salesData = SalesFileIO.readSalesData(fileName);
		
		System.out.println("Output file: ");
		String fileEnd = keyboard.nextLine();
		
		SalesFileIO.writeSummary(fileEnd, salesData);
		
		System.out.print("Summary written to " + fileEnd);
		
		keyboard.close();
	}

}
