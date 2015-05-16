import java.util.*;
public class L4_Z4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class Kurier{
		private String surname,name,zipcode,city,street;
		private int no,flat;
		private boolean status, language;

		public static final int SURNAME=1;
		public static final int NAME=2;
		public static final int ZIP_CODE=3;
		public static final int CITY=4;
		public static final int STREET=5;
		public static final int NO=6;
		public static final int FLAT=7;
		public static final int ENG=8;
		public static final int PL=9;
		public static final int LANGUAGE=10;




		
		public Kurier (){
			this("default","default","default",1,1,"default","default",false, false);
		}
		public Kurier (String surname,String name,String street, int no, int flat,String zipcode, String city, boolean status, boolean language){
			this.surname=surname;
			this.name=name;
			this.zipcode=zipcode;
			this.city=city;
			this.street=street;
			this.no=no;
			this.flat=flat;
			this.status=status;
			this.language=language;

		}
		public Kurier (String surname,String name,String street, int no, int flat,String zipcode, String city){
			this.surname=surname;
			this.name=name;
			this.zipcode=zipcode;
			this.city=city;
			this.street=street;
			this.no=no;
			this.flat=flat;
			this.status=false;
			this.language=false;

		}
		
//		
//		public void set(int nr, String wartosc){
//			switch (nr){
//			case Kurier.SURNAME:	surname=wartosc;
//			case Kurier.NAME:		name=wartosc;
//			case Kurier.ZIP_CODE:	zipcode=wartosc;
//			case Kurier.CITY:		city=wartosc;
//			case Kurier.STREET:		street=wartosc;
//			}
//		}
//		
		public void set(int nr, int wartosc){
			switch (nr){
			case Kurier.NO:			no=wartosc;
			case Kurier.FLAT:		flat=wartosc;
			}
			if (wartosc==Kurier.ENG){
				language=true;
			}
			if (wartosc==Kurier.PL){
				language=false;
			}
		}
		
//		public void set(int nr, ){
//			switch (nr){
//			case Kurier.ENG:		language=true;
//			case Kurier.PL:			language=false;
//			}
//		}
		
		public void send(){
			if(language==false){
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
			else{
				if(status==false){
					 System.out.println("SENDING.... DONE!");
					 System.out.println("");

					 status=true;
				}
				else{
					 System.out.println("ERR: already sent!");
					 System.out.println("");

				}
				}
				
			
			}
		
		
		public String toString (){
			String wynik="";
			wynik+=name.charAt(0)+". "+surname+"\n";
			if(language==true)
			wynik+=no+" "+street+" Street, flat "+flat+"\n";
			if(language==false)
			wynik+="ul. "+street+" "+no+" m. "+flat+"\n";
			wynik+=zipcode+" "+city+"\n";
			if(language==false){
			if(status!=true)
				wynik+="                        status: niewyslana"+"\n";
			if(status==true)
				wynik+="                        status: wyslana"+"\n";
			}
			if(language==true){
			if(status!=true)
				wynik+="                        status: unsent"+"\n";
			if(status==true)
				wynik+="                        status: sent"+"\n";
			}
			
			wynik+="\n";			
			return wynik;
		}
		}
		
		 Kurier przesylka= new Kurier("Nowak","Jolanta","Kopciuszka",12,34,"12-043","Krakow");

System.out.println(przesylka);




przesylka.set(Kurier.LANGUAGE,Kurier.ENG);
System.out.println(przesylka);





przesylka.send();


System.out.println(przesylka);





przesylka.send();

przesylka.set(Kurier.LANGUAGE,Kurier.PL);
System.out.println(przesylka);





przesylka.send();
	}
}
