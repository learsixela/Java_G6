package com.desafiolatam.f20211210;

import java.util.ArrayList;
import java.util.Collections;

public class MaximoMinimo {

	public static void main(String[] args) {
		/*crear un método que nos permita obtener la nota máxima 
			y mínima de un conjunto de exámenes del curso 
			Programación Java.
			Estas notas deben ser mostradas por consola.
			Se entregan las siguientes notas : 
			● 4.7
			● 2.2
			● 5.4
			● 6.9
			● 4.4
			● 2.6 
		* */
		notaMaxMin();

	}
	
	public static void notaMaxMin() {
		ArrayList<Float> notas = new ArrayList<Float>();
		notas.add(4.7f);
		notas.add(2.2f);
		notas.add(5.4f);
		notas.add(6.9f);
		notas.add(4.4f);
		notas.add(2.6f);
		
		System.out.println("Nota maxima: "+Collections.max(notas));
		System.out.println("Nota minima: "+Collections.min(notas));
		
	}

}
