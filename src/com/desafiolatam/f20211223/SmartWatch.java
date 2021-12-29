package com.desafiolatam.f20211223;

import java.util.ArrayList;

public class SmartWatch {

	public static void main(String[] args) {

		ArrayList<Integer> pasosFiltrados = clearSteps(args);
		double promedio = promedio(pasosFiltrados);
		System.out.println("El promedio es: "+ promedio);
	}

	public static ArrayList<Integer> clearSteps(String[] arreglo) {
		ArrayList<Integer> pasosFiltrados = new ArrayList<Integer>();
		
		for (int i = 0; i < arreglo.length; i++) {
			int numero = Integer.parseInt(arreglo[i]);

			if (numero >= 200 && numero <= 100000) {
				pasosFiltrados.add(numero);
			}
		}
		return pasosFiltrados;
	}
	
	public static double promedio(ArrayList<Integer> arreglo) {
		//promedio = suma de elementos / cantidad de elementos(arreglo.length);
		int suma = 0;//variable acumuladora; variable = variable + algo;
		for (int i = 0; i < arreglo.size(); i++) {//i=2
			//arreglo[posicion] ; arreglo.get(posicion);
			int numero =arreglo.get(i);
			suma = suma + numero;
		}
		double promedio = suma / arreglo.size();
		
		return promedio;
	}
}
