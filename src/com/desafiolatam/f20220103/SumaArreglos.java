package com.desafiolatam.f20220103;

import java.util.Scanner;

public class SumaArreglos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		   //posiciones  0 1 2 3 4 5 6 7 8 9  
		int[] numeros = {4,6,687,45,977,354,1,23,5,576,741};

		//variable acumuladoras
		int sumaTotal = 0;//variable = variable + algo;
		
		//System.out.println(numeros[2]);
		
		for (int i = 0; i < numeros.length; i++) {//i=3		
			sumaTotal  = sumaTotal + numeros[i];
		}
		
		System.out.println("suma total "+sumaTotal);
		
		//solicitar inicio y fin del rango a consultar 
		sumaTotal = 0;
		System.out.println("Ingrese rango inicio");
		int inicio = sc.nextInt();
		System.out.println("Ingrese rango fin");
		int fin = sc.nextInt();
		
		
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]>=inicio && numeros[i]<=fin ) {
				//sumaTotal  = sumaTotal + numeros[i];
			}
		}
		
		System.out.println("suma total 2: "+sumaTotal);
		
		int[] sueldos = { 400000, 760000, 1100000, 650000, 654980, 987300, 700450, 442300 };
		int sumaSueldos = 0;
		int contador = 0;
		for (int i = 0; i < sueldos.length; i++) {
			
			if(sueldos[i]> 500000) {
				sumaSueldos = sumaSueldos + sueldos[i];
				contador = contador + 1;//contador++;
			}
		}
		int promedio = sumaSueldos/contador;
		System.out.println("El promedio de sueldos es : "+ promedio);
		

		
		
		
	}

}
