import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("Escribe tu nombre");
		Scanner lector = new Scanner(System.in);
		String nombre;
		nombre = lector.nextLine();
		System.out.println(nombre);
		System.out.println("Escribe tu apellido");
		Scanner lector2 = new Scanner(System.in);
		String apellido;
		apellido = lector.nextLine();
		System.out.println(apellido);
		System.out.println("Te llamas " + nombre + " " + apellido);
		System.out.println("Escribe tu edad");
		Scanner lector3 = new Scanner(System.in);
		int edad = lector.nextInt();
		if (edad >= 18) {
			System.out.println("eres mayor de edad");
			if (edad > 40) {
				System.out.println("ya eres bastante mayor"); 
		}}
		if (edad < 16) {
			System.out.println("eres menor de edad");
		}
		System.out.println(edad);
	}
}
