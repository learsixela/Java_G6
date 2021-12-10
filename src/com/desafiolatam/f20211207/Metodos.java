package com.desafiolatam.f20211207;

import java.util.Scanner;

public class Metodos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese numero");
		float numero = sc.nextFloat();
		imprimir(numero);
		imprimir("Clase Hola");
		imprimir(101);
		imprimir(100f);
		imprimir(99, " el numero es " );
		imprimir(" el numero es ",98 );
	}
	
	//void, no retornara NADA, solo ejecutar
	public static void imprimir() {
		System.out.println("Hola clase");
	}
	//sobrecarga de metodo
	/**
	 * Esto es una sobrecarga del metodo imprimir
	 * recibe un String
	 * @param texto
	 * @return Integer
	 * */
	public static void imprimir(String texto) {
		System.out.println(texto);
	}
	public static void imprimir(int numero) {
		System.out.println(numero);
	}
	public static void imprimir(float numero) {
		System.out.println(numero);
	}
	public static void imprimir(int numero ,String texto) {
		System.out.println(texto + numero);
	}
	public static void imprimir(String texto , int numero) {
		System.out.println(texto + numero);
	}
	
	public static void calculoArea() {
		Math.pow(4, 2);
	}
}
