import java.util.*;
public class lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner is=new Scanner(System.in);
		int teeth, lenght, width;
	
		
		
		System.out.println("   Podaj liczbe zebow w grabiach: ");
		teeth=is.nextInt();
		while (teeth<=1)
		{
		System.out.println("   Nieprawidlowa liczba");
		System.out.println("   Podaj poprawna ilosc: ");
		teeth=is.nextInt();
		};
		
		System.out.println("   Podaj dlugosc zeba: ");
		lenght=is.nextInt();
		while (lenght<1)
		{
		System.out.println("   Nieprawidlowa dlugosc");
		System.out.println("   Podaj poprawna liczbe: ");
		lenght=is.nextInt();
		};

		System.out.println(" ");
		System.out.println("   Zamowione grabie:");

	width=((teeth-1)*6)+1;
	
			int n=0;
	    //  System.out.println(width); testowo
	      	do{
			int in=0;
				do{
			      System.out.print(" ");
			      in++;
				}while (in!=(width/2));
			System.out.println("*");
			n++;
			}while (n!=lenght);   	
	      	
	      	
		n=0;
		do{
			System.out.print("*");
			n++;
		}while (n!=width);
		System.out.println("");

		
		int n2=0;
		do{
				n=0;
				do{
					System.out.print("*     ");
					n++;
				}while (n!=(teeth-1));
				System.out.println("*");
		n2++;
		}while (n2!=lenght);


	}


}
