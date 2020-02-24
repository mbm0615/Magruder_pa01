package src;
import java.security.SecureRandom;
import java.util.Scanner;
public class CAI5 {
	private final int NUMBER_Q = 10;
	private int number1;
	private int number2;
	private int answer;
	private int response;
	private int correct_ans;
	private double percentage;
	private int difficulty;
	private int prob;
	private SecureRandom rand = new SecureRandom();
	private Scanner stdin = new Scanner(System.in);
	private void readDifficulty()
	{
		int choice;
		
		System.out.println("Enter a difficulty level from 1 to 4.");
		do
		{
			choice = stdin.nextInt();
			
			if (choice < 1 || choice > 4)
			{
				System.out.println("Enter a number from 1 to 4.");
			}
		} while (choice < 1 || choice > 4);
		
		difficulty = choice;
	}
	private void generateQuestionArgument()
	{
		switch(difficulty)
		{
		case 1:
			// range of 0-9 inclusive
			number1 = rand.nextInt(10);
			number2 = rand.nextInt(10);
			break;
		case 2:
			// range of 0-99 inclusive
			number1 = rand.nextInt(100);
			number2 = rand.nextInt(100);
			break;
		case 3:
			// range of 0-999 inclusive
			number1 = rand.nextInt(1000);
			number2 = rand.nextInt(1000);
			break;
		case 4:
			// range of 0-9999 inclusive
			number1 = rand.nextInt(10000);
			number2 = rand.nextInt(10000);
			break;
		default:
		}
	}
	private void readProblemType()
	{
		int problem;
		
		System.out.println("Choose what type of problem you would like to solve:");
		System.out.println("1 - Addition");
		System.out.println("2 - Multiplication");
		System.out.println("3 - Subtraction");
		System.out.println("4 - Division");
		System.out.println("5 - Mixed");
		
		do
		{
			problem = stdin.nextInt();
			
			if (problem < 1 || problem > 5)
			{
				System.out.println("Please enter a number from 1 to 5.");
			}
		} while (problem < 1 || problem > 5);
		prob = problem;
	}
	private void askQuestion()
	{
		switch(prob)
		{
		// Addition problems
		case 1:
			answer = number1 + number2;
			System.out.println("How much is " + number1 + " plus " + number2 + "?");
			break;
			
		// Multiplication problems
		case 2:
			answer = number1 * number2;
			System.out.println("How much is " + number1 + " times " + number2 + "?");
			break;
			
		// Subtraction problems
		case 3:
			answer = number1 - number2;
			System.out.println("How much is " + number1 + " minus " + number2 + "?");
			break;
			
		// Division problems
		case 4:
			while (number2 == 0)
			{
				generateQuestionArgument();
			}

			number1 += number2 - (number1 % number2);
			
			answer = number1 / number2;
			System.out.println("How much is " + number1 + " divided by " + number2 + "?");
			break;

		case 5:
			int temp = prob;
			prob = rand.nextInt(4) + 1;
			askQuestion();
			prob = temp;
			break;
		default:
		}
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
			readDifficulty();
			readProblemType();
			for (int i = 0; i < NUMBER_Q; i++)
			{
				generateQuestionArgument();
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
	public static void main(String[] args) {
CAI5 student = new CAI5();
		student.quiz();

	}

}
