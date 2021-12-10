package com.desafiolatam.f20211203;

import java.util.Scanner;

public class Guiado2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		Escribir Texto para un destinatario de una encomienda.
		Para ello debemos pedir al usuario los distintos campos 
		que se requerirÃ¡n: 
			â—� Nombre String
			â—� Apellido String
			â—� DirecciÃ³n String
			â—� NÃºmero DirecciÃ³n Integer - String
			â—� Ciudad String
			â—� TelÃ©fono String
		*/

		System.out.println("Ingrese el nombre del destinatario");
		String nombre = sc.nextLine();
		System.out.println("Ingrese el apellido del destinatario");
		String apellido = sc.next();
		System.out.println("Ingrese el direccion del destinatario");
		String direccion = sc.next();
		System.out.println("Ingrese el numero direccion del destinatario");
		Integer numero = sc.nextInt();
		System.out.println("Ingrese el ciudad del destinatario");
		String ciudad = sc.next();
		System.out.println("Ingrese el telÃ©fono del destinatario");
		String telefono = sc.next();
		
		//--
		System.out.println("******************");
		System.out.println("*  Destinatario  *");
		System.out.println("******************");
		
		System.out.println("*El destinatario es "+ nombre+" "+apellido);
		System.out.println("*la direccion de destino es "+direccion+" #"+numero);
		System.out.println("*ubicada en "+ciudad);
		System.out.println("*favor avisar al telefono "+telefono);
		System.out.println("******************");
		sc.close();
	}
}
