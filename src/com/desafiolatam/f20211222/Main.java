package com.desafiolatam.f20211222;

import com.desafiolatam.f20211222.models.Doctor;

public class Main {
	
	public static void main(String[] args) {
		//instancia de una clase, constructor vacio
		Doctor perro = new Doctor();
		//llamado al metodo
		System.out.println(perro.toString());
		//modificacion del atributo
		perro.setNombre("House");
		System.out.println(perro.toString());
		/****************************************/
		
		Doctor gato = new Doctor("Queen","1-9","3416574634");
		System.out.println(gato.toString());
		gato.setDni("1-8");
		System.out.println(gato.toString());
		
		//tarea crear el objeto Juguete
	}
}
