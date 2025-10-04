import java.util.Scanner;

public class Edat{
	public static void main(String[]args){
		Scanner teclat = new Scanner(System.in);
		int edatActual, anyNaixement, anyAmbEdatDoble;
		System.out.print("Quina és la teva edat el 31 de desembre del 2025?" );
		edatActual = teclat.nextInt();
		anyNaixement = 2025 - edatActual;
		anyAmbEdatDoble = 2025 + edatActual;
		System.out.println("Vas néixer l'any " + anyNaixement + ". L'any " + anyAmbEdatDoble + " tindras " + edatActual*2 + " anys");


		

	}

}
