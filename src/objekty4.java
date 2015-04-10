import java.util.*;
public class objekty4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class Filizanka{
			private int komplet;
			private double pojemnosc, cena;
			private String kolor;

			public void setKolor (String s){
				kolor=s;
			}
			public void setPojemnosc (double p){
				pojemnosc=p;
			}
			public void setCenaSztuki (double c){
				cena=c;
			}
			public void setKomplet (int k){
				komplet=k;
				cena=komplet*cena;
			}
	
			public void wyswietl (){
				System.out.println("  kolor filiżanki: "+kolor);
				System.out.println("  pojemnosc filiżanki: "+pojemnosc+"l");
				if(komplet>0){
					System.out.print("  komplet: "+komplet+" sztuk");
					if(komplet==2){
						System.out.print("i");
					}
					System.out.println();
					System.out.println("  cena kompletu: "+cena+" zł");

				}
				else{
					System.out.println("  cena: "+cena+" zł");
				}
				System.out.println();


				}
			}
		  Filizanka f1=new Filizanka();
		  f1.setKolor("szary");
		  f1.setPojemnosc(0.5);
		  f1.setCenaSztuki(12.5);
		  f1.setKomplet(10);

		  Filizanka f2=new Filizanka();
		  f2.setKolor("żółty");
		  f2.setPojemnosc(0.7);
		  f2.setCenaSztuki(20);
		  f2.setKomplet(1);

		  Filizanka f3=new Filizanka();
		  f3.setKolor("wyprzedaż");
		  f3.setPojemnosc(0.33);
		  f3.setCenaSztuki(1);
		  f3.setKomplet(2);

		  f1.wyswietl();





		  f2.wyswietl();



		  f3.wyswietl();
		
	}


}
