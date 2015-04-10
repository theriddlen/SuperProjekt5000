import java.util.*;
public class CopyOfzmienne3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner is=new Scanner(System.in);
		int all, kids, cz_trw, cenadoby, cenaguide;
		
		System.out.println("         Liczba osob jadacych na wycieczke: ");
		all=is.nextInt();
		System.out.println("                              w tym dzieci: ");
		kids=is.nextInt();
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("              Liczba dni trwania wycieczki: ");
		cz_trw=is.nextInt();
		System.out.println("                    Koszt 1 doby hotelowej: ");
		cenadoby=is.nextInt();
		System.out.println("          Koszt dot. przewodnika (1 dzien): ");
		cenaguide=is.nextInt();
		System.out.println(" ");
		System.out.println("        -------------------------------------------");
		System.out.println("          Koszty:");
		System.out.println("           --> za nocleg osob doroslych: "+((all-kids)*(cz_trw*cenadoby)));
		//System.out.println("           --> za nocleg dzieci: 1260 zl"+(kids*(cz_trw*(cenadoby*0.7))));
		//System.out.println("           --> zw. z przewodnikiem: 200 zl"+((cz_trw-2)*cenaguide));
		//System.out.println("        -------------------------------------------");
		//System.out.println("          LACZNY KOSZT: "+((all-kids)*(cz_trw*cenadoby))+(kids*(cz_trw*(cenadoby*0.7)))+((cz_trw-2)*cenaguide));
		//System.out.println("        -------------------------------------------");

	}

}
