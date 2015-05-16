import java.util.*;
public class L4_Z2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class Rectangle{
		private int wysokosc, szerokosc, show;
		public static final int POLE=1;
		public static final int OBWOD=2;
		public static final int WYMIARY=3;
		
		public Rectangle (int szerokosc, int wysokosc){
			this(szerokosc,wysokosc,Rectangle.WYMIARY);
		}
		public Rectangle (int szerokosc, int wysokosc, int show){
			this.szerokosc=szerokosc;
			this.wysokosc=wysokosc;
			this.show=show;
		}

		public void ustawCoWyswietlac(int nr){
			switch (nr){
			case Rectangle.OBWOD:	this.show=nr;
			case Rectangle.WYMIARY:	this.show=nr;
			}
		}
		
		public String toString (){
			int pole, obwod;
			pole=szerokosc*wysokosc;
			obwod=(szerokosc+wysokosc)*2;
			String wynik="";
			if (show==Rectangle.WYMIARY){
			wynik+=" Szerokosc: "+szerokosc+"\n";
			wynik+=" Wysokosc: "+wysokosc+"\n";
			}
			if (show==Rectangle.POLE){
			wynik+=" Pole:"+pole+"\n";
			}
			if (show==Rectangle.OBWOD){
			wynik+=" Obwod:"+obwod+"\n";
			}
			wynik+="\n";

			return wynik;
		}
		}
		
		   Rectangle cos1=new Rectangle(7,5); 
		   Rectangle cos2=new Rectangle(10,12,Rectangle.POLE);

		   System.out.println(cos1);


		   System.out.println(cos2);

		   cos1.ustawCoWyswietlac(Rectangle.OBWOD); 
		   cos2.ustawCoWyswietlac(Rectangle.WYMIARY); 

		   System.out.println(cos1); 

		   System.out.println(cos2);
	}
}
