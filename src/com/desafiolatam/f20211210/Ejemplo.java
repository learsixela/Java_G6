package com.desafiolatam.f20211210;

public class Ejemplo {
	
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
				if(i==0 || i ==(n-1)) {
					System.out.printf("*");
				}else {
					if(j == 0 || j ==(n-1) ) {
						System.out.printf("*");
					}else {
						System.out.printf(" ");
					}
				}
				
			}
			System.out.printf("\n");
		}
		
		for (int fila = 0; fila < n; fila++) {
			for (int columna = 0; columna < n; columna++) {
				if(fila==0 || fila ==(n-1)) {
					System.out.printf("*");
				}else {
					if(columna == 0 || columna ==(n-1) ) {
						System.out.printf("*");
					}else {
						System.out.printf(" ");
					}
				}
			}
			System.out.printf("\n");
		}
		
	}

}
