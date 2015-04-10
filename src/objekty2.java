import java.util.*;
public class objekty2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class Przedmiot{
			private int godz1, godz2;
			private String skrot, dzien1, dzien2, nazwa;

			public void ustawSkrot (String s){
				skrot=s;
			}
			public void ustawNazwa (String n){
				nazwa=n;
			}
			public void ustawKiedy (String d1, String d2){
				dzien1=d1;
				dzien2=d2;
			}
			public void ustawLiczbaGodzin (int lg1, int lg2){
				godz1=lg1;
				godz2=lg2;
			}
	
			public void wyswietl (){
				System.out.println("        PRZEDMIOT: "+nazwa+" ("+skrot+")");
				System.out.println(" l. godz. wykładu: "+godz1+" ("+dzien1+")");
				System.out.println(" l. godz. cwiczen: "+godz2+" ("+dzien2+")");
				System.out.println();


				}
			}
		
		 Przedmiot p1= new Przedmiot();
		 Przedmiot p2= new Przedmiot();

		 p1.ustawSkrot("PPJ");
		 p1.ustawNazwa("Podstawy programowania w Javie");
		 p1.ustawLiczbaGodzin(2,4);
		 p1.ustawKiedy("wtorek", "wtorek");

		 p2.ustawSkrot("XYZ");
		 p2.ustawNazwa("Wstep do magii");
		 p2.ustawLiczbaGodzin(1,5);
		 p2.ustawKiedy("czwartek", "sobota");


		 p1.wyswietl();




		 p2.wyswietl();
		
		
	}


}
