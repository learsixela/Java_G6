package com.desafiolatam.f20211228;

public class Main {

	public static void main(String[] args) {
		//primitivos
		//se escriben con minuscula
		//int,long, float , double, boolean, char
		int edad=0;
		System.out.println(edad);
		
		Integer numero2=null;
		System.out.println(numero2);
		
		String texto="asasdfasASDASFG1212312!#!$'''";
		System.out.println(texto);
		
		//concatenacion
		//String + String = String
		System.out.println("hola"+"clase");//holaclase
		//String + numero = String
		System.out.println("hola"+1234);//hola1234
		//numero + numero + String = String
		System.out.println(1+2+"hola");//3hola
		//String + numero+ numero = String
		System.out.println("hola"+1+2);//hola12
		System.out.println();
		String resultadoConcatenacion = "hola"+1+2;
		
		int dosNumero = 2;//numero
		String dosSimbolo = "2";//simbolo
		String dosPalabra = "dos";//palabra
		
		//SubString
		String palabraLarga = "electro encefalo grafista";
		String texto1 = palabraLarga.substring(0,7);//[0,7[
		System.out.println("texto: "+texto1);
		String texto2 = palabraLarga.substring(7,15);
		System.out.println("texto2: "+texto2);
		String texto3 = palabraLarga.substring(15);
		System.out.println("texto3: "+texto3);
		
		System.out.println(palabraLarga.length());
		
		
		
	}

}