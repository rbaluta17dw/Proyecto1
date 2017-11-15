public class min_max {
	/*
	 * Va a crear numeros aleatorios y
	 * los va a meter en un array de 5
	 * @return array de numeros aleatorios de 1 al 10
	 */
	static int[] array_num(){
		int [] numeros = new int [5];
		int i = 0;
		for (i = 0; i < numeros.length; i++){
			numeros[i] = (int) (Math.random()*10+1);
		}
		return numeros;
	}
	/*
	 * Recibe un array de numeros y
	 * devolvera el numero maximo
	 * @param numeros en un array de integers
	 * @return el numero maximo dentro del array
	 */
	static int max(int[] numeros){
		int max = numeros [0];
		for (int i = 0; i < numeros.length; i++){
			if (max < numeros [i]){
				max = numeros [i];
			}
		}
		return max;
	}
	/*
	 * Recibe un array de numeros y
	 * devolvera el numero minimo
	 * @param numeros en un array de integers
	 * @return el numero minimo dentro del array
	 */
	static int min(int[] numeros){
		int min = numeros [0];
		for (int i = 0; i < numeros.length; i++){
			if (min > numeros [i]){
				min = numeros [i];
			}
		}
		return min;
	}
	/*
	 * Recibe un array de numeros y
	 * devolvera el numero minimo y el maximo
	 * @param numeros en un array de integers
	 * @return el numero maximo y el minimo dentro del array
	 */
	static int [] minmax(int[] numeros){
		int[] minmax = new int [2];
		int min = numeros[0];
		for (int i = 0; i < numeros.length; i++){
			if (min > numeros [i]){
				min = numeros [i];
			}
		}minmax[0] = min;
		int max = numeros [0];
		for (int i = 0; i < numeros.length; i++){
			if (max < numeros [i]){
				max = numeros [i];
			}
		}minmax[1] = max;
		return minmax;
	}
	public static void main(String[] args){
		int [] numeros = array_num();
		int [] min_max = minmax(numeros);
		System.out.println(max(numeros));
		System.out.println(min(numeros));
		System.out.println(min_max[0]);
	}
} 