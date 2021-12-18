package com.desafiolatam.f20211217;

import java.util.ArrayList;
import java.util.Scanner;

import com.desafiolatam.f20211217.models.Auto;

public class Main {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		ArrayList<String> arreglos = new ArrayList<String>();
		String palabra = "";//new String();
		*/
		//instancia de una clase
		Auto auto = new Auto();
		//acceder al metodo toString 
		System.out.println(auto.toString());
		//System.out.println("El color es: "+auto.getColor());
		//(SET) asignar valores a los atributos
		auto.setColor("Negro");
		auto.setMotor(2.0f);
		auto.setVelocidad(240f);
		auto.setRuedas(4);
		System.out.println(auto.toString());
		//(GET)acceder a los valores de los atributos
		System.out.println("El color es: "+auto.getColor());
		System.out.println("tamaño de motor: "+auto.getMotor());
		System.out.println("velocidad maxima: "+auto.getVelocidad());
		System.out.println("cantidad ruedas:  "+auto.getRuedas());
		
		System.out.println();
		//nueva instancia de la clase Auto
		Auto autito = new Auto("Azul", 120f,5,1.0f);
		System.out.println("Autito "+autito.toString());
		autito.setColor("Amarillo");
		System.out.println("el color del autito es: "+autito.getColor());
		
		
	}

}