package com.desafiolatam.f20211210;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterador {

	public static void main(String[] args) {
		filtroNombre("Luis");
	}
	
	public static void filtroNombre(String parametro) {
		// Paso 1
		ArrayList<String> nombres = new ArrayList<String>();
		// Paso 2
		nombres.add("Juan");
		nombres.add("Pedro");
		nombres.add("Luis");
		nombres.add("Ana");
		
		System.out.println(nombres);
		// Paso 3 y 4
		for (Iterator iterator = nombres.iterator(); iterator.hasNext();) {
			// Paso 5
			//iterator.next();
			String elemento = (String) iterator.next();
			// Paso 6
			if (elemento.equals(parametro)) {
				// Paso 7
				System.out.println("Elemento encontrado -> " + elemento);
			} else {
				// Paso 8
				iterator.remove();
				System.out.println("Elemento no encontrado -> " + elemento);
			}
		}
		
		System.out.println(nombres);
	}

}
