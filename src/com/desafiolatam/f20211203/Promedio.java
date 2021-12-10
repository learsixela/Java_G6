package com.desafiolatam.f20211203;

import java.util.Scanner;

public class Promedio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Crear y mostrar en pantalla, una hoja de calificaciones que 
			tendrÃ¡ la siguiente informaciÃ³n:
			â—� Nombre completo del estudiante.
			â—� Asignatura.
			â—� Nombre del Docente.
			â—� Nota 1
			â—� Nota 2.
			â—� Nota 3
		 * */
		
		System.out.println("Ingrese nombre completo alumno");
		String alumno = sc.nextLine();
		System.out.println("Nombre Asignatura");
		String asignatura= sc.nextLine();
		System.out.println("Ingrese nombre del Docente");
		String docente = sc.nextLine();
		System.out.println("Ingrese nota 1");
		Float nota1 = sc.nextFloat();
		System.out.println("Ingrese nota 2");
		Float nota2 = sc.nextFloat();
		System.out.println("Ingrese nota 3");
		Float nota3 = sc.nextFloat();
		sc.nextLine();

		String estado = "REPROBADO";
		Float promedio = (nota1+nota2+nota3)/3;

		if(promedio >= 4) {			
			estado = "APROBADO";
		}
		
		System.out.println("******* Hoja Calificiones  *******");
		System.out.println("* Alumno     :"+alumno.toUpperCase()+"         ***");
		System.out.println("* Asignatura :"+asignatura+"     ***");
		System.out.println("* Docente    :"+docente+"        ***");
		System.out.println("***********************************");
		System.out.println("* EvaluaciÃ³n **** CalificaciÃ³n  ***");
		System.out.println("* nota 1     ****    "+ nota1 +"   ***");
		System.out.println("* nota 2     ****    "+ nota2 +"   ***");
		System.out.println("* nota 3     ****    "+ nota3 +"   ***");
		System.out.println("***********************************");
		System.out.println("** PROMEDIO  **** "+Math.round(promedio*100.0)/100.0+"       ******");
		System.out.println("** ESTADO    **** "+estado+"     ***");
		/*
		if (promedio >= 4) {
			System.out.println("** ESTADO    **** APROBADO       ***");
		}else {
			System.out.println("** ESTADO    **** REPROBADO       ***");
		}
		*/
		System.out.println("***********************************");
		sc.close();
	}
}
