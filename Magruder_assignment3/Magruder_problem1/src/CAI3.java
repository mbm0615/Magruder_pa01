package src;
import java.security.SecureRandom;
import java.util.Scanner;
public class CAI3 {
	private final int NUMBER_Q = 10;
	private int number1;
	private int number2;
	private int answer;
	private int response;
	private int correct_ans;
	private double percentage;
	private SecureRandom rand = new SecureRandom();
	private Scanner stdin = new Scanner(System.in);
	
	private void askQuestion()
	{
		// Random numbers from 0-9 inclusive
		number1 = rand.nextInt(10);
		number2 = rand.nextInt(10);
		
		// Calculates answer and stores in instance variable
		answer = number1 * number2;
		
		// Outputs question to screen
		System.out.println("what is " + number1 + " times " + number2 + "?");
	}
	private void readResponse()
	{
		response = stdin.nextInt();
	}
	
	private boolean isAnswerCorrect()
	{
		if (answer == response)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private void displayCorrectResponse()
	{
		int choice = rand.nextInt(4);
		switch(choice)
		{
		case 0:
			System.out.println("Very good!");
			break;
		case 1:
			System.out.println("Excellent!");
			break;
		case 2:
			System.out.println("Nice work!");
			break;
		case 3:
			System.out.println("Keep up the good work!");
			break;
		default:
			
			break;
		}
	}
	
	private void displayIncorrectResponse()
	{
		int choice = rand.nextInt(4);
		switch(choice)
		{
		case 0:
			System.out.println("No. Please try again.");
			break;
		case 1:
			System.out.println("Wrong. Try once more.");
			break;
		case 2:
			System.out.println("Don't give up!");
			break;
		case 3:
			System.out.println("No. Keep trying.");
			break;
		default:
	
			break;
		}
	}
	
	private void displayCompletionMessage()
	{
		percentage = (double)correct_ans/NUMBER_Q;
		System.out.printf("You scored a %.0f%%.\n", percentage * 100);
		
		if (percentage < 0.75)
		{
			System.out.println("Please ask your teacher for extra help.");
		}
		else
		{
			System.out.println("Congratulations, you are ready to go to the next level!");
		}
	}
	
	public void quiz()
	{	
		char choice;
		
		do
		{
			correct_ans = 0;	
			for (int i = 0; i < NUMBER_Q; i++)
			{
				askQuestion();
				readResponse();
				if (isAnswerCorrect() == true)
				{
					correct_ans++;
					displayCorrectResponse();
				}
				else
				{
					displayIncorrectResponse();
				}
			}
			
			displayCompletionMessage();
			
			System.out.println("Would you like to solve another set of problems? (Y/N)");
			choice = stdin.next().charAt(0);
		} while(choice == 'y' || choice == 'Y');
	}
	public static void main(String[] args)
	{
		CAI3 student = new CAI3();
		
		student.quiz();
	}
}
