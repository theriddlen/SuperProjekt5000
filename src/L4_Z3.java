import java.util.*;
public class L4_Z3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class Kurier{
		private String surname,name,zipcode,city,street;
		private int no,flat;
		private boolean status;

		public static final int SURNAME=1;
		public static final int NAME=2;
		public static final int ZIP_CODE=3;
		public static final int CITY=4;
		public static final int STREET=5;
		public static final int NO=6;
		public static final int FLAT=7;

		
		public Kurier (){
			this("default","default","default","default","default",1,1,false);
		}
		public Kurier (String surname,String name,String zipcode,String city,String street, int no, int flat, boolean status){
			this.surname=surname;
			this.name=name;
			this.zipcode=zipcode;
			this.city=city;
			this.street=street;
			this.no=no;
			this.flat=flat;
			this.status=status;
		}
		
		
		public void set(int nr, String wartosc){
			switch (nr){
			case Kurier.SURNAME:	surname=wartosc;
			case Kurier.NAME:		name=wartosc;
			case Kurier.ZIP_CODE:	zipcode=wartosc;
			case Kurier.CITY:		city=wartosc;
			case Kurier.STREET:		street=wartosc;
			}
		}
		
		public void set(int nr, int wartosc){
			switch (nr){
			case Kurier.NO:			no=wartosc;
			case Kurier.FLAT:		flat=wartosc;
			}
		}
		
		public void send(){
			if(status==false){
				 System.out.println("WYSYŁANIE.... ZROBIONE!");
				 System.out.println("");

				 status=true;
			}
			else{
				 System.out.println("ERR: juz wysłana!");
				 System.out.println("");

			}
			}
		
		
		public String toString (){
			String wynik="";
			wynik+=name.charAt(0)+". "+surname+"\n";
			wynik+="ul. "+street+" "+no+" m. "+flat+"\n";
			wynik+=zipcode+" "+city+"\n";
			if(status!=true)
				wynik+="                        status: niewyslana"+"\n";
			if(status==true)
				wynik+="                        status: wyslana"+"\n";

			wynik+="\n";
			boolean status=true;
			
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
