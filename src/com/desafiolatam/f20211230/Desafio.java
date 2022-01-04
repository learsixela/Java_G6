package com.desafiolatam.f20211230;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int saldo= 1000000;
		/*
		 * Desarrollar menu de cajero automatico
		 * Saldo inicial 1.000.000.-
		 * 1.- girar
		 * 2.- consultar 
		 * 3.- depositar
		 * */
		
		
		System.out.println("****Cajero Automatico ****");
		System.out.println("* Seleccione una opcion: *");
		//System.out.println("* 0.- Salir");
		System.out.println("* 1.- Girar");
		System.out.println("* 2.- Consultar");
		System.out.println("* 3.- Depositar");
		System.out.println("**************************");
		int opcion = sc.nextInt();
		
		if(opcion == 1) {
			System.out.println("Ingrese monto a girar");
			int monto = sc.nextInt();
			
			if(monto > saldo ) {
				System.out.println("Saldo insuficiente");
			}else {
				saldo = saldo-monto;				
				System.out.println("su saldo final es: $"+ saldo);
			}
		}else if(opcion == 2) {
			System.out.println("su saldo final es: $"+ saldo);
		}else {
			System.out.println("Ingrese monto a depositar");
			int deposito = sc.nextInt();
			if(deposito <= 0) {
				System.out.println("Monto no valido");
			}else {
				saldo = saldo+deposito;
				System.out.println("su saldo final es:"+saldo);
			}
		}
				
	}

}
