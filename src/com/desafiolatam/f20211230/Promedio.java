package com.desafiolatam.f20211230;

import java.util.Scanner;

public class Promedio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese nombre:");
		String nombre = sc.nextLine();
		System.out.println("Ingrese asignatura:");
		String asignatura = sc.nextLine();
		System.out.println("Ingrese Docente:");
		String docente = sc.nextLine();
		System.out.println("Ingrese nota 1");
		float nota1 = sc.nextFloat();
		System.out.println("Ingrese nota 2");
		float nota2 = sc.nextFloat();
		System.out.println("Ingrese nota 3");
		float nota3 = sc.nextFloat();
		sc.nextLine();
		float promedio = (nota1 + nota2 + nota3) / 3;

		String mensaje = "Felicitaciones! Te eximiste del examen y aprobaste";

		System.out.println("Su promedio es: "+promedio);
		if (promedio < 4) {
			mensaje = "Debes dar una prueba de recuperación para poder rendir el examen final";
		} else if (promedio >= 4 && promedio < 5.6) {
			mensaje = "Debes rendir el examen final para aprobar";
		}

		System.out.println(mensaje);
	}
}
