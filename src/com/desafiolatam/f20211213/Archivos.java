package com.desafiolatam.f20211213;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Archivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//solicitando el ingreso por teclado de un nombre
		System.out.println("Ingrese nombre archivo");
		String fichero = sc.nextLine();
		//solicitando el ingreso por teclado de un nombre de directorio
		System.out.println("Ingrese nombre directorio");
		String ruta = sc.nextLine();
		
		//llamado el metodo con 2 parametros String
		//crearFichero(fichero,"src/com/desafiolatam/"+ruta);
		//escribirFichero(fichero,"src/com/desafiolatam/"+ruta);
		leerFichero(fichero,"src/com/desafiolatam/"+ruta);
	}
	
	public static void crearFichero(String fichero, String ruta) {
		//creamos un archivo de tipo File y asignamos la ruta a crear o validar si existe 
		File directorio = new File(ruta);
		
		if(directorio.exists()) {
			System.out.println("El directorio existe");
		}else {
			System.out.println("El directorio NO existe");
			//lo crea en caso de no existir
			directorio.mkdirs();
		}
		
		//src/com/desafiolatam/proveedores/proveedores.xls
		/*String extension = fichero.substring(fichero.length()-5);
		if(extension.equalsIgnoreCase(".xls")) {
			
		}*/
		 //15-1= 14 -4= 10
		
		//creamos una variable de tipo FILE, que nos servira para crear un nuevo archivo 
		File archivo = new File(ruta+"/"+fichero);
		
		// si existe no hace nada solo imprime el mensaje
		if(archivo.exists()) {
			System.out.println("El archivo existe");
		}else {// en acaso contrario lo crea
			System.out.println("El archivo NO existe");
			try {
				//crear archivo si no existe
				archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// ESCRITURA DEL ARCHIVO
		try {
			FileWriter fileW = new FileWriter(archivo);
			BufferedWriter buffW = new BufferedWriter(fileW);
			buffW.write("Hola clase");
			buffW.newLine();
			buffW.write("Hola clase 2");
			buffW.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void escribirFichero(String fichero, String ruta) {
		File archivo = new File(ruta +"/"+fichero);
		
		// si existe no hace nada solo imprime el mensaje
		if(archivo.exists()) {
			System.out.println("El archivo existe");
		}else {// en acaso contrario lo crea
			System.out.println("El archivo NO existe");
			try {
				//crear archivo si no existe
				archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// ESCRITURA DEL ARCHIVO
		try {
			FileWriter fileW = new FileWriter(archivo);
			BufferedWriter buffW = new BufferedWriter(fileW);
			buffW.write("Hola clase");
			buffW.newLine();
			buffW.write("Hola clase 2");
			buffW.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void leerFichero(String fichero, String ruta) {
		File archivo = new File(ruta +"/"+fichero);
		
		// si existe no hace nada solo imprime el mensaje
		if(archivo.exists()) {
			System.out.println("El archivo existe");
			try {
				FileReader fileR = new FileReader(archivo);
				BufferedReader buffR = new BufferedReader(fileR);
				
				//lectura de las filas dentro del archivo	
				String texto = buffR.readLine();//lectura de la primera linea
				while(texto != null) {
					System.out.println(texto);
					texto = buffR.readLine();
				}
				buffR.close();			
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}else {// en acaso contrario lo crea
			System.out.println("El archivo NO existe");
		}
	}

}
