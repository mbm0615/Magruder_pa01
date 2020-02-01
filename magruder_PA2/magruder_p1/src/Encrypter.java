

public class Encrypter {

public static void encrypt() {
// this breaks down the number into each component 
	int n = 1234;
	int a = n / 1000;
	int b = (n % 1000) / 100;
	int c = (n % 100) / 10;
	int d = n % 10;
	
	a= (a + 7) % 10;
	b= (b + 7) % 10;
	c= (c + 7) % 10;
	d= (d + 7) % 10;
	// this prints the number into different positions
	System.out.printf("%d%d%d%d\n",c,d,a,b);
}

	
	
	
	

}
