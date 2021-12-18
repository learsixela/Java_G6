package com.desafiolatam.f20211215;

public class Main {

	public static void main(String[] args) {
		System.out.println("ARGS "+args);
		int suma = 0;
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
			suma = suma + Integer.parseInt(args[i]);
		}
		System.out.println("suma final "+ suma);
		System.out.println("Promedio "+ suma/args.length);
	}

}