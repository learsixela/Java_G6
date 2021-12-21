package com.desafiolatam.f20211221;

import java.util.ArrayList;
import java.util.Scanner;

public class Wurlitzer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// arraylist con canciones
		/*ArrayList<String> canciones = new ArrayList<String>();
		canciones.add("1.- Tangananica Tanganana");
		canciones.add("2.- Mi equilibrio espiritual");
		canciones.add("3.- Mi mu�eca me hablo");
		canciones.add("4.- Se�ora interesante");
		canciones.add("5.- Son pololos");*/
		String[] canciones = {"1.- Tangananica Tanganana",
				"2.- Mi equilibrio espiritual",
				"3.- Mi mu�eca me hablo",
				"4.- Se�ora interesante",
				"5.- Son pololos"
		};
		System.out.println("1.- Tangananica Tanganana\n"+
				"2.- Mi equilibrio espiritual\n"+
				"3.- Mi mu�eca me hablo\n"+
				"4.- Se�ora interesante\n"+
				"5.- Son pololos");

		//System.out.println(canciones);//para el arreglo dinamico
		try {
			// solicitar el ingreso de la cancion a escuchar
			System.out.println("Ingrese el numero de la cancion a reproducir");
			String numero = sc.nextLine();
			// convertir el string a numero
			int cancion = Integer.parseInt(numero);

			// Validar que el n�mero de canci�n de tipo string sea mayor o igual a 1,
			if (cancion >= 1 ) {

				// si lo es, retornar la canci�n.
				// Controlar todas las Exception posibles.

				String cancionAReproducir =canciones[cancion - 1]; //canciones.get(cancion - 1);
				System.out.println("La cancion a reproducir es: " + cancionAReproducir);
				
			}else {
				System.out.println("Opcion no valida");
			}
		} catch (NumberFormatException nfe) {
			System.out.println("Ingrese solo numeros...");
		} catch (IndexOutOfBoundsException iobe) {
			System.out.println("No se encuentra cancion en la lista");
		} catch (Exception e) {
			System.out.println(" Error generico"); 
		}

	}

}
