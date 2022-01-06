package com.desafiolatam.f20220106;

import java.io.File;
import java.io.IOException;

public class EscrituraArchivo {

	public static void main(String[] args) {
		crearArchivo();

	}

	public static void crearArchivo() {
		File archivo = new File("src/com/desafiolatam/f20220106/archivo.txt");
		
		try {
			if(!archivo.exists()) {//SI No existe el archivo
				archivo.createNewFile();//creo el archivo
				System.out.println("Archivo creado...");
			}
			
		} catch (IOException e) {
			System.out.println("Error en la creacion del archivo");
		}
		
		
	}
	
	public static void escribirArchivo() {
		
	}
}
