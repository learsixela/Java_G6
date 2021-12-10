package com.desafiolatam.f20211206;

import java.util.Scanner;

public class Ciclos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un número del 1 al 10: ");
		int num = sc.nextInt();

		while (num < 1 || num > 10) {
			System.out.printf("El número no está entre 1 y 10\n");
			System.out.printf("Ingresa un número del 1 al 10: ");
			num = sc.nextInt();
		}
		System.out.println("El número ingresado fue: " + num);
		System.out.printf("El número ingresado fue: %d \n", num);

		int num2;
		do {
		 System.out.printf("ingrese un numero entre 1 y 10:");
		 num2 = sc.nextInt();
		}while(num2 <1 || num2 > 10);
		System.out.printf("El número ingresado es: %d\n",num2);
		
		
		
		// --
		System.out.printf("Ingrese la contraseña: ");
		String variable = sc.nextLine();
		// palabras iguales lexicamente = 0
		//-1 1
		
		while (variable.compareTo("123456") != 0) {
			System.out.printf("La contraseña es incorrecta\n", variable);
			System.out.printf("Ingrese la contraseña: ");
			variable = sc.nextLine();
		}
		System.out.printf("La contraseña ingresada es correcta\n");

		
		String variable1;
		int opcion = 1;
		do {
			System.out.printf("Ingrese la contraseña: ");
			variable1 = sc.nextLine();
			if(variable1.compareTo("123456") != 0) {
				opcion = 1;
				System.out.println("La contraseña es incorrecta\n"+ variable1);
			}else {
				opcion = 0;				
			}
		}while(opcion == 1);
		System.out.println("La contraseña ingresada es correcta");
		
		sc.close();
	}

}
