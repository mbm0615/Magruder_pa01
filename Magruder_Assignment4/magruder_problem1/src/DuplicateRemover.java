package src;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

	public class DuplicateRemover 
	{
		private ArrayList<String> uniqueWords = new ArrayList<String>();	
		public void remove(String dataFile)
		{
			File myFile = new File(dataFile);
			boolean Unique;
			
			try
			{
				Scanner reader = new Scanner(myFile);
				String temp;
				while (reader.hasNext())
				{
					Unique = true;
					temp = reader.next();
					for (int i = 0; i < uniqueWords.size(); i++)
					{
						if (temp.equalsIgnoreCase(uniqueWords.get(i)))
						{
							Unique = false;
						}
					}	
					if (Unique)
					{
						uniqueWords.add(temp);
					}
				}
			}
			catch(FileNotFoundException e)
			{
				System.out.println("File not found");
				System.exit(0);
			}
		}
		
		public void write(String outputFile)
		{
			File myFile = new File(outputFile);
			try 
			{
				FileWriter myWriter = new FileWriter(outputFile);
//				myFile.createNewFile();
				for (int i = 0; i < uniqueWords.size(); i++)
				{
					myWriter.write(uniqueWords.get(i) + " ");
				}
				myWriter.close();
			}
			catch (IOException e)
			{
				System.out.println("Error");
				System.exit(0);
			}
		}
	}
