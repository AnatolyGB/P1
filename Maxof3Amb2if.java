import java.util.*;
public class Maxof3Amb2if{
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
		int[] valors = {num1, num2, num3};
		int max = valors[0];

		for (int i = 0; i < 3; i++){
			if (valors[i] > max){
				max = valors[i];
			}
		}
		return max;
	}
}
