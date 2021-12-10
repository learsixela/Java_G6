package com.desafiolatam.f20211204;

import java.util.Scanner;

public class Fechas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("***Comparación Fechas***");
		System.out.println("Ingrese la primera fecha como DD/MM/AAAA");
		String fecha1 = sc.next();
		System.out.println("Ingrese la segunda fecha como DD/MM/AAAA");
		String fecha = sc.next();
		String anio1 = fecha1.substring(6);
		String anio2 = fecha.substring(6);
		int ano1 = Integer.parseInt(anio1);
		int ano2 = Integer.parseInt(anio2);
		if(ano1==ano2) {
			System.out.println("Iguales");
		}
	
	}

}
