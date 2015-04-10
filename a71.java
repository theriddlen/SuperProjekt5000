import java.util.*;
public class a71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner is=new Scanner(System.in);
		int oceny_liczba, powyzej = 0;
		double srednia = 0;
		
		
		System.out.println("liczba ocen:");
		oceny_liczba=is.nextInt();
		

		int oceny[];
		oceny=new int[oceny_liczba];
		
		
		for(int i=0;i<oceny_liczba;i++){
			if(oceny[i]<6 && oceny[i]>0){
			System.out.println("podaj ocenê "+(i+1)+":");
			oceny[i]=is.nextInt();
			srednia=srednia+oceny[i];
			}
			else
				System.out.println("Nieprawid³owa ocena");
			i=i-1;
			
			}
		srednia=srednia/oceny_liczba;
		System.out.println("srednia : "+srednia);

		for(int i=0;i<oceny_liczba;i++){
			if(oceny[i]>srednia)
				powyzej=powyzej+1;
			}
		System.out.println("powy¿ej : "+powyzej);

		
			}
		
		

	}


