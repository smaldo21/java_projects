import java.util.Scanner;

public class MovieDriverTask2 {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		//object
		Movie movie = new Movie();
		
		//movie title
		System.out.println("Enter title of movie:");
		String title = keyboard.nextLine();	
		movie.setTitle(title);
		
		
		//movie rating
		System.out.println("Enter movie rating:");
		String rating = keyboard.nextLine();
		movie.setRating(rating);
		
		
		//# of tix sold 
		System.out.println("Enter number of tickets sold for this movie:");
		int tickets = keyboard.nextInt();
		movie.setSoldTickets(tickets);
				
		System.out.print(movie.toString());
		
		keyboard.nextLine();
		
		System.out.println("\nDo you want to enter another? (y or n)");
		String another = keyboard.nextLine();
		
		while(another.equals("y"))
		{
			//movie title
			System.out.println("Enter title of movie:");
			title = keyboard.nextLine();	
			movie.setTitle(title);
			
			
			//movie rating
			System.out.println("Enter movie rating:");
			rating = keyboard.nextLine();
			movie.setRating(rating);
			
			
			//# of tix sold 
			System.out.println("Enter number of tickets sold for this movie:");
			tickets = keyboard.nextInt();
			movie.setSoldTickets(tickets);
			
			keyboard.nextLine();
			
			
			System.out.print(movie.toString());
			
			System.out.println("\nDo you want to enter another? (y or n)");
			another = keyboard.nextLine();

		}
		
		keyboard.close();

		
	}

}