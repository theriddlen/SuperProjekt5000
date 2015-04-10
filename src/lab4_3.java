import java.util.*;
public class lab4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner is=new Scanner(System.in);
		int t_amount, t_price, t_amount_d, t_price_d = 0;
	
		System.out.println("  Ile zamówi³es biletów: 3");
		t_amount=is.nextInt();
		System.out.println("  Cena biletu: 15");
		t_price=is.nextInt();
		System.out.println("  Ile biletów, by uzyskaæ zni¿kê: 10");
		t_amount_d=is.nextInt();
		if (t_amount_d<=t_amount){
			System.out.println("  Ile wynosi zni¿ka na bilety [%]: 20");
			t_price_d=is.nextInt();
		}
		System.out.println(" ");
		System.out.println("Cena biletu: "+t_price+"z³");
		if (t_amount_d<=t_amount){
			System.out.println(" Cena biletu po zni¿ce: "+t_price*t_price_d);
		}
		System.out.println("  ---------------------");
		System.out.println("  ---------------------");

	}

}
