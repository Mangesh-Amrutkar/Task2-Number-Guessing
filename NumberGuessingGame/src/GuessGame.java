import java.util.Scanner;

public class GuessGame 
{

	//Main Method
	public static void main(String[] args)
	{
		NumberGuess();
	}

	//Method for Number guess game
	public static void	NumberGuess()
	{
		System.out.println("Welcome to the number guessing game");
		System.out.println("-----------------------------------------------");
		System.out.println();
		int ch=0;

		do {
			Scanner sc=new Scanner(System.in);

			//Generating random number
			int number=1+(int)(100*Math.random());

			System.out.println("You have to guess the number within 5 trials.");

			int trials=5;
			int i;
			int score=0;

			for(i=0;i<trials;i++) {
				System.out.println("Guess the number:");
				int guess=sc.nextInt();

				if(number==guess) 
				{
					System.out.println("Yeah! You Guessed a correct number");
					score++;
					break;
				}


				else if(number>guess && i!=trials-1) 
				{
					System.out.println("The number is greater than your guess");
				}

				else if(number<guess && i!=trials-1) 
				{
					System.out.println("The number is less than your guess");
				}
				score++;

			}
			if(i==trials) 
			{
				System.out.println("Oops...Limit is reached");
				System.out.println("You failed to guess the number");
				System.out.println();
			}

			//printing the actual number
			System.out.println("The number was: "+number);
			System.out.println();

			//printing the score
			System.out.println("Your score is: "+score);
			System.out.println();

			//asking for more chance
			System.out.println("---------------------------------------------------------");
			System.out.println("Do you want to play the game again then press 1");
			ch=sc.nextInt();

		}while(ch==1);

	}



}
