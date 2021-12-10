package com.desafiolatam.f20211203;

public class Flujo2 {

	public static void main(String[] args) {
		/**
		 * Condicionales
		 * */ 

		//IF, evalua si es verdadera la condicion
		int numero1 = 4;//un igual -> asignacion
		int numero2 = 5;
		if(numero1 == numero2) {//dos iguales, comparacion
			System.out.println("Son iguales");
		}
		
		// IF -ELSE
		if(numero1 == numero2) {//dos iguales, comparacion
			System.out.println("Son iguales");
		} else {
			System.out.println("Son diferentes");
		}
		
		//IF-ELSE IF- ELSE
		if(numero1 == numero2) {//dos iguales, comparacion
			System.out.println("Son iguales");
		}else if(numero1 < numero2) {
			System.out.println("numero1 es menor a numero2");
			System.out.println("numero2 es mayor a numero1");
		} else {
			System.out.println("numero1 es mayor a numero2");
			System.out.println("numero2 es menor a numero1");
		}
		
		if(numero1 < 0) {
			System.out.println("numero1 es menor a cero");
		}else {
			System.out.println("numero1 no es menor a cero");
		}
		
		if(numero1 > 0) {
			System.out.println("numero1 no es menor a cero");
		}else {
			System.out.println("numero1 es menor a cero");
		}
		
		/**
		 * STRING
		 */
		String vocales1="aeiou";
		String vocales2="AeIoU ";
		
		//if(vocales1 == vocales2) {NO se hace NUNCA
		if(vocales1.equals(vocales2)) {
			System.out.println("son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		if(vocales1.equalsIgnoreCase(vocales2)) {
			System.out.println("son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		System.out.println("texto a mayuscula "+vocales1.toUpperCase());
		System.out.println("texto a minuscula "+ vocales2.toLowerCase());
		
		//compareTo
		String letras1 ="a";
		String letras2 ="b"; 

		if(letras1.compareTo(letras2) < 0) {
			System.out.println(letras1.compareTo(letras2));
			System.out.println(letras1+" esta antes que "+letras2);
		}else if(letras1.compareTo(letras2) > 0) {
			System.out.println(letras2.compareTo(letras1));
			System.out.println(letras2+" esta despues que "+letras1);
		}else {
			System.out.println("Alfabeticamente ocupan el mismo lugar");
		}
			
	}

}
