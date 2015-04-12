import java.util.*;
public class L3_Z1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner is=new Scanner(System.in);
		
		class Adres{
			private int nr_miesz, nr_dom;
			private String imie, nazwisko, kod, miasto, ulica;

			public Adres (String nazwisko, String imie, String kod, String miasto, String ulica, int nr_dom,int nr_miesz){
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
		
		Adres przesylka1= new Adres("Nowak","Jolanta","12-043","Krakow","Kopciuszka",12,34);
		Adres przesylka2= new Adres("Kowalski","Adam","80-217","Gdansk","Wyspianskiego",5,7);


System.out.println(przesylka1);

System.out.println(przesylka2);

		
	}


}
