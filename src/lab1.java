import java.util.*;
public class lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner is=new Scanner(System.in);
		 
		
	class Zeszyt{
		private int LiczbaKartek;
		private String Format, Papier;

		public void ustawFormat (String f){
			Format=f;
		}
		public void ustawLiczbaKartek (int k){
			LiczbaKartek=k;
		}
		public void ustawPapier (String p){
			Papier=p;
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
