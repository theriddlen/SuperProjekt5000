import java.util.*;
public class L4_Z3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class Kurier{
		private String surname,name,zipcode,city,street;
		private int no,flat;
		public static final int SURNAME=1;
		public static final int NAME=2;
		public static final int ZIP_CODE=3;
		public static final int CITY=3;
		public static final int STREET=3;
		public static final int NO=3;
		public static final int FLAT=3;

		
		public Kurier (String surname,String name,String zipcode,String city,String street){
			this(szerokosc,wysokosc,Rectangle.WYMIARY);
		}
		public Kurier (int szerokosc, int wysokosc, int show){
			this.szerokosc=szerokosc;
			this.wysokosc=wysokosc;
			this.show=show;
		}

		public void ustawCoWyswietlac(int nr){
			switch (nr){
			case Rectangle.OBWOD:	this.show=nr;
			case Rectangle.WYMIARY:	this.show=nr;
			}
		}
		
		public String toString (){
			int pole, obwod;
			pole=szerokosc*wysokosc;
			obwod=(szerokosc+wysokosc)*2;
			String wynik="";
			if (show==Rectangle.WYMIARY){
			wynik+=" Szerokosc: "+szerokosc+"\n";
			wynik+=" Wysokosc: "+wysokosc+"\n";
			}
			if (show==Rectangle.POLE){
			wynik+=" Pole:"+pole+"\n";
			}
			if (show==Rectangle.OBWOD){
			wynik+=" Obwod:"+obwod+"\n";
			}
			wynik+="\n";

			return wynik;
		}
		}
		
		Kurier przesylka= new Kurier();

		 przesylka.set(Kurier.SURNAME,"Nowak");
		 przesylka.set(Kurier.NAME,"Jolanta");
		 przesylka.set(Kurier.ZIP_CODE,"12-043");
		 przesylka.set(Kurier.CITY,"Krakow");
		 przesylka.set(Kurier.STREET,"Kopciuszka");
		 przesylka.set(Kurier.NO,12);
		 przesylka.set(Kurier.FLAT,34);

		 System.out.println(przesylka);





		 przesylka.send();


		 System.out.println(przesylka);





		 przesylka.send();
	}
}
