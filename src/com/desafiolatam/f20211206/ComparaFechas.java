package com.desafiolatam.f20211206;

import java.util.Scanner;

public class ComparaFechas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("***Comparación Fechas***");
		System.out.println("Ingrese la primera fecha como DD/MM/AAAA");
		String fecha1 = sc.next();
		System.out.println("Ingrese la segunda fecha como DD/MM/AAAA");
		String fecha2 = sc.next();

		Integer dia1 = Integer.parseInt(fecha1.substring(0, 2));
		Integer mes1 = Integer.parseInt(fecha1.substring(3, 5));
		Integer ano1 = Integer.parseInt(fecha1.substring(6,10));

		Integer dia2 = Integer.parseInt(fecha2.substring(0, 2));
		Integer mes2 = Integer.parseInt(fecha2.substring(3, 5));
		Integer ano2 = Integer.parseInt(fecha2.substring(6,10));
		
		System.out.println(ano1+" " + ano2);
		
		if(ano1.equals(ano2)) {
			if (mes1 == mes2) {
				if (dia1 == dia2) {
					System.out.println("Edades son iguales");
				}else if(dia1>dia2) {
					System.out.println("Persona uno es mayor");
				}else {
					System.out.println("La persona dos es mayor");
				}
				
				
			} else if (mes1 > mes2) {
				System.out.println("La persona uno es mayor");
			}
		} else if (ano1 < ano2) {
			System.out.println("La persona uno es mayor ");

		} else {
			System.out.println("La persona dos es mayor");
		}

	}

}
