package com.desafiolatam.f20211220;

import com.desafiolatam.f20211220.models.Auto;
import com.desafiolatam.f20211220.models.Moto;

public class Main {

	public static void main(String[] args) {
		//instancia de clase
		Auto auto = new Auto();
		auto.setColor("Negro");
		auto.aumentarVelocidad();//llamado a un metodo de auto
		auto.aumentarVelocidad(11);
		auto.aumentarVelocidad(11);
		auto.aumentarVelocidad(11);
		System.out.println(auto.toString());
		
		//instancia del Moto (Hereda de Auto)
		Moto moto = new Moto();
		moto.setColor("Blanca");
		moto.setRuedas(2);
		
		// metodo sobre escrito en moto
		moto.aumentarVelocidad();
		System.out.println(moto.toString());
		
		// metodo sobrecargado en auto
		moto.aumentarVelocidad(15);
		System.out.println(moto.toString());
		
		moto.aumentarVelocidad(false, true);
		System.out.println("frenar:  "+moto.toString());
	}

}