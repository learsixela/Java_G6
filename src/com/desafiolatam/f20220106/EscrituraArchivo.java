package com.desafiolatam.f20220106;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EscrituraArchivo {

	public static void main(String[] args) {
		crearArchivo();
		escribirArchivo();
		leerArchivo();
	}

	public static void crearArchivo() {
		File archivo = new File("src/com/desafiolatam/f20220106/archivo.txt");

		try {
			if (!archivo.exists()) {// SI No existe el archivo
				archivo.createNewFile();// creo el archivo
				System.out.println("Archivo creado...");
			}

		} catch (IOException e) {
			System.out.println("Error en la creacion del archivo");
		}

	}

	public static void escribirArchivo() {
		File archivo = new File("src/com/desafiolatam/f20220106/archivo.txt");
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Perro");
		lista.add("Gato");
		lista.add("Juan");
		lista.add("Daniel");
		lista.add("Juan");
		lista.add("Gato");
		lista.add("Perro");
		lista.add("Camila");
		lista.add("Daniel");
		lista.add("Camila");

		try {
			FileWriter archivoWriter = new FileWriter(archivo);
			BufferedWriter archivoBuff = new BufferedWriter(archivoWriter);
					
			/*for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
				String texto = (String) iterator.next();
				archivoBuff.write(texto);
				archivoBuff.newLine();
			}
			for (String texto : lista) {
				archivoBuff.write(texto);
				archivoBuff.newLine();
			}
			for (int i = 0; i < lista.size(); i++) {
				archivoBuff.write(lista.get(i));
				if(i!=(lista.size()-1)) {
					archivoBuff.newLine();
				}
			}*/
			
			
			
			archivoBuff.write("hola clase ");
			archivoBuff.newLine();//salto de linea
			archivoBuff.write("aprendiendo Java ");
			archivoBuff.newLine();
			archivoBuff.write("64");
			archivoBuff.newLine();
			archivoBuff.write("Escribiendo en archivos");
			
			archivoBuff.close();
			System.out.println("Archivo escrito");
		} catch (IOException e) {
			System.out.println("error al escribir");
		}

		
		
	}

	public static void leerArchivo() {
		File archivo = new File("src/com/desafiolatam/f20220106/archivo.txt");
		int contador = 0;
		try {
			FileReader archivoReader = new FileReader(archivo);
			BufferedReader archivoBuff = new BufferedReader(archivoReader);
			
			String data = archivoBuff.readLine();
			while (data != null) {
				
				System.out.println(data);
				/*if(data.equals("Perro")) {
					System.out.println("Existe perro");
					contador++;
				}*/
				//System.out.println("..."+data.isBlank());				
				data = archivoBuff.readLine();				
			}
			//System.out.println("veces que existe en el archivo "+contador);
			archivoBuff.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void buscarTexto(String nombreFichero, String texto) {
		
	}
}
