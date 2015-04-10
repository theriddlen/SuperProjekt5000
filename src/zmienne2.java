import java.util.*;


public class zmienne2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner calc=new Scanner(System.in);
		int liczba1, liczba2;
		
		System.out.println(" Podaj pierwsza liczbe: ");
		liczba1=calc.nextInt();
		System.out.println("    Podaj druga liczbe: ");
		liczba2=calc.nextInt();

		System.out.println("             Suma podanych liczb wynosi: "+(liczba1+liczba2));
		System.out.println("          Roznica podanych liczb wynosi: "+(liczba1-liczba2));
		System.out.println(" Suma odwrotnosci podanych liczb wynosi: "+((1.0/liczba1)+(1.0/liczba2)));
	}

}
