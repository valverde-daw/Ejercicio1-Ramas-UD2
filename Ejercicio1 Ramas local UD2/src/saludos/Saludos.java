package saludos;

import java.util.Scanner;

public class Saludos {
	
	public static void main(String[] args) {
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

	}

}
