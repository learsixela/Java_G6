package com.desafiolatam.f20211209;

import java.util.Scanner;

public class Util {
	/**
	 * Solicitud de opcion en menu
	 * */
	public int solicitud() {
		Scanner sc = new Scanner(System.in);
		int opcion = -1;
		int contador = 0;
		do {
			System.out.println("* Seleccione una opción *");
			opcion = sc.nextInt();
			sc.nextLine();
			contador = contador + 1;// variable de control
			if (contador == 4) {// solo 4 veces
				opcion = 0;// limpiar la variable
				break;
			}
			// <-1 2 3 4->
		} while (opcion < 0 || opcion > 4);
		return opcion;
	}

	public void validarEdad() {
		Scanner sc = new Scanner(System.in);
		boolean esMenor = false;
		do {
			System.out.println("Ingrese su edad");
			int edad = sc.nextInt();
			if (edad < 18) {
				esMenor = true;
				System.out.println("Usted no puede usar esta sistema");
			} else {
				esMenor = false;
			}

		} while (esMenor);
	}
}
