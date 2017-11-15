import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Crear un fichero con numeros separados por , o " "
 * leer fichero y pasarlo a array
 * recorrer ese array y sacar los numeros que sean multiplos de 3
 */
public class Ejercicio_03{

	public static void main(String[] args) throws FileNotFoundException {
		int cont = 0;
		
		//abrir fichero
		File fichero = new File ("D:/Deportistas.txt");
		Scanner scan = new Scanner(fichero);
		//contar lineas
		cont = contarLineas(scan);
		scan = new Scanner(fichero);
		//crear matriz
		String[][] array_nombre = new String [cont][2];
		//separar los nombres y los paellidos, meterlos en el array y sacarlos por pantalla
		int i = 0;
		
		while(scan.hasNextLine()){
			array_nombre[i] = scan.nextLine().split(" ");
			System.out.println("Nombre: " + array_nombre[i][0] + " Apellido: " + array_nombre[i][1]);
			i++;
		}
	}
	static int contarLineas(Scanner scan){
		int cont = 0;
		while (scan.hasNextLine()){
			scan.nextLine();
			cont++;
		}
		return cont;
	}
}