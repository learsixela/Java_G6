package com.desafiolatam.f20220103;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* tamaño arreglo 6; tamaño 6
		 * Crear un array a partir de los datos ingresados por el usuario,
		 * buscar aquellos que esten en el rango solicitado al usuario
		 * los guarda en el otro array y los muestra.
		 * */
				int[] numeros1 = new int[6];
				int[] numeros2 = new int[6];
				
				for (int i = 0; i < 6; i++) {
					System.out.println("Ingrese "+(i+1)+" numero al arreglo");
					numeros1[i] = sc.nextInt();
					//numeros1[i] = digito;
				}
				System.out.println("**************************");
				
				System.out.println("Ingrese rango inicio");
				int inicio = sc.nextInt();
				System.out.println("Ingrese rango fin");
				int fin = sc.nextInt();
				int contador = 0;
				
				for (int i = 0; i < numeros1.length; i++) {
					if(numeros1[i]>=inicio && numeros1[i]<=fin ) {
						numeros2[contador]= numeros1[i];
						contador++;
					}					
				}
				System.out.println("Array lleno: "+Arrays.toString(numeros1));
				System.out.println("Nuevo array: "+Arrays.toString(numeros2));
	}

}