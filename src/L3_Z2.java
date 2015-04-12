import java.util.*;
public class L3_Z2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner is=new Scanner(System.in);
	
		class Filizanka{
			private int sztuki;
			private String kolor;
			private double pojemnosc, cena; 


			public Adres (String kolor, double cena, double pojemnosc, 
					      int sztuki){
				this.nazwisko=nazwisko;
				this.imie=imie;
				this.kod=kod;
				this.miasto=miasto;
				this.ulica=ulica;
				this.nr_dom=nr_dom;
				this.nr_miesz=nr_miesz;
			}
			public String toString (){
				String wynik="";
				wynik+="---------------------------------"+"\n";
				wynik+=imie.charAt(0)+". "+nazwisko+"\n";
				wynik+="ul. "+ulica+" "+nr_dom+" m. "+nr_miesz+"\n";
				wynik+=kod+" "+miasto+"\n";
				wynik+="---------------------------------"+"\n";

				return wynik;
			}
		}
		
		
		  Filizanka f1=new Filizanka("szary",30.5, 0.5, 3);
		  Filizanka f2=new Filizanka("czerwony",15.0);
		  Filizanka f3=new Filizanka(12.5);

		  System.out.println(f1);





		  System.out.println(f2);





		  System.out.println(f3);

		
	}


}
