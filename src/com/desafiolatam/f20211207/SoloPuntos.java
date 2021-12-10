package com.desafiolatam.f20211207;

import java.util.Scanner;

public class SoloPuntos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// inicializar variables
		int cantidad = 0;

		try {
			do {
				// Solicitar ingreso de cantidad a mostrar
				System.out.println("Ingrese cantidad a mostrar *");
				// Guardamos en una variable
				cantidad = sc.nextInt();
				// Validar el valor ingresado
			} while (cantidad <= 0);

		} catch (Exception e) {
			System.out.println("Error de ingreso..");
		}

		// codificar la solucion
		// ciclo repetitivo hasta el valor ingresado
		for (int i = 0; i < cantidad; i++) {//5
			System.out.printf("*");
		}
		System.out.println("\n-----");
		for (int i = cantidad; i > 0; i--) {//5
			if(i%2 == 0) {
				System.out.printf(".");
			}else {
				System.out.printf("*");
			}
		}
//fin 
	}
}
