package com.desafiolatam.f20211221;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resultado = 0;
		
		try {
			System.out.println("Ingrese numero divisor");
			int divisor = sc.nextInt();

			resultado = 3 /divisor;

		} catch (ArithmeticException error) {
			System.out.println("Error aritmetico");
			System.out.println(error.getMessage());
		} catch (InputMismatchException ime) {
			System.out.println("Error de ingreso de datos...");
			System.out.println(ime.getMessage());
			resultado = 0;
		} catch (Exception e) {
			System.out.println("Excepcion: " + e);
		}

		System.out.println("El resultado es: " + resultado);
	}

}