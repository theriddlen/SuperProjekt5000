import java.util.*;
public class L3_Z5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner is=new Scanner(System.in);
	
		class Rachunek{
			private double oplata;
			private String nazwa;


			public Rachunek (String nazwa, double oplata){
				this.nazwa=nazwa;
				this.oplata=oplata;
			}
			public Rachunek (){
				this("pizza?",0);
			}
			public void dodaj (double c){
				oplata=oplata+c;
			}
			
			public String toString (){
				
				String oplata_s;
				int oplata_dlugosc;
				int oplata_int = (int)oplata;
				oplata_s=""+oplata_int;
				oplata_dlugosc=oplata_s.length();
				double oplata_reszta;
				oplata_reszta=(oplata-oplata_int)*100;
				
				
				String wynik="";
				wynik+=" Rachunek za: "+nazwa+"\n";
				wynik+="    wysokosc:";
				
				int licznik = 0;
				String wyswietlone = " ";

				do{
					if(oplata>=1){
					String oplata_cyfra;
					oplata_cyfra=""+oplata_s.charAt(licznik);
					
					if(oplata_cyfra.equals("1")){
						wyswietlone=wyswietlone+"jed";	
						if(licznik!=oplata_dlugosc-1)
							wyswietlone=wyswietlone+"*";				
						}
					if(oplata_cyfra.equals("2")){
						wyswietlone=wyswietlone+"dwa";	
						if(licznik!=oplata_dlugosc-1)
							wyswietlone=wyswietlone+"*";				
						}
					if(oplata_cyfra.equals("3")){
						wyswietlone=wyswietlone+"trz";	
						if(licznik!=oplata_dlugosc-1)
							wyswietlone=wyswietlone+"*";				
						}
					if(oplata_cyfra.equals("4")){
						wyswietlone=wyswietlone+"czt";	
						if(licznik!=oplata_dlugosc-1)
							wyswietlone=wyswietlone+"*";				
						}
					if(oplata_cyfra.equals("5")){
						wyswietlone=wyswietlone+"pie";	
						if(licznik!=oplata_dlugosc-1)
							wyswietlone=wyswietlone+"*";				
						}
					if(oplata_cyfra.equals("6")){
						wyswietlone=wyswietlone+"sze";	
						if(licznik!=oplata_dlugosc-1)
							wyswietlone=wyswietlone+"*";				
						}
					if(oplata_cyfra.equals("7")){
						wyswietlone=wyswietlone+"sie";	
						if(licznik!=oplata_dlugosc-1)
							wyswietlone=wyswietlone+"*";				
						}
					if(oplata_cyfra.equals("8")){
						wyswietlone=wyswietlone+"osi";	
						if(licznik!=oplata_dlugosc-1)
							wyswietlone=wyswietlone+"*";				
						}
					if(oplata_cyfra.equals("9")){
						wyswietlone=wyswietlone+"dzie";	
						if(licznik!=oplata_dlugosc-1)
							wyswietlone=wyswietlone+"*";				
						}
					if(oplata_cyfra.equals("0")){
						wyswietlone=wyswietlone+"zer";	
						if(licznik!=oplata_dlugosc-1)
							wyswietlone=wyswietlone+"*";				
						}
					}
					else{
					wyswietlone=" zer";
					}
				      licznik++;
				}while (licznik!=oplata_dlugosc);
				
				wynik+=wyswietlone;
				if(oplata_reszta>0){
					wynik+="*"+(int)oplata_reszta+"/100";
				}
				wynik+=" zl";
				wynik+="\n";

				return wynik;
			}
		}
		
		  Rachunek r1= new Rachunek("gaz",135.59);
		  Rachunek r2= new Rachunek("elektrycznosc",99.0);    


		  System.out.println(r1);


		  System.out.println(r2);


		  r1.dodaj(6.41);

		  r2.dodaj(1.78);


		  System.out.println(r1);


		  System.out.println(r2);
		 



		  Rachunek r3= new Rachunek();    
		  System.out.println(r3);


		
	}


}
