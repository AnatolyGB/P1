import java.util.Scanner;
public class MinRectangle{
	public static void main(String[] args){
		Scanner teclat = new Scanner(System.in);
		float x1, x2, x3, x4, y1, y2, y3, y4;
		
		System.out.println("Escriu la coordenada x1 del primer rectangle");
		x1 = teclat.nextFloat();
		System.out.println("Escriu la coordenada y1 del primer rectangle");
		y1 = teclat.nextFloat();
		System.out.println("Escriu la coordenada x2 del primer rectangle");
		x2 = teclat.nextFloat();
		System.out.println("Escriu la coordenada y2 del primer rectangle");
		y2 = teclat.nextFloat();
		
		System.out.println("Escriu la coordenada x1 del segon rectangle");
		x3 = teclat.nextFloat();
		System.out.println("Escriu la coordenada y1 del segon rectangle");
		y3 = teclat.nextFloat();
		System.out.println("Escriu la coordenada x2 del segon rectangle");
		x4 = teclat.nextFloat();
		System.out.println("Escriu la coordenada y2 del segon rectangle");
		y4 = teclat.nextFloat();
		
		
		
		
		if (intersequen(x1, x2, x3, x4, y1, y2, y3, y4)){
		  System.out.println("Intersequen");
		}
		  
		else
		  System.out.println("Els dos rectangles no intersequen. No hi ha rectangle minim");
		
	}
	public static boolean intersequen(float x1, float x2, float x3, float x4, float y1, float y2, float y3, float y4){
	
	  return !(x3 > x2 || x1 > x4 || y3 > y2 || y1 > y4);
	}
}
