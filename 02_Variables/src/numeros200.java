import java.util.Scanner;

public class numeros200 {

	public static void main(String[] args) {
		System.out.println("escribe tu edad");
		Scanner lector = new Scanner(System.in);
		int edad = lector.nextInt();
		
		//Comprobar si la edad esta entre 16 y 65
		if (edad >= 16 && edad <= 65){
			System.out.println("Edad de trabajar");
		}
		//Comprobar si la edad esta fuera de 16 y 65 pero que no sea mayor a 0 o menor a 100
		if (edad < 16 && edad > 0 || edad > 65 && edad < 100){
			System.out.println("Edad de no trabajar");
		}
		//Comprobar si la edad es menor a 0 o mayor a 122
		if (edad < 0 || edad > 122){
			System.out.println("Esto no es posible");
			
		}
	}
}
