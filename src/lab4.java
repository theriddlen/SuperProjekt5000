import java.util.*;
public class lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner is=new Scanner(System.in);
		double suma;
	
		
		
		
		int n;
		System.out.print("       Podaj wymiar przestrzeni: 5");
		n=is.nextInt();
		int wektory[]=new int[n];
		 
		   for(int i=0;i<n;i++){
		System.out.println("Podaj "+(i+1)+" skladowa wektora: ");
		wektory[i]=is.nextInt();
		}
			
		   
		   System.out.print("       Wektor, który podałeś to: [");
			System.out.print(wektory[0]);
			   for(int i=1;i<(n);i++){
					System.out.print(", "+wektory[i]);
					}
				System.out.println("]");

				
				suma=0;
					
				   for(int i=0;i<(n);i++){
					   suma=suma+((wektory[i])*(wektory[i]));
							   }
				   
				 suma=Math.sqrt(suma);
				  
					System.out.println("       długość wektora: "+suma);
		
	}


}
