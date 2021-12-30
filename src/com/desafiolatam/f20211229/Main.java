package com.desafiolatam.f20211229;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("¿Qué edad tienes?");
		int edad = sc.nextInt();

		if (edad < 18) {
			System.out.println("Eres menor de edad");
		} else {
			System.out.println("Eres Mayor de edad");
		}

		System.out.println("Ingrese numero");
		int numero = sc.nextInt();
		sc.nextLine();
		// x<0; 0<x; x==0;
		if (numero == 0) {
			System.out.println("El numero ingresado es cero");
		} else {
			if (numero > 0) {
				System.out.println("El numero es mayor a cero");
			} else {
				System.out.println("El numero es menor a cero");
			}
		}

		if (numero == 0) {
			System.out.println("El numero ingresado es cero");
		} else if (numero > 0) {
			System.out.println("El numero es mayor a cero");
		} else {
			System.out.println("El numero es menor a cero");
		}*/
		/****/
		/*System.out.println("ingrese una vocal");
		String vocal = sc.nextLine();
		
		if(vocal.equalsIgnoreCase("a")) {
			System.out.println("ingresaste la vocal A");
		}else if(vocal.toLowerCase().equals("e")) {
			System.out.println("ingresaste la vocal e");
		}else if(vocal.toUpperCase().equals("I")) {
			System.out.println("ingresaste la vocal i/I");
		}*/

		System.out.println("Ingrese su nombre");
		String password = sc.nextLine();
		
		String palabra = "Ti";
		//a b= -1; b a = 1; b B= 32
		System.out.println(palabra.compareTo(password));
		if(palabra.compareTo(password)==0) {
			System.out.println("Palabras iguales");
		}else {
			System.out.println("palabras distintas");
		}
		
	}

}
