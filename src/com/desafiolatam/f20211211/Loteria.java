package com.desafiolatam.f20211211;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Loteria {

	public static void main(String[] args) {
		
		
		loteria();
	}
	
	public static void loteria() {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		//generar dimanicamente(for) arreglo con numero del 1 al 99
		ArrayList<Integer> arregloNumeros =new ArrayList<Integer>();
		for (int i = 1; i < 100; i++) {
			arregloNumeros.add(i);//agregar numero al arreglo
		}
		//crear arreglo vacio, para almacenar los encontrados
		ArrayList<Integer> numerosEncontrados =new ArrayList<Integer>();
		
		do {
			//generar numero aleatorio en 1 y 99 
			int numeroAleatorio = (int) Math.floor(Math.random()*100+1);//0 al 99
			System.out.println("NUMERO CANTADO: "+numeroAleatorio);
			//buscar numero en el arreglo (Iterador)
			for (Iterator iterator = arregloNumeros.iterator(); iterator.hasNext();) {
				Integer numero = (Integer) iterator.next();// asignará del 1 al 99
				if(numero == numeroAleatorio) {
					//llenar arreglo de encontrados 
					numerosEncontrados.add(numeroAleatorio);
					//eliminar de arreglo original(o copia)(arregloNumeros) el numero
					iterator.remove();
				}
			}
			//preguntar si alguien gano la loteria (do - while)
			System.out.println("Existe algun ganador de la loteria");
			System.out.println("0.- NO\n1.- SI");
			opcion = sc.nextInt();
		}while(opcion==0);
		
		
		//si alguien gano, se termina el juego
		
		// se muestran los numeros 
		System.out.println("Numeros :"+arregloNumeros);
		System.out.println("Encontrados "+numerosEncontrados);
		
	}
	
}
