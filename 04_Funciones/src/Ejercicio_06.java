import java.io.FileNotFoundException;

public class Ejercicio_06 {
	/*1- 	Dado un array de int-s sacar por pantalla los numeros
	 * 		mayores que 5 y mernores o iguales que 14
	 * 		y mayores o iguales que 20 menores o iguales que 30.
	 * 
	 *2-	Dado un array de String-s sacar por pantalla los que
	 *		empiezen con 'a' o tengan la 3. letra la 'a'
	 *
	 *3-	Programa que lea una cadena de caracteres del teclado 
	 *		y muestre sus siglas. Por ejemplo: tren articulado ligero 
	 *		goicoechea oriol TALGO 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		numeros();
		Ejercicio_04.main(args);
	}
	static void numeros(){
		int [] num = {1,3,4,5,7,3,1,7,53,2,7645,1234,3,43};
		for (int i = 0; i < num.length; i++){
			if ((num[i] > 4 && num[i] < 15) || (num[i] > 19 && num[i] < 31)){
				System.out.println(num[i]);
			}
		}

	}
}
