package src.magruder_problem2;

public class Application {

	public static void main(String[] args) {
		DuplicateCounter duplicateCounter = new DuplicateCounter();
		duplicateCounter.count("magruder_problem2/"+"problem2.txt");
		duplicateCounter.write("magruder_problem2/"+"unique_word_counts.txt");

	}

}
