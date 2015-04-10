import java.util.*;
public class lab22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner is=new Scanner(System.in);
		int width, lenght, distance, post_number, perimeter;
		double price_fence, price_post;
		
		
		System.out.println("  Podaj szerokosc dzialki: ");
		width=is.nextInt();
		System.out.println("  Podaj dlugosc dzialki: ");
		lenght=is.nextInt();
		System.out.println("  Co ile umiescic slupek: ");
		distance=is.nextInt();
		System.out.println("  Podaj cene 1 m siatki: ");
		price_fence=is.nextDouble();
		System.out.println("  Podaj cene slupka: ");
		price_post=is.nextDouble();
		perimeter=(2*width+2*lenght);
		System.out.println("  Powierzchnia gruntu: "+width*lenght+"m^2");
		System.out.println("  Potrzebna liczba metrow siatki: "+perimeter+" m. biezacych   ");
		
		int posts_lenght, posts_width;
		
		posts_lenght=2+(2*(lenght/distance));
		if (lenght%distance==0)
			posts_lenght=posts_lenght-2;
		
		
		posts_width=2+(2*(width/distance));
		if (width%distance==0)
			posts_width=posts_width-2;
		
		post_number=(posts_width+posts_lenght);
		
		System.out.println("  Potrzebna liczba dlug: "+posts_lenght+" sztuk");
		System.out.println("  Potrzebna liczba szer: "+posts_width+" sztuk");

		System.out.println("  Potrzebna liczba slupkow: "+post_number+" sztuk");
		System.out.println("  ----------------------------------");
		System.out.println("  Cena siatki: "+1.0*perimeter*price_fence+" zl");
		System.out.println("  Cena slupkow: "+1.0*post_number*price_post+" zl");
		System.out.println("  ----------------------------------");
		System.out.println("  KOSZT OGRODZENIA: "+((1.0*perimeter*price_fence)+(1.0*post_number*price_post))+" zl");


	}


}
