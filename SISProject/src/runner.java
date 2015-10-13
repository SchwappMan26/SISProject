import java.util.Scanner;


public class runner
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
			System.out.println("What would you like to do?");
			System.out.println("    (1) Add or Delete Student");
			System.out.println("    (2) Change Student Grade or Schedule");
			System.out.println("    (3) Sort Students");
			int choice = userInput.nextInt();
			if(choice == 1)
				{
					System.out.println("This is add or delete student");
				}
			if(choice == 2)
				{
					System.out.println("Change students grade or schedule");
				}
			if(choice == 3)
				{
					System.out.println("Sort students");
				}
			}

	}
