
import java.util.Scanner;

public class TableOfPowers {
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Learn your squares and cubes!\n");
		
		String cont = "y";
		int squared;
		int cubed;
		
		
		do {
			System.out.println("Please enter a number: "); 
			int userNum = scan.nextInt();
			
			System.out.printf("Number   Squared    Cubed\n");
			System.out.printf("=====     =====     =====\n");
			
			for (int i = 1; i < userNum; i++) {
				squared = i * i;
				cubed = i * i * i;
				
				// display table of squares and cubes from 1 to the value entered
				System.out.printf("%3d %9d %9d%n", i, squared, cubed);
			}
			
			System.out.println();
			System.out.println("Continue? (y/n): ");
			cont = scan.next();
			
		} while ((cont.equalsIgnoreCase("y")) || (cont.equalsIgnoreCase("yes")));

		System.out.println("Goodbye!");
		
		scan.close();

	}


}