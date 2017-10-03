import java.util.Scanner;

public class numeros {
	public static void main(String[] args) {
		System.out.println("escribe un numero");
		Scanner lector = new Scanner(System.in);
		int a = lector.nextInt();
		System.out.println("escribe otro numero");
		Scanner lector2 = new Scanner(System.in);
		int b = lector2.nextInt();
		if (a > b) {
			System.out.println("a es mayor que b");
		}else if (a == b){
			System.out.println("a es igual que b");
		}else System.out.println("a es menor que b");
	}
}