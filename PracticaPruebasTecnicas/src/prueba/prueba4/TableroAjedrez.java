package prueba.prueba4;

import java.util.Random;

public class TableroAjedrez {
	private static final int FILAS = 8;
	private static final int COLUMNAS = 8;
	private static final char PUNTO = '.';
	private static final char GUION_BAJO = '_';

	public static void main(String[] args) {
		char[][] tablero1 = generarTablero();
		char[][] tablero2 = generarTablero();
		char[][] tablero3 = generarTablero();

		mostrarTablero(tablero1);
		contarPuntosPorFila(tablero1);
		contarPuntosPorColumna(tablero1);
		System.out.println();

		mostrarTablero(tablero2);
		contarPuntosPorFila(tablero2);
		contarPuntosPorColumna(tablero2);
		System.out.println();

		mostrarTablero(tablero3);
		contarPuntosPorFila(tablero3);
		contarPuntosPorColumna(tablero3);
	}

	public static char[][] generarTablero() {
		char[][] tablero = new char[FILAS][COLUMNAS];
		Random random = new Random();

		for (int fila = 0; fila < FILAS; fila++) {
			for (int columna = 0; columna < COLUMNAS; columna++) {
				tablero[fila][columna] = random.nextBoolean() ? PUNTO : GUION_BAJO;
			}
		}

		return tablero;
	}

	public static void mostrarTablero(char[][] tablero) {
		for (char[] fila : tablero) {
			for (char casilla : fila) {
				System.out.print(casilla + " ");
			}
			System.out.println();
		}
	}

	public static void contarPuntosPorFila(char[][] tablero) {
		for (int fila = 0; fila < FILAS; fila++) {
			int contador = 0;
			for (char casilla : tablero[fila]) {
				if (casilla == PUNTO) {
					contador++;
				}
			}
			System.out.println("En la fila " + (fila + 1) + " se encontraron " + contador + " puntos.");
		}
	}

	public static void contarPuntosPorColumna(char[][] tablero) {
		for (int columna = 0; columna < COLUMNAS; columna++) {
			int contador = 0;
			for (int fila = 0; fila < FILAS; fila++) {
				if (tablero[fila][columna] == PUNTO) {
					contador++;
				}
			}
			System.out.println("En la columna " + (columna + 1) + " se encontraron " + contador + " puntos.");
		}
	}
}
