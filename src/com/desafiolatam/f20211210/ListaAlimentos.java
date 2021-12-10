package com.desafiolatam.f20211210;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListaAlimentos {

	public static void main(String[] args) {
		ordenar();
	}
	
	public static void ordenar() {
		List<String> comidas = new ArrayList<String>();
		comidas.add("Cazuela");
		comidas.add("Porotos");
		comidas.add("Pastel de Choclo");
		comidas.add("Ají de gallina");
		comidas.add("Ceviche");
		comidas.add("Arepas");
		//orden de arreglo
		Collections.sort(comidas);
		
		System.out.println(comidas);
		
		System.out.println("\n ** Menu del dia**\n");
		
		for (int i = 0; i < comidas.size(); i++) {
			//acceder por indice a cada elemento
			System.out.println("* "+comidas.get(i));
		}
		System.out.println();
		
		for (Iterator iterator = comidas.iterator(); iterator.hasNext();) {
			iterator.next();
			iterator.next();
			iterator.next();
			iterator.next();
		
			String alimento = (String) iterator.next();//cazuela
			
			System.out.println("* "+alimento );
		}
		System.out.println(comidas);
	}
	
	/*
	 * Crear un método llamado “ordenar” que nos permita 
ordenar alfabéticamente una lista de platos de un 
restaurante, también se debe mostrar lista ordenada por 
pantalla.
Esta lista cuenta con los siguientes datos: 
● Cazuela
● Porotos
● Pastel de Choclo
● Ají de gallina
● Ceviche
● Arepas.

	 * */
}
