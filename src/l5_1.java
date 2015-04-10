import java.util.*;
public class l5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner is=new Scanner(System.in);
		int liczba, dodatnie=0, ujemne=0, thc=0, parz=0;
		do{
		System.out.print("Podaj liczbê: ");
		liczba=is.nextInt();
		
			if (liczba%2==0)
				parz++;
			if (liczba>=100 && liczba<1000 || liczba<=-100 && liczba>-1000)
				thc++;
			if (liczba>0)
				dodatnie++;
			if (liczba<0)
				ujemne++;
		}while (liczba!=0);
		System.out.println("dodatnie:"+dodatnie);
		System.out.println("ujemne:"+ujemne);
		System.out.println("trzycyfrowe:"+thc);
		System.out.println("parzyste:"+parz);
	}

}
