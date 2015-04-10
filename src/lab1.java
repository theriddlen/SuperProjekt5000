import java.util.*;
public class lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner is=new Scanner(System.in);
		 
		
		int n_front, n_front_n, u_licznik, u_mianownik, n_rest;
		String tenths_txt, fr_nr, u_mianownik_string;
		int m_lenght;
		double wynik;
		// zerowy ulamek
		//dlugosc kreski
		
		System.out.println("   Podaj licznik ulamka: ");
		u_licznik=is.nextInt();
		while (u_licznik<=0)
			{
			System.out.println("Nieprawidlowy licznik");
			System.out.println("Podaj poprawny licznik: ");
			u_licznik=is.nextInt();
			};
			
			System.out.println(" Podaj mianownik ulamka: ");
			u_mianownik=is.nextInt();
			while (u_mianownik<=0)
				{
				System.out.println("Nieprawidlowy mianownik");
				System.out.println("Podaj poprawny mianownik: ");
				u_mianownik=is.nextInt();
				};
				
				System.out.println("Czy wyswietlic dziesietnie? (tak/nie): ");
				tenths_txt=is.next();
				while (!tenths_txt.equals("tak") && !tenths_txt.equals("nie"))
					{
					System.out.println("Niedozwolony argument");
					System.out.println("Wpisz tak lub nie: ");
					tenths_txt=is.next();
					};

					n_front=u_licznik/u_mianownik;
					n_rest=u_licznik-(n_front*u_mianownik);
					fr_nr=""+n_front;
					n_front_n=fr_nr.length();
					wynik=1.0*u_licznik/u_mianownik;


					
	if (tenths_txt.equals("nie")){
					
					
	if(n_rest!=0){
					System.out.print("    ");
					int licznik = 0;
						do{
					      System.out.print(" ");
					      licznik++;
						}while (licznik!=n_front_n);
					System.out.println(n_rest);
				}

					//zamiana na stringa i liczenie
					u_mianownik_string=""+u_mianownik;
					m_lenght=u_mianownik_string.length();
					
					
					
					
					//brak calości
					if(n_front==0){
					System.out.print("  "+" "+"  ");
					int licznik3 = 0;
					do{
					      System.out.print("-");
					      licznik3++;
					}while (licznik3!=m_lenght);
				      System.out.println("");
					}
					


					if(n_front!=0){
					System.out.print("  "+n_front+"  ");
					int licznik3 = 0;
					do{
						if(n_rest!=0){
					      System.out.print("-");
						}
					      licznik3++;
						
					}while (licznik3!=m_lenght);
				      System.out.println("");
					}
					
					if(n_rest!=0){
					System.out.print("    ");
					int licznik2 = 0;
					do{
						if(n_rest!=0){
					      System.out.print(" ");
						}
					      licznik2++;
						
					}while (licznik2!=n_front_n);
					System.out.println(u_mianownik);
					}
	}
					if (tenths_txt.equals("tak")){
						System.out.println(wynik);
					}
	}



	}