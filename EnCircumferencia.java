import java.util.Scanner;

public class EnCircumferencia{
	public static void main(String[]args){
		float x,y, radi, p1,p2;
		Scanner teclat = new Scanner(System.in);
		System.out.println("Escriu la coordenada x del cercle");
		x = teclat.nextFloat();
		System.out.println("Escriu la coordenada y del cercle");
		y = teclat.nextFloat();
		System.out.println("Escriu el radi del cercle");
		radi = teclat.nextFloat();
		System.out.println("Ara escriu la coordenada x del punt P");
		p1 = teclat.nextFloat();
		System.out.println("Ara la coordenada y del punt P");
		p2 = teclat.nextFloat();
		if (dinsDelCercle(x,y, radi, p1, p2))
			System.out.println("El punt P está dins del cercle");
		else
			System.out.println("El punt P no está dins del cercle");


	}
	public static boolean dinsDelCercle(float x, float y, float r, float a, float b){
		double d = Math.sqrt(Math.pow(x-a,2) + Math.pow(y-b,2));
		return d < r;
	}
}
