import java.util.*;
public class objekty5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class Ulamek{
			private int licznik, mianownik, przod, reszta, przod_dlugosc, mianownik_dlugosc;
			private String przod_zamiana, mianownik_string;
			private Double wynik;


			public void ustawLicznik (int l){
				licznik=l;
			}
			public void ustawMianownik (int m){
				mianownik=m;
			}
			
			public void wyswietl (){
				przod=licznik/mianownik;
				reszta=licznik-(przod*mianownik);
				przod_zamiana=""+przod;
				przod_dlugosc=przod_zamiana.length();
				wynik=1.0*licznik/mianownik;
				
if(reszta!=0){
				System.out.print("    ");
				int licznik = 0;
					do{
				      System.out.print(" ");
				      licznik++;
					}while (licznik!=przod_dlugosc);
				System.out.println(reszta);
			}

				//zamiana na stringa i liczenie
				mianownik_string=""+mianownik;
				mianownik_dlugosc=mianownik_string.length();
				
				
				//brak calości
				if(przod==0){
				System.out.print("  "+" "+"  ");
				int licznik3 = 0;
				do{
				      System.out.print("-");
				      licznik3++;
				}while (licznik3!=mianownik_dlugosc);
			      System.out.print(" = "+wynik);

			      System.out.println();
				}
				


				if(przod!=0){
				System.out.print("  "+przod+"  ");
				int licznik3 = 0;
				do{
					if(reszta!=0){
				      System.out.print("-");
					}
				      licznik3++;
				}while (licznik3!=mianownik_dlugosc);
			      System.out.print(" = "+wynik);

			      System.out.println();
				}
				
				if(reszta!=0){
				System.out.print("    ");
				int licznik2 = 0;
				do{
					if(reszta!=0){
				      System.out.print(" ");
					}
				      licznik2++;
					
				}while (licznik2!=przod_dlugosc);
				System.out.println(mianownik);
				}
			}
		}
		
		   Ulamek u1=new Ulamek();
		   Ulamek u2=new Ulamek();

		   u1.ustawLicznik(3);
		   u1.ustawMianownik(5);

		   u2.ustawLicznik(142);
		   u2.ustawMianownik(8);

		   u1.wyswietl();






		 
		   u2.wyswietl();




		  // u2.ustawUlamek(100,0);


		   u2.wyswietl();

	}


}
