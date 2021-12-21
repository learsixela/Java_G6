package com.desafiolatam.f20211210;

import java.util.ArrayList;
import java.util.Collections;

public class ArreglosDinamicos {

	public static void main(String[] args) {
		ArrayList<String> alumnos = new ArrayList<String>();
		/// List<String> alumnos = new ArrayList<String>();

		// tamaño size()
		System.out.println(alumnos.size());// the number of elements in this list

		// agregar al final de la lista
		alumnos.add("German");
		alumnos.add("Isra");
		alumnos.add("Hector");
		alumnos.add("Isabel");
		// alumnos.add("German");
		
		//acceder a un elemento por posicion
		alumnos.get(0);//German
		alumnos.get(1);//Isra
		alumnos.get(2);//Hector
		alumnos.get(3);//Isabel
		

		System.out.println(alumnos.size());// 4
		System.out.println(alumnos);

		alumnos.add(2, "Edinson");// desplazar a derecha el resto de elementos
		System.out.println(alumnos.size());// 4
		System.out.println(alumnos);

		// set; reemplaza el valor existente
		String nombre = alumnos.set(1, "Joaquin");
		// alumnos.add(0,nombre);
		// System.out.println(nombre);
		System.out.println(alumnos.size());//
		System.out.println(alumnos);

		/**
		 * REMOVER
		 */

		// remover por indice
		alumnos.remove(1);
		System.out.println(alumnos.size());//
		System.out.println("remove " + alumnos);

		// remover por coicidencia
		alumnos.remove("German");
		System.out.println(alumnos.size());//
		System.out.println("remove " + alumnos);
		alumnos.add("zisrael");
		alumnos.add("zisrael");
		System.out.println(alumnos);
		System.out.println("minimo alumnos "+ Collections.min(alumnos));
		System.out.println("maximo alumnos "+ Collections.max(alumnos));
		
		/*FRECUENCY*/
		
		System.out.println("Lista frecuency"+alumnos);
		System.out.println("frecuencia "+ Collections.frequency(alumnos,"zisrael"));
		
		alumnos.clear();// elimina todos los elementos de esta lista
		System.out.println(alumnos.size());//
		System.out.println(alumnos);

		/* Maximo y Minimo*/

		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(5);
		numeros.add(1);
		numeros.add(6);
		numeros.add(4);
		numeros.add(1);
		numeros.add(2);
		numeros.add(6);
		System.out.println(numeros);
		System.out.println("minimo "+ Collections.min(numeros));
		System.out.println("maximo "+Collections.max(numeros));
		
		Collections.sort(numeros);
		Collections.reverse(numeros);
		System.out.println(numeros);
		
		
		ArrayList<String> alumnosRepitentes = new ArrayList<String>();
		
		System.out.println(alumnos);
		alumnos.add("Israel");
		//NUNCA HACER ESTO; NO ES UNA COPIA
		//alumnosRepitentes = alumnos;
		alumnosRepitentes.addAll(alumnos);
		
		System.out.println("alumnos "+alumnos);
		System.out.println("repitentes "+alumnosRepitentes);
		
		alumnos.add("German");
		System.out.println("alumnos "+alumnos);
		System.out.println("repitentes "+alumnosRepitentes);
		
		
		
		
	}

}
