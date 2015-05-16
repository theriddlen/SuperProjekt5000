import java.util.*;
public class L3_Z2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner is=new Scanner(System.in);
	
		class Filizanka{
			private int sztuki;
			private String kolor;
			private double pojemnosc, cena; 


			public Filizanka (String kolor, double cena, double pojemnosc, 
					      int sztuki){
				this.kolor=kolor;
				this.cena=cena;
				this.pojemnosc=pojemnosc;
				this.sztuki=sztuki;
			}

			public Filizanka (String kolor, double cena){
			this(kolor,cena,0.33,6);
		}
			public Filizanka (double cena){
			this("bialy",cena,0.33,1);
		}
			public String toString (){
				cena=cena*sztuki;
				String wynik="";
				wynik+="  kolor filiżanki: "+kolor+"\n";
				wynik+="  pojemnosc filiżanki: "+pojemnosc+"l"+"\n";
				if(sztuki>1 && sztuki<5){
					wynik+="  komplet: "+sztuki+" sztuki"+"\n";
				}
				if(sztuki>=5){
					wynik+="  komplet: "+sztuki+" sztuk"+"\n";
				}
				if(sztuki==1){
					wynik+="  cena: "+cena+" zł"+"\n";
				}
				else{
					wynik+="  cena kompletu: "+cena+" zł"+"\n";
				}
				wynik+="\n";

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
