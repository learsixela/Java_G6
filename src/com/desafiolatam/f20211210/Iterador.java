package com.desafiolatam.f20211210;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Iterador {

	public static void main(String[] args) {
		
		 filtroNombre();
	}

	static void filtroNombre() {
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		int numero = 0;
		
		ArrayList<String> nombres = new ArrayList<String>();		
		nombres.add("Juan");
		nombres.add("Pedro");
		nombres.add("Ana");
		nombres.add("Luis");
		nombres.add("Ana");
		ArrayList<String> encontrados = new ArrayList<String>();
		//copiar los elemento a la nueva lista
		ArrayList<String> noEncontrados = new ArrayList<String>(nombres);
		
		
		do {
			System.out.println("** Ingrese nombre a buscar **");
			nombre = sc.nextLine();

			for (Iterator iterator = noEncontrados.iterator(); iterator.hasNext();) {

				String elemento = (String) iterator.next();				
				if (elemento.equalsIgnoreCase(nombre)) {
					encontrados.add(elemento);
					iterator.remove();
				}				
			}
			
			System.out.println("** Quiere buscar otro nombre **");
			System.out.println("** (0)NO - (1) SI **");
			numero = sc.nextInt();
			sc.nextLine();

		} while (numero == 1);
		
		System.out.println("lista "+nombres);
		System.out.println("encontrados "+encontrados);
		System.out.println("no encontrados "+noEncontrados);
		
		if (numero == 0) {
			System.out.println("Adios !!");
		}
	}
}
