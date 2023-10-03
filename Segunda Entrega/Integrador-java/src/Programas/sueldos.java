package Programas;
import java.util.Scanner;

public class sueldos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cant;
		int sueldo;
		int men_sueldo;
		int may_sueldo;
		int total_sueldos = 0;
		int prom_sueldos;
		
		System.out.println("Ingrese la cantidad de sueldos que desea ingresar: ");
		cant = scanner.nextInt();
		int [] sueldos = new int[cant];
		
		for (int i=0; i<cant; i++) {
			System.out.println("Ingrese el sueldo n°" + (i+1));
			sueldo = scanner.nextInt();
			sueldos[i] = sueldo;
		}
		
		men_sueldo = sueldos[0];
		may_sueldo = sueldos[0];
		for (int i=0; i<cant; i++) {
			if (sueldos[i] <= men_sueldo) {
				men_sueldo = sueldos[i];
			}
			
			if (sueldos[i] >= may_sueldo) {
				may_sueldo = sueldos[i];
			}
			
			total_sueldos = total_sueldos + sueldos[i];
		}
		
		prom_sueldos = total_sueldos / cant;
		
		System.out.println("El menor sueldo es: $" + men_sueldo);
		System.out.println("El mayor sueldo es: $" + may_sueldo);
		System.out.println("El promedio de sueldos es: $" + prom_sueldos);
		
	}

}
