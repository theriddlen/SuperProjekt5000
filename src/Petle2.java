import java.util.*;
public class Petle2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String haslo;
System.out.print("Podaj has�o: ");
haslo=sc.next();
while (!haslo.equals("today")){
System.out.println(
"Podane has�o jest nieprawid�owe"
);
System.out.print("Podaj poprawne has�o: ");
haslo=sc.next();
};
System.out.print("Du�a tajemnica: :)))))");
}
}