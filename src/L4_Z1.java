import java.util.*;
public class L4_Z1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		class Okulary{
			private int rozstaw;
			private double lewe, prawe;
			public static final int OP=1;
			public static final int OL=2;
			public static final int ROZSTAW_OCZU=3;


			public Okulary (int rozstaw, double lewe, double prawe){
				this.rozstaw=rozstaw;
				this.lewe=lewe;
				this.prawe=prawe;
			}
			public Okulary (int rozstaw){
				this(rozstaw, 0, 0);
			}
			public void set(int nr, double wartosc){
				switch (nr){
				case Okulary.OP:	prawe=wartosc;
				case Okulary.OL:	lewe=wartosc;
				}
			}
				public void set(int nr, int wartosc){
					switch (nr){
					case Okulary.ROZSTAW_OCZU:	rozstaw=wartosc;
					}
				}
				
				public String toString (){
					String wynik="";
					wynik+="   OP: "+prawe+" dioptri"+"\n";
					wynik+="   OL: "+lewe+" dioptri"+"\n";
					wynik+="   rozstaw oczu: "+rozstaw+" mm"+"\n";
					return wynik;
				}
			}
		
	
			   Okulary oku1=new Okulary(58); 
			   Okulary oku2=new Okulary(64);

			   System.out.println(oku1);




			   System.out.println(oku2);



			   oku1.set(Okulary.OP, -2.0); 
			   oku1.set(Okulary.OL, -2.5); 

			   oku2.set(Okulary.OP, 1.0); 
			   oku2.set(Okulary.OL, 1.5); 
			   oku2.set(Okulary.ROZSTAW_OCZU, 72); 

			   System.out.println(oku1); 



			   System.out.println(oku2);


		
	}


}
