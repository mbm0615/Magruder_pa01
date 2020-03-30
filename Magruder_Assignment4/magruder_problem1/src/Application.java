package src;

public class Application {

	public static void main(String[] args) {
		DuplicateRemover duplicateRemover = new DuplicateRemover();
		
		duplicateRemover.remove("magruder_problem1/"+"problem1.txt");
		duplicateRemover.write("magruder_problem1/"+"unique_words.txt");

	}

}
