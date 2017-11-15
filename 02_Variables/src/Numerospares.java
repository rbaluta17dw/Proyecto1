import java.util.Scanner;
public class Numerospares {
	public static void main(String[] args) {
		System.out.println("escribe un numero");
		
		Scanner lector = new Scanner(System.in);
		
		int a = lector.nextInt();
		
		if (!(a%2==0)) {
			System.out.println("el numero es impar");
			
		}else {System.out.println("el numero es par");}
	}
}