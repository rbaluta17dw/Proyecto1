
public class prueba {

// funcion
	static boolean es_par(int numero) {
		if (numero % 2 == 0) {
			return true;
			} else {
				return false;
				}
		}

	static String concatenar(String st1, String st2) {
		return st1 + " " + st2;
		}

	static String pasar_a_minusculas(String frase) {
		return frase.toLowerCase();
		}

	static boolean es_primo(int numero) {

		boolean es_primo = true;

		for (int i = 2; i < numero; i++) {


			if (numero % i == 0) {
				es_primo = false;
				}
			}

		return es_primo;
		}

	static int max(int[] numeros){
		int num_max = 0;
		for (int i = 900; i > num_max; i--){
			numeros[i]=num_max;
		}return num_max;
}

	static int min(int[] numeros){
		int num_min = 900;
		for (int i = 0; i < num_min; i++){
			numeros[i]=num_min;
		}return num_min;
	}

	static double media(int[] numeros){
		double suma = 0;
		for (int i = 0; i < numeros.length; i++){
		} return (int) (suma/numeros.length);
		}

	// procedura
	static void escribir(String frase) {
		System.out.println(frase);
		}

	static void escribir_en_mayuscula(String frase) {
		escribir(frase.toUpperCase());
		}

	private static void escribir_array(int[] numeros) {		
	}

	public static void main(String[] args) {
		int zenbakia = 10;

		if (es_par(zenbakia)) {
			escribir(zenbakia + " es par");
			} else {
				escribir(zenbakia + " no es par");
				}

		escribir_en_mayuscula(concatenar("hola", "mundo"));

		if (es_primo(5)) {
			escribir(5 + " es primo");
			}
		}
	
	int[] numeros = { 12, 4, 4, 7, 3, 6, 3 };
	double media = media(numeros);
	double salario = 1000.4;
	double porcentaje = 1.5;
	double nuevo_salario = aumento(salario, porcentaje);
	private double aumento(double salario, double porcentaje) {
	double aumento = salario * porcentaje/100;
	double nuevo_salario = aumento + salario;
	return nuevo_salario;	
	}
	}