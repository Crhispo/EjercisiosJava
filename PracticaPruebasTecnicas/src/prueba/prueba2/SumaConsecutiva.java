package prueba.prueba2;

import java.util.Scanner;

public class SumaConsecutiva {

	private static Scanner sc;
	private static int opcion;
	private static int total; // Declaración de la variable total fuera del ciclo

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		total = 0; // Inicializamos la variable total

		do {
			System.out.println("Ingrese un valor: ");
			int valor = sc.nextInt();
			total += valor;
			System.out.println("El valor actual es: " + valor + " y el total actual es: " + total);
			System.out.println("Desea aun continuar con el algoritmo? Seleccione 1 para si y 0 para no");
			opcion = sc.nextInt();
		} while (opcion == 1);

		System.out.println("La suma total de los valores ingresados es: " + total);
		System.out.println("Se acabo. ");
	}
}
