package com.desafiolatam.f20211223;

public class Main {

	public static void main(String[] args) {
		
		double promedio = promedio(args);
		System.out.println("El promedio es: "+ promedio);
	}
	//["1","4","7","2","8","3"] arreglo.length = 6 
	//arreglo[arreglo.length - 1 ] -> al ultimo elemento
	
	public static double promedio(String[] arreglo) {
		//promedio = suma de elementos / cantidad de elementos(arreglo.length);
		int suma = 0;//variable acumuladora; variable = variable + algo;
		for (int i = 0; i < arreglo.length; i++) {//i=2
			//arreglo[posicion] ; arreglo.get(posicion);
			int numero = Integer.parseInt(arreglo[i]);
			suma = suma + numero;
		}
		double promedio = suma / arreglo.length;
		
		return promedio;
	}
}