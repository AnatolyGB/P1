import java.util.Scanner;
public class Maxof3{
	public static void main(String[] args){
		int a,b,c;
		Scanner teclat = new Scanner(System.in);
		System.out.println("Escriu el primer número: ");
		a = teclat.nextInt();
		System.out.println("Escriu el segon número: ");
		b = teclat.nextInt();
		System.out.println("Escriu el tercer número: ");
		c = teclat.nextInt();
		System.out.println("El valor maxim és " + valorMaxim(a,b,c));
	}

	public static int valorMaxim(int num1, int num2, int num3){
		int max;
		if (num1 >= num2 && num1 >= num3)
			max = num1;
		else if (num2 >= num1 && num2 >= num3)
			max = num2;
		else
			max = num3;
		return max;
		
	}
}
