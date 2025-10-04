import java.util.*;

public class Digit{
	public static void main(String[] args){
		int num;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriu un numero");
		num = teclado.nextInt();

		if (esDigit(num)){
			System.out.println("Aquest numero te una xifra");
		}
		else{
			System.out.println("Aquest numero te més d'una xifra");
		}

		
		
	
	}

	public static boolean esDigit(int a){
		return ((0 <= a) && (a<= 9));
	}



}
