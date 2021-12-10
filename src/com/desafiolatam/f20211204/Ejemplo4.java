package com.desafiolatam.f20211204;

import java.util.Scanner;

public class Ejemplo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		Float rt= (float) 0;
		Float r1 = 1f;
		Double r2 = 1d;
		int num = 1231456 * 4664344;
		
		do {
			System.out.println("Ingrese la resistencia 1 ");
			r1 = sc.nextFloat();
			
			contador = contador + 1;//variable de control
			if(contador == 4) {//solo 4 veces
				r1 = 1f;//limpiar la variable
				break;
			}
			
		}while(r1 <= 0);
		
		
		System.out.println("Fuera del while "+r1);
	}

}
