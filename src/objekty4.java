import java.util.*;
public class objekty4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class Pencil{
			private int twardosc, twar_wyswietlana;


			public void ustawTwardosc (int t){
				twardosc=t;
				if(twardosc<0)
					twar_wyswietlana=-1*twardosc;
				else
					twar_wyswietlana=twardosc;
			}
		
			
		public void wyswietl (){
			if (twardosc>1){
			System.out.println(" ołowek "+twar_wyswietlana+"B");
			}
			if (twardosc==1){
			System.out.println(" ołowek B");
			}
			if (twardosc==0){
			System.out.println(" ołowek HB");
			}
			if (twardosc<-1){
			System.out.println(" ołowek "+twar_wyswietlana+"H");
			}
			if (twardosc==-1){
			System.out.println(" ołowek H");
			}
			
			}
		}
		
		 Pencil p1= new Pencil();

		 p1.ustawTwardosc(-4);
		 p1.wyswietl();

		 p1.ustawTwardosc(0);
		 p1.wyswietl();

		 p1.ustawTwardosc(3);
		 p1.wyswietl();

		 p1.ustawTwardosc(-2);  
		 p1.wyswietl();

		 p1.ustawTwardosc(1);
		 p1.wyswietl();

		 p1.ustawTwardosc(-1);
		 p1.wyswietl();
		
	}


}
