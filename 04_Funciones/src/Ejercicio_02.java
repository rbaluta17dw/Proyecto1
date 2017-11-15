import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Crear un fichero con numeros separados por , o " "
 * leer fichero y pasarlo a array
 * recorrer ese array y sacar los numeros que sean multiplos de 3
 */
public class Ejercicio_02 {

	public static void main(String[] args) throws FileNotFoundException {
		String linea = "";
		String[] numeros;
		File fichero = new File ("D:/texto.txt");
		Scanner scan = new Scanner(fichero);
		while (scan.hasNextLine()){
			linea = scan.nextLine();
		}
		numeros = linea.split(",");
		for (int i = 0; i < numeros.length; i++){
			if((multiplo_3(Integer.parseInt(numeros[i])))){
				System.out.println(numeros[i]);
			}
		}
	}
	/*
	 * Coger los numeros del array y sacar por 
	 * pantalla si son multiplos de 3 o no
	 * @param numeros en un array de integers
	 * @return los numeros y si son multiplos de 3 o no
	 */
	static boolean multiplo_3(int num){
		if (num % 3 == 0){
			return true;
		}else{
			return false;
		}
	}
}
