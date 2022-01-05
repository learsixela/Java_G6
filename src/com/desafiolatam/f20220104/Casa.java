package com.desafiolatam.f20220104;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Casa {

	public static void main(String[] args) {
		agregaElemento();
	}

	public static void agregaElemento() {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> casa = new ArrayList<String>();
		
		int opcion = 0;

		do {
			boolean existe = false;
			System.out.println("Ingrese un elemento");
			String elementoIngresado = sc.nextLine();

			/*for (int i = 0; i < casa.size(); i++) {
				if (casa.get(i).equalsIgnoreCase(elemento)) {
					existe = true;
				}
			}*/
			
			/*for (Iterator iterator = casa.iterator(); iterator.hasNext();) {
				String elemento = (String) iterator.next();
				if(elemento.equals(elementoIngresado)) {
					existe = true;
				}
			}
			*/
			for (String elemento : casa) {
				if(elemento.equals(elementoIngresado)) {
					existe = true;
				}
				
			}
			
			

			if (existe) {
				System.out.println("*** Elemento ya existe ***");
			} else {
				casa.add(elementoIngresado);
			}
			System.out.println();
			System.out.println("* ¿Ingresara otro elemento? * ");
			System.out.println("0.- SI");
			System.out.println("1.- NO");
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();
		} while (opcion == 0);

		sc.close();
		System.out.println("elementos en casa " + casa);
	}
}
