import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio_04 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Inicio variables
		final int contar_palabras = 1;
		final int contar_palabras_veces = 2;
		final int contar_vocal_a = 3;
		final int sumar_con_inferiores = 4;
		final int multiplos_5_inferiores = 5;
		final int salir = 0;
		int opcion;
		
		//hago un escaner para meter la opcion por teclado y otro para leer el fichero de texto.
		Scanner scan = new Scanner(System.in);
		System.out.println("Ruta del archivo");
		Scanner arch = new Scanner(System.in);
		String ruta = arch.nextLine();
		File fichero = new File (ruta);
		Scanner fich = new Scanner(fichero);
		
		do{
		//Creo un menu
		System.out.println("------MENU------\n" + 
		contar_palabras +"- Contar palabras\n" + 
		contar_palabras_veces +"- Contar cuantas veces aparece una palabra introducida por teclado\n" + 
		contar_vocal_a + "- Contar cuantas veces aparece la vocal 'a'\n" + 
		sumar_con_inferiores + "- Introducir un numero por teclado y que saque la suma del mismo con sus inferiores\n" + 
		multiplos_5_inferiores + "- Introducir un numero por teclado y sacar por pantalla los multiplos de 5 inferiores\n" + 
		salir + "- Salir del programa");
		
		/*
		 *  vuelvo a leer el fichero para que cuando volvamos a
		 *  elegir una opcion el fichero este preparado desde el principio
		 */
		
		fich = new Scanner(fichero);
		opcion = scan.nextInt();
		scan = new Scanner(System.in);
		
		switch (opcion){
		
		case contar_palabras:
			System.out.println(contadorPalabras(fich)); //muestro por pantalla la funcion de contador de palabras con la opcion del escaner del fichero
			break;
		case contar_palabras_veces:
			System.out.println(contadorPalabrasVeces(fich)); //muestro por pantalla la funcion de contar cuantas veces aparece una palabra
			break;
		case contar_vocal_a:
			System.out.println(contadorVecesA(fich)); //muestro por pantalla cuantas veces aparece la letra a en el texto
			break;
		case sumar_con_inferiores:
			System.out.println(sumaInferiores());
			break;
		case multiplos_5_inferiores:
			multiplosNumeros();
			break;
		case salir:
			break;
			
		default:
			System.out.println("Error, opcion invalida");
		}
		}while (opcion != salir);
	}
	/*
	 * Esta funcion coge un fichero de texto y te devuelve cuantas palabras contiene.
	 * @param Scanner de un archivo de texto
	 * @return el numero de palabras que contiene
	 */
	static int contadorPalabras(Scanner fich) {
		int cont = 0;
		String texto;
		String [] array_texto;
		while (fich.hasNextLine()) {
		texto = fich.nextLine();
		array_texto = texto.split(" ");
		for (int i = 0; i < array_texto.length; i++){
			cont++;
			}
		}
		return cont;
	}
	static int contadorPalabrasVeces(Scanner fich){
		int contador = 0;
		System.out.println("¿Que palabra quieres que busque?");
		Scanner scan = new Scanner(System.in); //crea un escaner para meter la palabra que quieras
		String palabra = scan.nextLine(); //introduce la palabra en un String
		String texto;
		String [] array_texto;
		while (fich.hasNextLine()) {
		texto = fich.nextLine(); //mete el fichero en un String
		texto = texto.toLowerCase()+" ";
		array_texto = texto.split(palabra); //busca cuantas veces esta la palabra dentro del String
		if (array_texto.length > 2) {
			for (int i = 0; i < array_texto.length; i++){
				contador++; //cuento cuantas palabras estan dentro del array
				}
			}
		}
		return contador; //quito uno por que el split separa el string en 2
	}
	static int contadorVecesA(Scanner fich){
		int contador = 0;
		String texto;
		String [] array_texto;
		while (fich.hasNextLine()){
		texto = fich.nextLine();
		texto = texto.toLowerCase()+" ";
		array_texto = texto.split("a");
		for (int i = 0; i < array_texto.length; i++){
			contador++;
			}
		}
		return contador-1;
	}
	static int sumaInferiores() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un numero");
		int num = scan.nextInt();
		int suma = 0;
		if (num > 0){
		for (int i = 0; i <= num; i++) {
			suma = suma + i;
			}
		}
		return suma;
	}
	static void multiplosNumeros(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un numero");
		int i = scan.nextInt();
		int num = i;
		int aux = num;
			while (i != i -5 && i > 0){
			num = i;
			aux = num;
			System.out.println("\nLos multiplos de " + i + " hasta 100 son:\n");
			while (num <= 100){
				System.out.print(num + "  ");
				num = num + aux;
			}
			i--;
		}
	}
	}
