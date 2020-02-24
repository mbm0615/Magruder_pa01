package src;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 {
	private int number1;
	private int number2;
	private int answer;
	private int response;
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
	public void quiz()
	{
		askQuestion();
		do
		{
			readResponse();
			if (isAnswerCorrect() == true)
			{
				displayCorrectResponse();
			}
			else
			{
				displayIncorrectResponse();
			}
		} while(isAnswerCorrect() == false);
	}
	
	public static void main(String[] args) {
CAI2 student = new CAI2();
		student.quiz();

	}

}
