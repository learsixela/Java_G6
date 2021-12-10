package com.desafiolatam.f20211209;

import java.util.ArrayList;

public class ArreglosDinamicos {

	public static void main(String[] args) {
		ArrayList<String> alumnos = new ArrayList<String>();
		///List<String> alumnos = new ArrayList<String>();
		
		
		//tamaño size()
		System.out.println(alumnos.size());//the number of elements in this list
		
		//agregar al final de la lista
		alumnos.add("German");
		alumnos.add("Isra");
		alumnos.add("Hector");
		alumnos.add("Isabel");
		//alumnos.add("German");
		
		System.out.println(alumnos.size());//4
		System.out.println(alumnos);
		
		alumnos.add(2,"Edinson");//desplazar a derecha el resto de elementos
		System.out.println(alumnos.size());//4
		System.out.println(alumnos);
		
		//set; reemplaza el valor existente
		String nombre = alumnos.set(1, "Joaquin");
		//alumnos.add(0,nombre);
		//System.out.println(nombre);
		System.out.println(alumnos.size());//
		System.out.println(alumnos);
		
		/**
		 * REMOVER
		 * */
		
		//remover por indice
		alumnos.remove(1);
		System.out.println(alumnos.size());//
		System.out.println("remove "+alumnos);
		
		//remover por coicidencia
		alumnos.remove("German");
		System.out.println(alumnos.size());//
		System.out.println("remove "+alumnos);
		
		
		
		alumnos.clear();//elimina todos los elementos de esta lista
		System.out.println(alumnos.size());//
		System.out.println(alumnos);
		
		
		
		
		
		
		
		/*ArrayList<Integer> numerosPares = new ArrayList<Integer>();
		numerosPares.add(2);
		numerosPares.add(4);
		numerosPares.add(6);
		numerosPares.add(8);
		System.out.println(numerosPares);
		numerosPares.clear();
		System.out.println(numerosPares);*/
	}

}
