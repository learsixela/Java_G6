package com.desafiolatam.f20211204;

import java.util.Scanner;

public class Hola {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// syso ctrl + espacio
		/*
		System.out.println("Hola\n Clase G6,");
		System.out.println("buenas tardes!!");
		System.out.printf("estamos\ten\tclases\n ");
		//\n nuevo salto de linea
		System.out.printf("de java\n");
		
		*/
		System.out.println("***************");
		System.out.println("Ingrese su nombre");
		String nombre = sc.nextLine();
		System.out.println("Ingrese su apellido");
		String apellido = sc.next();
		System.out.println("Ingrese su edad");
		Integer edad = sc.nextInt();
		
		//VARIABLES
		String calle= "asd 234! #% ";
	
		int numero = 3;
		Integer numero1 = 3;
		
		//+ suma de String, se concatenan(juntan los textos)
		//String + String = String
		System.out.println("123"+" 456");
		//numero+String = String
		System.out.println(123 + "456");
		//String + Boolean= String
		System.out.println("123"+ true);
		//numero + numero= numero
		System.out.println(123+456);
		
		//SubString, todo String comienza desde la posicion cero
		String palabra = "Paralelepipedo";
		System.out.println(palabra.substring(0, 4));
		System.out.println(palabra.substring(4, 8));
		System.out.println(palabra.substring(8));
		
		String uno_caracter   ="1";
		String uno_palabra  ="uno";
		Integer uno_numero = 1;
		
		final float PI =3.14f;
		final float FUERZAG = 9.8f;
		
	}
	
//fin
}
