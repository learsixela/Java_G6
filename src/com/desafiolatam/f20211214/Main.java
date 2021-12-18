package com.desafiolatam.f20211214;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//ejecutar();//llamado al metodo
		 //ArrayList<Integer> numeros = misNumeros();
		//ingresarNumero(numeros);
		obtenerAlumnos();
	}

	public static void ejecutar() {
		System.out.println("Hola clase");
		obtenerAlumnos();
		ejecutarConParametros("Hola clase 2",3);
		//capturando el valor de retorno
		Float valorPromedio = calcularPromedio();//Float valor = 3.0;
		System.out.println("El promedio es: "+valorPromedio);
		String texto = obtenerNombre(15);//String texto = "Menor de edad";
		System.out.println(texto);
		calcularPromedio();
	}
	public static void ejecutarConParametros(String texto, Integer numero) {
		//String texto = "Hola clase";
		System.out.println("tamaño del texto: "+texto.length());
		System.out.println("numero : "+numero.toString());//"3"
	}
	
	public static Float calcularPromedio() {
		Float promedio = (float) ((2+6+4+3+1+7)/6);
		return promedio;//return 3.0;

	}  
	
	public static String obtenerNombre(Integer edad) {
		String nombre = "Desafio";
		if(edad >= 18) {
			return nombre;//return "Desafio";
		}
		return "Menor de edad";
	}
	
	public static void obtenerAlumnos(){
		ArrayList<String> alumnos = new ArrayList<String>();
		alumnos.add("Edinson");
		alumnos.add("Dario");
		alumnos.add("Felipe");
		alumnos.add("Isabel");
		alumnos.add("Joaquin");
		alumnos.add("Jose");
		alumnos.add("Nelson");
		alumnos.add("Osvaldo");
		alumnos.add("Rodrigo");
		alumnos.add("Yerkarin");
		alumnos.add("Hectoles");
		Collections.sort(alumnos);
		Collections.reverse(alumnos);
		System.out.println("Alumnos presentes hoy: "+ alumnos);
		//return alumnos;//return ["Edinson",...,"Hectoles"]
		
	}
	
	public static ArrayList<Integer> misNumeros() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(123);
		numeros.add(4541);
		numeros.add(-25485);
		numeros.add(0);
		numeros.add(3);
		System.out.println("Creados: "+numeros);
		Collections.sort(numeros);
		System.out.println("Ordenados: "+numeros);
		Collections.reverse(numeros);
		System.out.println("Orden invertido: "+numeros);
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		Integer numero = sc.nextInt();
		numeros.add(numero);
		System.out.println("nuevo arreglo: "+numeros);
		return numeros;
	}
	
	public static void ingresarNumero(ArrayList<Integer> numeros) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		Integer numero = sc.nextInt();
		numeros.add(numero);
		
		System.out.println(numeros);
	}
	
}