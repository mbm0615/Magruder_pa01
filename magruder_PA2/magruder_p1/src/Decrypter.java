
public class Decrypter {
// this is able to break down the 4 digit number into seperate numbers
	public static void decrypt()	{
		int n = 189;
		int a = n / 1000;
		int b = (n % 1000) / 100;
		int c = (n % 100) / 10;
		int d = n % 10;
		
		a= (a + 3) % 10;
		b= (b + 3) % 10;
		c= (c + 3) % 10;
		d= (d + 3) % 10;
		// this prints the number back to its origional form
		System.out.printf("%d%d%d%d",c,d,a,b);
		
		
		
		
	}
	}

