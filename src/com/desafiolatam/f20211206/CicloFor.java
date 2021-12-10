package com.desafiolatam.f20211206;

import java.util.Scanner;

public class CicloFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Repite hasta 1 > 10
		for (int i = 0; i <= 10; i++) {
			System.out.println("Instrucciones 1 en 1 -> "+i);
		}
		// Repite hasta i > 10, pero salta de dos en dos
		for (int i = 0; i <= 10; i += 2) {
			System.out.println("Instrucciones 2 en 2 -> "+i);
		}
		// Repite hasta que i sea menor que cero
		for (int i = 10; i >= 0; i--) {
			System.out.println("Instrucciones 1 en 1 en reversa -> "+i);
		}

		sc.close();

	}

}
