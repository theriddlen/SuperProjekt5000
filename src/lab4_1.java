import java.util.*;
public class lab4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner is=new Scanner(System.in);
		int n;
		
		System.out.println("  Podaj obstawiona liczbe: ");
		n=is.nextInt();
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ---------------------");
		System.out.println("  Hazardzisto (?) obstawi³es:");
		System.out.println("                      liczbê: "+n);		
		if (n%2==0)
			System.out.println("                       kolor: czerwony");
		else
			System.out.println("                       kolor: czarny");
			

	}

}
