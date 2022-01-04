package com.desafiolatam.f20220103;

import java.util.Arrays;

public class ArrayEstaticos {

	public static void main(String[] args) {
		// conjunto de datos, separados por coma, ordenados segun su ingreso
		// todos lo arreglos comienzan en la posicion cero.
		// TipoDato[] variable = new TipoDato[cantidadElementos]
		// variable.length -> tamaño del arreglo = cantidad Elementos.
		
		//crear el arreglo
		int[] numeros  = new int[4];
		//agregar valores al arreglo
		//variable[posicion]
		numeros[0] = 1;
		System.out.println(numeros);		
		numeros[1] = 42;
		numeros[2] = 9;
		numeros[3] = 77;		
		//numeros[4] = 0;//fuera de indice
		
		String[] vocales = {"a","e","i","o","u"};// new String[5]; //
		vocales[0] = "y";// si existe sobreescribe el valor en esa posicion
		System.out.println("valor en la posicion cero "+vocales[0]);
		System.out.println("tamaño: "+vocales.length);
		
		System.out.println("elemento en la ultima posicion: "+vocales[vocales.length-1]);
		
		//recorrer el arreglo
		for (int i = 0; i < vocales.length; i++) {
			//vocales[i] = "s";
			System.out.println(vocales[i]);			 
		}
		
		System.out.println("Nuevo array: "+Arrays.toString(vocales));
	}

}
