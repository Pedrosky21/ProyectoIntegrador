package Programas;
import java.util.Scanner;

public class pares_hasta {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String num_cad = "";
		int num;
		
		while (num_cad.length() != 3) {
			System.out.println("Ingrese un numero de 3 cifras");
			num_cad = scanner.nextLine();
			if (num_cad.length() != 3) {
				System.out.println("El numero ingresado no es de 3 cifras >:(");
			}
		}
		
		num = Integer.parseInt(num_cad);
		
		System.out.println("Los numeros pares desde el 0 hasta " + num_cad + " son: ");
		for ( int i=0; i<=num; i++) {
			if (i%2 == 0) {
				System.out.print(i + ", ");
			}
		}
	}

}
