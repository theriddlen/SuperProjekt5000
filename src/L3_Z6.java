import java.util.*;
public class L3_Z6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		class FunnyString{
			private boolean ascii;
			private String slowo;
			private char separator;


			public FunnyString (String slowo, char separator, boolean ascii){
				this.slowo=slowo;
				this.separator=separator;
				this.ascii=ascii;

			}
			public FunnyString (String slowo, char separator){
				this(slowo, separator, false);
			}
			public FunnyString (String slowo, boolean ascii){
				this(slowo,'-', ascii);
			}
			public FunnyString (String slowo){
				this(slowo,'-', false);
			}
			public void setAscii (boolean a){
				ascii=a;
			}
			public void setChar (char b){
				separator=b;
			}
			
			public String toString (){
				
				int dlugosc = slowo.length();
				int licznik = 0;
				String wynik="";
				do{
					if(ascii==false){
					wynik+=slowo.charAt(licznik);
					}
					if(ascii==true){
						wynik+=(int)slowo.charAt(licznik);
					}
					if(licznik!=dlugosc-1)
						wynik+=separator;
					licznik++;
				}while (licznik!=dlugosc);
				wynik+="\n";

				return wynik;
			}
		}
			  FunnyString w1=new FunnyString("Kaktus");
			  FunnyString w2=new FunnyString("Eukaliptus",'*');  
			  FunnyString w3=new FunnyString("Yuka",true);

			  System.out.println(w1);

			  System.out.println(w2);

			  System.out.println(w3);

			  w1.setAscii(true);
			  w1.setChar('*');
			  System.out.println(w1);

			  w3.setAscii(false);
			  w3.setChar('!');
			  System.out.println(w3);


		
	}


}
