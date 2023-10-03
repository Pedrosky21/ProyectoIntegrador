package Programas;
import java.util.Scanner;
import java.util.Arrays;

public class ordenado_cinco_numeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, num3, num4, num5;
		String nums_ordenados = "";
		
		System.out.println("Se le solicitara ingresar 5 numeros");
		System.out.println("Ingrese el numero 1:");
		num1 = scanner.nextInt();
		System.out.println("Ingrese el numero 2:");
		num2 = scanner.nextInt();
		System.out.println("Ingrese el numero 3:");
		num3 = scanner.nextInt();
		System.out.println("Ingrese el numero 4:");
		num4 = scanner.nextInt();
		System.out.println("Ingrese el numero 5:");
		num5 = scanner.nextInt();
		
		int [] array_nums = {num1, num2, num3, num4, num5};
		Arrays.sort(array_nums);
		
		for (int i=4; i>=0; i--) {
			nums_ordenados = nums_ordenados + array_nums[i] + ", ";
		}
		System.out.println("Numeros ordenados de mayor a menor: " + nums_ordenados);
		
		nums_ordenados = "";
		for (int i=0; i<5; i++) {
			nums_ordenados = nums_ordenados + array_nums[i] + ", ";
		}
		System.out.println("Numeros ordenados de menor a mayor: " + nums_ordenados);
	}

}
