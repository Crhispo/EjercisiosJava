package prueba.numerosprimos;

public class NumerosPrimos {

	public static void main(String[] args) {
		for (int i = 0; i < 255; i++) {
			System.out.println("El numero " + i + " es primo: " + esPrimo(i));
		}
	}

	public static boolean esPrimo(int numero) {
		if (numero <= 1) {
			return false;
			
		}
		for (int i = 2; i <= numero / 2; i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
}
