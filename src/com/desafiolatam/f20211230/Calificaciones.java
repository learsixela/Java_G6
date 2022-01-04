package com.desafiolatam.f20211230;

import java.util.Scanner;

public class Calificaciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		  	● Nombre completo del estudiante.
			● Asignatura.
			● Nombre del Docente.
			● Nota 1.
			● Nota 2.
			● Nota 3
		 * **/
		System.out.println("Ingrese nombre completo del estudiante");
		String estudiante = sc.nextLine();
		System.out.println("Ingrese nombre asignatura");
		String asignatura = sc.nextLine();
		System.out.println("Ingrese nombre del Docente");
		String docente = sc.nextLine();
		
		System.out.println("Ingresa nota 1");
		Float nota1 = sc.nextFloat();
		System.out.println("Ingresa nota 2");
		Float nota2 = sc.nextFloat();
		System.out.println("Ingresa nota 3");
		Float nota3 = sc.nextFloat();
		
		Float promedio = (nota1+nota2+nota3)/3;
		String estado= "Felicitaciones! Te eximiste del examen y aprobaste";
		if(promedio < 4) {
			estado = "Debes dar una prueba de recuperación \r\n"
					+ "para poder rendir el examen final";
		}else if(promedio>= 4 && promedio<=5.5) {
			estado= "Debes rendir el examen final para aprobar";
		}
		
		
		
		System.out.println();
		System.out.println("╔═════════════╦═════════════════╗");
		System.out.printf("║ Estudiante  ║ " + estudiante);
		for (int i = 1; i < (17 - estudiante.length()); i++) {
			System.out.printf(" ");
		}
		System.out.printf("║\n");
		System.out.printf("║ Docente     ║ " + docente);
		for (int i = 1; i < (17 - docente.length()); i++) {
			System.out.printf(" ");
		}
		System.out.printf("║\n");
		System.out.printf("║ Asignatura  ║ " + asignatura);
		for (int i = 1; i < (17 - asignatura.length()); i++) {
			System.out.printf(" ");
		}
		System.out.printf("║\n");
		
		System.out.println("╠═════════════╬═════════════════╣");
		System.out.printf("║ Nota 1      ║ " + nota1);
		for (int i = 1; i < (17 - nota1.toString().length()); i++) {
			System.out.printf(" ");
		}
		System.out.printf("║\n");
		
		System.out.printf("║ Nota 2      ║ " + nota2);
		for (int i = 1; i < (17 - nota2.toString().length()); i++) {
			System.out.printf(" ");
		}
		System.out.printf("║\n");
		System.out.printf("║ Nota 3      ║ " + nota3);
		for (int i = 1; i < (17 - nota3.toString().length()); i++) {
			System.out.printf(" ");
		}
		System.out.printf("║\n");
		System.out.println("╠═════════════╬═════════════════╣");
		System.out.printf("║ Promedio    ║ " + promedio);
		for (int i = 1; i < (17 - promedio.toString().length()); i++) {
			System.out.printf(" ");
		}
		System.out.printf("║\n");
		System.out.println("║"+estado);
		System.out.printf("║\n");
		System.out.println("╚═════════════╩═════════════════╝");
		
		sc.close();
	}

}
