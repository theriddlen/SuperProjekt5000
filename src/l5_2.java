import java.util.*;
public class l5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner is=new Scanner(System.in);
		int liczba=0, suma;
		do{
		System.out.print("Podaj liczbê: ");
		liczba=is.nextInt();
		suma=+liczba;
		
		}while (liczba!=100);
		System.out.println("dodatnie:"+suma);
	}

}
