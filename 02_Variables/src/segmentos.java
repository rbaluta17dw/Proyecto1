
public class segmentos {
	
	public static void main(String[] args) {
		
		int a_ini = 1;
		int a_fin = 2;
		int b_ini = 2;
		int b_fin = 3;
		
		if ((a_ini <= b_ini) && (a_fin >= b_ini) ||
			(a_ini >= b_ini && b_fin >= a_fin) ||
			(a_ini <= b_fin)){
			System.out.println("Se solapa");
		}else {
			System.out.println("No se solapan");
		}
	}
}