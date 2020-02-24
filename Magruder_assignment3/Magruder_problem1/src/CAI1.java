package src;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 {
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
	// reads the users response
	private void readResponse()
	{
		response = stdin.nextInt();
	}
	// tells if the answer is correct
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
	// if correct it prints this
	private void displayCorrectResponse()
	{
		System.out.println("Very good!");
	}
	// if wrong it prints this 
	private void displayIncorrectResponse()
	{
		System.out.println("No. Please try again.");
	}
	// basically gives the quiz
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
	// main 
	public static void main(String[] args) {
CAI1 student = new CAI1();
		student.quiz();

	}

}
