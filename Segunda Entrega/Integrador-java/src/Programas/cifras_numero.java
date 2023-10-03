package Programas;
import java.util.Scanner;

public class cifras_numero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		
		System.out.println("Ingrese un numero (del 0 al 9.999).");
		num = scanner.nextInt();
		
		if (num >= 0 && num <= 9999) {
			String cifras;
			cifras = Integer.toString(num);
			cifras = "" + cifras.length();
			System.out.println("El numero " + num + " tiene " + cifras + " cifras");
		} else {
			System.out.println("El numero ingresado (" + num + ") no pertenece al rango (0-9.999).");
		}
	}

}
