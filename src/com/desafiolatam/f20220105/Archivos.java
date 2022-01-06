package com.desafiolatam.f20220105;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Archivos {

	public static void main(String[] args) {
		crearDirectorio();
		//crearArchivo();
	}

	public static void crearDirectorio() {
		Scanner sc = new Scanner(System.in);
		String pathBase = "src/com/desafiolatam/";
		System.out.println("ingrese directorio");
		String path = sc.nextLine();
		File directorio = new File(pathBase+path);
		//exists-> validar la existencia del directorio
		if(!directorio.exists()) {// valido si no existe
			//mkdir crear directorio
			directorio.mkdirs();
		}
		System.out.println("ejecutado...");
	}
	
	public static void crearArchivo() {
		File archivo = new File("src/../ejemplo4.txt");
		
		try {
			if(!archivo.exists()) {//SI No existe el archivo
				archivo.createNewFile();//creo el archivo
			}
			
		} catch (IOException e) {
			System.out.println("Error en la creacion del archivo");
		}
		
		System.out.println("ejecutado...");
	}
}
