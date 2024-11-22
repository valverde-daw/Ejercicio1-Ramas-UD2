package saludos;

import java.util.Scanner;

public class Saludos {

	public static void main(String[] args) {
		 Scanner input=new Scanner (System.in);
		 System.out.print("Introduce tu nombre: ");
	        String nombre = input.nextLine();
	        System.out.print("Introduce tus apellidos: ");
	        String apellidos = input.nextLine();
	        System.out.println("Hola " + nombre + " " + apellidos);
		 input.close();
	}

}
