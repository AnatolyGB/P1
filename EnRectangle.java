import java.util.Scanner;
public class EnRectangle{
	public static void main(String[] args){
		Scanner teclat = new Scanner(System.in);
		float x1, y1, x2, y2, p1, p2;
		System.out.println("Escriu la coordenada x1");
		x1 = teclat.nextFloat();
		System.out.println("Escriu la coordenada y1");
		y1 = teclat.nextFloat();
		System.out.println("Escriu la coordenada x2");
		x2 = teclat.nextFloat();
		System.out.println("Escriu la coordenada y2");
		y2 = teclat.nextFloat();
		System.out.println("Escriu la coordenada del punt p1");
		p1 = teclat.nextFloat();
		System.out.println("Escriu la coordenada del punt p2");
		p2 = teclat.nextFloat();
		
		if (estaAlRectangle(x1, y1, x2, y2, p1, p2))
		  System.out.println("El punt P está dins del rectangle");
		else
		  System.out.println("El punt P no está dins del rectangle");
		
	}
	public static boolean estaAlRectangle(float x1, float y1, float x2, float y2, float p1, float p2){
	  return (x1 < p1 && p1 < x2 && y1 < p2 && x2 < p2);
	}
}
