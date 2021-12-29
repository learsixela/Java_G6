package com.desafiolatam.f20211221;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resultado = 0;
		boolean fallo = false;
		do {
			try {
				System.out.println("Ingrese dividendo");
				String dividendo = sc.nextLine();

				System.out.println("Ingrese numero divisor");
				Integer divisor = sc.nextInt();
				sc.nextLine();
				if (divisor == 0) {
					divisor = null;
				}
				resultado = Integer.parseInt(dividendo) / divisor;
				fallo = false;
			} catch (ArithmeticException error) {
				System.out.println("Error aritmetico");
				System.out.println(error.getMessage());
				fallo = true;
			} catch (InputMismatchException ime) {
				System.out.println("Error de ingreso de datos...");
				System.out.println(ime.getMessage());
				resultado = 0;
				fallo = true;
			} catch (NullPointerException npe) {
				System.out.println("TU VARIABLE NO PUEDE SER NULA");
				//throw new NullPointerException("Por favor ingrese un numero distinto");
				fallo = true;
			} catch (NumberFormatException nfe) {
				System.out.println("Error al transformar a numero");
				throw new NumberFormatException(nfe.getMessage());
			} catch (Exception e) {
				System.out.println("Excepcion: " + e);

			}
		} while (fallo);
		
		System.out.println("El resultado es: " + resultado);
	}

}