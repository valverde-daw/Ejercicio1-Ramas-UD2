package saludos;

import java.util.Scanner;
<<<<<<< HEAD

public class Saludos {
=======
>>>>>>> saludosHora

public class Saludos {
	
	public static void main(String[] args) {
<<<<<<< HEAD
		 Scanner input=new Scanner (System.in);
		 System.out.print("Introduce tu nombre: ");
	        String nombre = input.nextLine();
	        System.out.print("Introduce tus apellidos: ");
	        String apellidos = input.nextLine();
	        System.out.println("Hola " + nombre + " " + apellidos);
		 input.close();
=======
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce una hora del día: ");
		int HORA=input.nextInt();
		if(HORA>0&&HORA<=12) {
			System.out.println("Buenos días");
		}else if(HORA>12&&HORA<21) {
			System.out.println("Buenas tardes");
		}else if(HORA>=21&&HORA<=24) {
			System.out.println("Buenas noches");
		}else {
			System.out.println("Valor no valido");
		}
		
		input.close();

>>>>>>> saludosHora
	}

}
