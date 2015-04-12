import java.util.*;
public class objekty1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner is=new Scanner(System.in);

		
		class Zeszyt{
			private int liczbakartek;
			private String format, papier;

			public void ustawFormat (String f){
				format=f;
			}
			public void ustawLiczbaKartek (int k){
				liczbakartek=k;
			}
			public void ustawPapier (String p){
				papier=p;
			}
			public void wyswietl (){
				System.out.println(" format: "+format);
				System.out.println(" liczba kartek: "+papier);
				System.out.println(" zeszyt: "+liczbakartek);
				System.out.println();


				}
			}
		
			 Zeszyt z1= new Zeszyt();
			 Zeszyt z2= new Zeszyt();
			 Zeszyt z3= new Zeszyt();

			 z1.ustawFormat("A4");
			 z1.ustawLiczbaKartek(100);
			 z1.ustawPapier("w kratkę");

			 z2.ustawFormat("B5");
			 z2.ustawLiczbaKartek(80);
			 z2.ustawPapier("w linię");

			 z3.ustawFormat("A3");
			 z3.ustawLiczbaKartek(32);
			 z3.ustawPapier("czysty");


			 z1.wyswietl();



			 z2.wyswietl();



			 z3.wyswietl();
		
		
	}


}
