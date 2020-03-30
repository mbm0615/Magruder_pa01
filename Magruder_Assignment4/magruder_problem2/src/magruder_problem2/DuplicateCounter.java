package src.magruder_problem2;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class DuplicateCounter 
{
	HashMap<String, Integer> wordCounter = new HashMap<>();
	public void count(String dataFile)
	{
		File myFile = new File(dataFile);
		try(Scanner reader = new Scanner(myFile);)
		{
			boolean isUnique;
			
			while (reader.hasNext())
			{
				isUnique = true;
				String temp = reader.next();
				temp = temp.toLowerCase();
				if (wordCounter.containsKey(temp))
				{
					isUnique = false;
					wordCounter.put(temp, wordCounter.get(temp) + 1);
				}
				if (isUnique)
				{
					wordCounter.put(temp, 1);
				}
			}
		}
		catch(IOException e)
		{
			System.out.println("Error: file not found");
			System.exit(0);
		}	
	}
	public void write(String outputFile)
	{
		File myFile = new File(outputFile);
		try(FileWriter myWriter = new FileWriter(outputFile);)
		{
			myFile.createNewFile();
			myWriter.write(wordCounter.toString());
		}
		catch(IOException e)
		{
			System.out.println("Error");
			System.exit(0);
		}
	}
}