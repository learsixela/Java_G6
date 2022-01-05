package com.desafiolatam.f20220104;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ForEachMain {

	public static void main(String[] args) {
		ArrayList<String> listaPersonas = new ArrayList<String>();

		listaPersonas.add("zzz");
		listaPersonas.add("Monica");
		listaPersonas.add("Isabel");
		listaPersonas.add("Nelson");

		// ordenar de forma ascendente, menor a mayor, "a" a "z"
		Collections.sort(listaPersonas);
		System.out.println(listaPersonas);
		// NO ORDENA DESCENDENTEMENTE, orden inverso
		Collections.reverse(listaPersonas);

		for (String persona : listaPersonas) {
			System.out.println(persona);
		}

		System.out.println();

		for (Iterator iterator = listaPersonas.iterator(); iterator.hasNext();) {
			String persona = (String) iterator.next();
			System.out.println(persona);

		}
		System.out.println();
		for (int i = 0; i < listaPersonas.size(); i++) {
			System.out.println(listaPersonas.get(i));
		}

		System.out.println();
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(5);
		numeros.add(1);
		numeros.add(-4);
		numeros.add(1);
		numeros.add(-4);
		numeros.add(6);
		numeros.add(-4);
		System.out.println(numeros);
		System.out.println(Collections.min(numeros)); // 1
		System.out.println(Collections.max(numeros)); // 6
		System.out.println(Collections.frequency(numeros, 1)); //2
		
		System.out.println(Collections.frequency(numeros, Collections.min(numeros))); 
		
		
	}

}
