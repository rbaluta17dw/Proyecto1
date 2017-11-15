
public class Variables {

	public static void main(String[] args) {
		byte a = 127;
		short b = 32767;
		int c = -2000000000;
		long d = 16;
		
		float e = 3.15f;
		double f = 3.1416;
		
		boolean g = true;
		char h = '\n';
		String i = "Este es un ejemplo";
		
		System.out.println("Suma de a+b " + (a+b));
		System.out.println("Resta de a-b " + (a-b));
		System.out.println("Multiplicacion de a*b " + (a*b));
		System.out.println("Division de a/b " + (a/b));
		System.out.println((double)3 / 2);
		System.out.println("Resto de la division entera: a % b " + a % b);
	}

}
