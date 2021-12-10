package com.desafiolatam.f20211204;

import java.util.Scanner;

public class CicloDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**
		 * DO-While
		 *
		 */ 
		/*boolean opcion = false;
		//do-while nos permite realizar a lo menos una accion
		do {
			System.out.println("hola clase");
			opcion = true;
		}while(opcion);*/
		int edad =0;
		boolean esMenor = false;
		do {
			System.out.println("Ingrese su edad");
			edad = sc.nextInt();
			/*if(edad < 18) {
				esMenor = true;
			}else {
				esMenor = false;
			}*/
		//}while(esMenor);		 
		}while(edad < 18);
		
		System.out.println("Fuera del Do-While");
		
		int numero = 0;
		do {
			System.out.println("Ingrese un numero par");
			numero = sc.nextInt();			
			// % -> modulo o resto de la division
		}while(numero%2 != 0);
		// 4/2=2  resto=0
		System.out.println("Numero par "+numero);
		
		//numero%2 != 0 -> impar
		//numero%2 == 0 -> par
		sc.close();
	}

}
