package com.desafiolatam.f20211206;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bomba {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		//solicitar numero
		System.out.println("Ingresar numero de inicio de secuencia");
		
		try {
			//almacenar numero
			 numero = sc.nextInt();
		} catch (Exception e) {
			System.out.println("error -> "+e);
			System.out.println("Error ingreso de datos...");
		}finally {
			// Instrucciones que se ejecutan, tanto si hay
			//como si no hay excepciones
		}

		//recorrer en forma inversa (for)
		for(int i = numero; i >= 0; i-=2) {
			//imprimir cada ciclo
			System.out.println(" segundo -> " + i);
		}
		
		System.out.println("** Fin del programa");
	}

}
