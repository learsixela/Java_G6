package com.desafiolatam.f20211217;

import com.desafiolatam.f20211217.models.Auto;
import com.desafiolatam.f20211217.models.Persona;
import com.desafiolatam.f20211217.models.Sexo;

public class MainPersona {

	public static void main(String[] args) {
		Persona persona = new Persona("Isra","1-9", 2.0f);
		
		Sexo qwerty = new Sexo();
		qwerty.setNombre("Masculino");
		
		Sexo femenino = new Sexo();
		femenino.setNombre("Femenino");
		Sexo gato = new Sexo();
	
		persona.setSexo(qwerty);
		System.out.println(persona.toString());
		
		System.out.println("sexo "+persona.getSexo().getNombre());
		
		//instanciando
		Auto car = new Auto("naranjo",320f,4,3.4f);
		
		//persona.miMetodo(car);
		
		car.setColor("verde");
		persona.miMetodo(car);

	}

}
