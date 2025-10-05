import java.util.Scanner;
public class EquacioSegonGrau{
	public static void main(String[]args){
		Scanner teclat = new Scanner(System.in);
		float a,b,c;
		double termeArrel, x1, x2;

		System.out.println("a: ");
		a = teclat.nextFloat();
		System.out.println("b: ");
		b = teclat.nextFloat();
		System.out.println("c: ");
		c = teclat.nextFloat();

		String equacio = a + "x² + " + b + "x + " + c + " = 0";

		termeArrel = Math.pow(b,2) - 4 * a * c;
		if (termeArrel < 0)
			System.out.println("L'equació " + equacio + " no té solucions reals.");
		else if (termeArrel == 0)
			System.out.println("La solució de l'equació " + equacio + " és " + (-b/2*a));
		else{
			x1 = (-b + Math.sqrt(termeArrel))/2*a;
			x2 = (-b - Math.sqrt(termeArrel))/2*a;
			System.out.println("L'equació " + equacio + " té com a solucions x = " + x1 + " i x = " + x2);
		}
		
		
	}
}
