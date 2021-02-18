package ejerciciosCasa;

import java.io.IOException;
import java.util.Scanner;

public class resultado {
	static managerCalculadora main = new managerCalculadora();
	static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		
		
		
		System.out.println("¿Qué desea hacer?");
		String res=teclado.nextLine();
		
		if(res.equals("sumar")) {
			llamoMetodoSUMA();
		}
		if(res.equals("restar")) {
			llamoMetodoRESTA();
		}
		if(res.equals("multiplicar")) {
			llamoMetodoMULTIPLICAR();
		}
	}
	public static void llamoMetodoSUMA() throws IOException {
		System.out.println("Introduce el primer numero: ");
		int a= teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		int b= teclado.nextInt();
		main.sumar(a, b);
	}
	public static void llamoMetodoRESTA() throws IOException {
		System.out.println("Introduce el primer numero: ");
		int a= teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		int b= teclado.nextInt();
		main.restar(a, b);
	}
	public static void llamoMetodoMULTIPLICAR() throws IOException {
		System.out.println("Introduce el primer numero: ");
		int a= teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		int b= teclado.nextInt();
		main.multiplicar(a, b);
	}
}
