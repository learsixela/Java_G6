package com.desafiolatam.f20211209;

public class Suma {

	public static void main(String[] args) {
		/*	Construir un programa el cual nos permita sumar los 
			valores que estén entre 1 y 10 dentro de un arreglo.
		 */
		System.out.println(suma());

	}
	
	//● Crear un método llamado Suma que retorna un número entero de la suma.
	public static int suma() {
		//● Dentro del método suma, declarar una variable local llamada suma que parte en cero.
		int suma = 0;
		//● Inicializar el arreglo con valores aleatorios.
		int[] numeros = {23,3,77,49,26,82,6,1,8};//17
		
		//● Recorrer el arreglo con un ciclo for.
		for (int i = 0; i < numeros.length; i++) {
			//● Dentro del ciclo, realizar condición if donde preguntamos por los valores que están en el intervalo solicitado.
			if(numeros[i]>1 && numeros[i] <10) {
				//● Si la condición se cumple, sumará todos los valores.
				suma = suma + numeros[i];
			}
		}		
		return suma;
	}

}
