import java.util.Scanner;
public class MultiplicaNombresAleatoris{
	public static void main(String[]args){
		Scanner teclat = new Scanner(System.in);
		int a,b,numUser;
		a = (int) (Math.random()*10);
		b = (int) (Math.random()*10);
		System.out.println("Quant és " + a + " x " + b + "?");
		numUser = teclat.nextInt();

		if (a*b == numUser)
			System.out.println("Correcte!");
		else
			System.out.println("Malament! Estudia mes!");	

	}
}
