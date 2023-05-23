package prueba.prueba3;

public class ConversorBinario {
	public static void main(String[] args) {
		int numero = 107;
		System.out.println(convertirBinario(numero));
	}

	private static String convertirBinario(int numero) {
		if (numero == 0) {
			return "0";
		}

		StringBuilder binarioBuilder = new StringBuilder();
		while (numero > 0) {
			int residuo = numero % 2;
			binarioBuilder.insert(0, residuo);
			numero /= 2;
		}

		return binarioBuilder.toString();
	}
}