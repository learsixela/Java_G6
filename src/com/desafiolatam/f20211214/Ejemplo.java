package com.desafiolatam.f20211214;

import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) {
		/*
		 * Escribir un m�todo que reciba un n�mero e imprima en consola "Desafio" si el
		 * n�mero es divisible por 5, imprima "Latam" si el n�mero es divisible por 3,
		 * "DesafioLatam" si el n�mero es divisible por 3 y 5 y para el resto de los
		 * casos imprimir el n�mero ingresado.
		 */
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("** Ingrese n�mero a validar **");
			validarNumero(sc.nextInt());
			sc.nextLine();
			System.out.println("\n*** Desea ingrear otro n�mero ***");
			System.out.println("0.- NO \n1.- SI");
			opcion = sc.nextInt();
		} while (opcion == 1);
		
		System.out.println("\n ** Gracias por participar **");
		System.out.println("    ** Hasta pronto **");
		sc.close();
	}

	public static void validarNumero(int numero) {
		if (numero % 3 == 0 && numero % 5 == 0) {
			System.out.println(" - DefafioLatam");
		} else if (numero % 3 == 0) {
			System.out.println(" - Latam");
		} else if (numero % 5 == 0) {
			System.out.println(" - Desafio");
		} else {
			System.out.println(" - El nuemro es: " + numero);
		}

	}

}
