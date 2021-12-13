package com.desafiolatam.f20211213;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DiaDia {

	public static void main(String[] args) {
		crearFichero();

	}
	public static void crearFichero() {
		
		Date hoy = new Date();
		DateFormat formato = new SimpleDateFormat("yyyyMMdd");
		String fecha= formato.format(hoy);
		
		String ruta = "src/com/desafiolatam/f"+fecha;
		
		//creamos un archivo de tipo File y asignamos la ruta a crear o validar si existe 
		File directorio = new File(ruta);
		
		if(directorio.exists()) {
			System.out.println("El directorio existe");
		}else {
			System.out.println("El directorio NO existe");
			//lo crea en caso de no existir
			directorio.mkdirs();
		}
		
		//creamos una variable de tipo FILE, que nos servira para crear un nuevo archivo 
		File archivo = new File(ruta+"/Main.java");
		
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
			buffW.write("package com.desafiolatam.f"+fecha+";");
			buffW.newLine();
			buffW.newLine();
			buffW.write("public class Main {");
			buffW.newLine();
			buffW.newLine();
			buffW.write("	public static void main(String[] args) {");
			buffW.newLine();
			buffW.newLine();
			buffW.write("	}");
			buffW.newLine();
			buffW.newLine();
			buffW.write("}");
			buffW.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
