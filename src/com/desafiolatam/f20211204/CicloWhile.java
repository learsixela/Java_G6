package com.desafiolatam.f20211204;

import java.util.Scanner;

public class CicloWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**
		 * WHILE
		 * */
		int numero = 0;
		//si es verdadero ingresa a while
		while(numero < 4) {
			System.out.println("Dentro del while");
			numero++;//numero = numero + 1;
			//siempre debo agregar una condicion de termino
		}
		System.out.println("Fuera del while");
		sc.close();
	}

}
