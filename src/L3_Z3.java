import java.util.*;
public class L3_Z3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner is=new Scanner(System.in);
	
		class Notatnik{
			private int kartki;
			private String wzor, format;


			public Notatnik (String wzor, String format, int kartki){
				this.wzor=wzor;
				this.format=format;
				this.kartki=kartki;
			}

			public Notatnik (String wzor){
			this(wzor,"A4",60);
		}
			public Notatnik (int kartki){
			this("w kratke","A4",kartki);
		}
			public Notatnik (){
			this("w kratke","A4",60);
		}
			public Notatnik (String format, String wzor){
			this(wzor,format,60);
		}
			public String toString (){
				String wynik="";
				wynik+="format: "+format+"\n";
				wynik+="liczba kartek: "+kartki+"\n";
				wynik+="zeszyt: "+wzor+"\n";
				wynik+="\n";

				return wynik;
			}
		}
		
		 Notatnik n1= new Notatnik();
		 Notatnik n2= new Notatnik("w linię");
		 Notatnik n3= new Notatnik(100);
		 Notatnik n4= new Notatnik("B5","czysty");


		 System.out.println(n1);




		 System.out.println(n2);




		 System.out.println(n3);




		 System.out.println(n4);

		
	}


}
