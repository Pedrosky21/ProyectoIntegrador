package Programas;
import java.util.Scanner;

public class notas_estudiante {

	public static void main(String[] args) {
		int nota;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese la nota (0 al 10)");
		nota = scanner.nextInt();
		
		if (nota >= 0 && nota <=3 ) {
			System.out.println("Insuficiente");
		} else if (nota == 4) {
			System.out.println("Suficiente");
		} else if (nota == 5 || nota == 6) {
			System.out.println("Bien");
		} else if (nota == 7 || nota == 8) {
			System.out.println("Notable");
		} else if (nota == 9 || nota == 10) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("La nota ingresada es incorrecta: " + nota);
		}
	}

}
