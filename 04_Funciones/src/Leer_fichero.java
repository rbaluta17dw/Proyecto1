import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * leer de un fichero y sacarlo por pantalla
 */
public class Leer_fichero {

	public static void main(String[] args) throws FileNotFoundException {
		File fichero = new File ("D:/texto.txt");
		Scanner scan = new Scanner(fichero);
		while (scan.hasNextLine()){
			String linea = scan.nextLine();
			System.out.println(linea);
		}
		
		String nombres = "Don Juan,Junior,Miker,Ane,Maria,Comida";
		String [] array_nombres = nombres.split(",");
		for (int i = 0; i < array_nombres.length; i++){
			System.out.println(array_nombres[i]);
		}
	}
}