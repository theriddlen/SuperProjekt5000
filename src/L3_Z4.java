import java.util.*;
public class L3_Z4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner is=new Scanner(System.in);
	
		class GoldNumber{
			private int front, przod, srodek, tyl;
			private String imie;


			public GoldNumber (String imie, int front, int przod,int srodek,int tyl){
				this.imie=imie;
				this.front=front;
				this.przod=przod;
				this.srodek=srodek;
				this.tyl=tyl;
			}

			public GoldNumber (String imie, int front, int przod,int srodek){
			this(imie,front,przod,srodek,1);
			tyl=srodek;
		}

			public GoldNumber (String imie, int front, int przod){
			this(imie,front,przod,1);
			srodek=przod;
			tyl=srodek;
		}
			
			public void zmienCyfre (int c, int l){
				if(c==1){
					przod=l;
				}
				if(c==2){
					srodek=l;
				}
				if(c==3){
					tyl=l;
				}
		}
			
			public String toString (){
				String wynik="";
				wynik+=imie+"\n";
				wynik+=front+" "+przod+przod+"-"+srodek+srodek+"-"+tyl+tyl+"\n";
				wynik+="\n";

				return wynik;
			}
		}
		
		  GoldNumber nr1=new GoldNumber("Piotr",605,5,4,3);
		  GoldNumber nr2=new GoldNumber("Kasia",888,2,1);
		  GoldNumber nr3=new GoldNumber("Mariusz",501,7);

		  System.out.println(nr1);


		  System.out.println(nr2);


		  System.out.println(nr3);

		  
		  
		  nr1.zmienCyfre(1,7);  //pierwszy czlon na siodemki
		  nr2.zmienCyfre(2,5);  //drugi czlon na piatki
		  nr3.zmienCyfre(3,4);  //trzeci czlon na czworki

		  System.out.println(nr1);


		  System.out.println(nr2);


		  System.out.println(nr3);

		
	}


}
