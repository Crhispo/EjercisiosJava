package prueba.prueba5;

public class SimulacionCaidaLibre {
	public static void main(String[] args) {
		String[][] posicionInicial = { { "#", "." }, { "#", "#" }, { "#", "." }, { ".", "#" }, { ".", "." } }; // Posición
																												// inicial
																												// de la
																												// piedra
																												// (2
																												// columnas
																												// de
																												// caracteres)

		String[][] posicionFinal = calcularPosicionFinal(posicionInicial);

		System.out.println("Posición inicial:");
		mostrarTablero(posicionInicial);
		System.out.println("\nPosición final:");
		mostrarTablero(posicionFinal);
	}

	public static String[][] calcularPosicionFinal(String[][] posicionInicial) {
		int altura = posicionInicial.length;
		int ancho = posicionInicial[0].length;

		String[][] posicionFinal = new String[altura][ancho];

		// Copiar la posición inicial a la posición final
		for (int i = 0; i < altura; i++) {
			System.arraycopy(posicionInicial[i], 0, posicionFinal[i], 0, ancho);
		}

		// Recorrer las columnas y encontrar la última fila donde se encuentra el
		// caracter '#'
		for (int j = 0; j < ancho; j++) {
			int filaFinal = altura - 1;

			for (int i = altura - 1; i >= 0; i--) {
				if ("#".equals(posicionInicial[i][j])) {
					posicionFinal[filaFinal--][j] = "#";
				}
			}

			// Rellenar las filas restantes con el caracter '.'
			while (filaFinal >= 0) {
				posicionFinal[filaFinal--][j] = ".";
			}
		}

		return posicionFinal;
	}

	public static void mostrarTablero(String[][] tablero) {
		for (String[] fila : tablero) {
			for (String celda : fila) {
				System.out.print(celda != null ? celda : ".");
			}
			System.out.println();
		}
	}
}