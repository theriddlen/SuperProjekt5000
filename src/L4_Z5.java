import java.util.*;
public class L4_Z5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		class TekstAndRamka{
			private int znaki, strona;
			private String tekst;
			public static final int RIGHT=1;
			public static final int CENTER=2;
			public static final int LEFT=3;


			public TekstAndRamka (String tekst, int znaki, int strona){
				this.tekst=tekst;
				this.znaki=znaki;
				this.strona=strona;
			}
			public TekstAndRamka (String tekst, int znaki){
				this(tekst, znaki, TekstAndRamka.LEFT);
			}

				public void wyswietl (){
					int licznik = 0;
					do{
					System.out.print("#");
					licznik++;
					}while (licznik!=znaki);
					System.out.println("");
					
					int srodek=0;
					if(strona==TekstAndRamka.LEFT || strona==TekstAndRamka.RIGHT)
						srodek=znaki-3-tekst.length();
					if(strona==TekstAndRamka.CENTER)
						srodek=((znaki-tekst.length())/2)-1;

					System.out.print("#");
					
					if(strona==TekstAndRamka.RIGHT || strona==TekstAndRamka.CENTER){
					licznik = 0;
					do{
					System.out.print(" ");
					licznik++;
					}while (licznik!=srodek);
					}
					
					if(strona==TekstAndRamka.LEFT){
						System.out.print(" ");
					}

					System.out.print(tekst);

					if(strona==TekstAndRamka.RIGHT){
						System.out.print(" #");
					}
					
					if(strona==TekstAndRamka.CENTER){
						licznik = 0;
						do{
						System.out.print(" ");
						licznik++;
						}while (licznik!=srodek);
						System.out.print("#");
					}
					
					if(strona==TekstAndRamka.LEFT){
						licznik = 0;
						do{
						System.out.print(" ");
						licznik++;
						}while (licznik!=srodek);
						System.out.print("#");
					}
					
					
					System.out.println("");
					
					licznik = 0;
					do{
					System.out.print("#");
					licznik++;
					}while (licznik!=znaki);
					System.out.println("");

					


//					System.out.println(" l. godz. wykładu: "+godz1+" ("+dzien1+")");
//					System.out.println(" l. godz. cwiczen: "+godz2+" ("+dzien2+")");
					System.out.println();
					}
			}
		
	
		 TekstAndRamka t1=new TekstAndRamka("Alicja",25,TekstAndRamka.RIGHT);
		 TekstAndRamka t2=new TekstAndRamka("weekend...",30,TekstAndRamka.CENTER);
		 TekstAndRamka t3=new TekstAndRamka("kot",10);


		System.out.println("123456789*123456789*123456789*12345");
		t1.wyswietl();  
		
		
		
		
		
		t2.wyswietl();  
		
		
		
		
		
		t3.wyswietl();  

		
	}


}
