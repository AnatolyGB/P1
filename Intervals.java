import java.util.Scanner;
public class Intervals{
	public static void main(String[] args){
		Scanner teclat = new Scanner(System.in);
		float x1, x2, y1, y2;
		System.out.println("Escriu numero x1");
		x1 = teclat.nextFloat();
		System.out.println("Escriu numero x2");
		x2 = teclat.nextFloat();
		System.out.println("Escriu numero y1");
		y1 = teclat.nextFloat();
		System.out.println("Escriu numero y2");
		y2 = teclat.nextFloat();
		if (intersequen(x1,x2,y1,y2))
		  System.out.println("Intersequen");
		else
		  System.out.println("No intersequen");
	}
	public static boolean intersequen(float x1, float x2, float y1, float y2){
	  return (y1 > x1 && y1 < x2) || (x1 > y1 && x1 < y2);

	}

}
