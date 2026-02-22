import java.util.Scanner;
public class MovieDriverTask1 {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		//object
		Movie movie = new Movie();
		
		//movie title
		//String title = keyboard.nextLine();	
		System.out.println("Enter title of movie: ");
		String title = keyboard.nextLine();	
		movie.setTitle(title);
		
		keyboard.nextLine();
		
		//movie rating
		System.out.println("Enter movie rating: ");
		String rating = keyboard.nextLine();
		movie.setRating(rating);
		
		keyboard.nextLine();
		
		//# of tix sold 
		System.out.println("Enter number of tickets sold for this movie: ");
		int tickets = keyboard.nextInt();
		movie.setSoldTickets(tickets);
		
		keyboard.close();
		
		System.out.print(movie.toString());

	}

}
