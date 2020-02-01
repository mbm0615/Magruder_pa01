import java.util.Scanner;

public class Application {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("what number would you like to encrypt\n");
		int n = input.nextInt();
		Encrypter.encrypt();
		System.out.print("what number would you like to decrypt\n");
		 n = input.nextInt();
		Decrypter.decrypt();
	}

}
