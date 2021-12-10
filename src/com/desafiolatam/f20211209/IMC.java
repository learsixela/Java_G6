package com.desafiolatam.f20211209;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// calculo indice masa corporal
		Util util = new Util();
		util.validarEdad();
		Float estatura = obtenerEstatura();
		Float kilos = obtenerKilos();
		calcularIMC(kilos, estatura);

		sc.close();
	}


	public static Float obtenerEstatura() {
		Scanner sc = new Scanner(System.in);
		Float estatura = 0f;
		do {
			System.out.println("cuál es su estatura en metros?");
			estatura = sc.nextFloat();
		} while (estatura < 0.5);
		return estatura;

	}

	public static Float obtenerKilos() {
		Scanner sc = new Scanner(System.in);
		Float kilos = 0f;
		do {
			System.out.println("Ingrese su peso en kilogramos.");
			kilos = sc.nextFloat();
		} while (kilos < 1);
		return kilos;
	}
	
	public static void calcularIMC(Float kilos, Float estatura) {
		Float imc = kilos / (estatura * estatura);
		
		System.out.println("Su IMC es " + imc);
		if (imc < 18.5) {
			System.out.println("Bajo peso");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Normal");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Sobrepeso");
		} else {
			System.out.println("Obeso");
		}
	}
}
