package com.desafiolatam.f20211207;

import java.util.Scanner;

public class TablasDeMultiplicar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * for (int i = 0; i <=10; i++) {//i=11
		 * System.out.println("*******************"); System.out.println("i   j"); for
		 * (int j = 0; j <= 10; j++) {//j=11 System.out.println(i+" * "+ j + "= "+
		 * (i*j)); } }
		 */
		//
		System.out.println("Ingrese cantidad a mostrar *");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {//i=3
			
			for (int j = 0; j <i; j++) {//j=3
				System.out.print(j+1);
				//System.out.printf("%d %d",j+1,i);
				//System.out.println(j+1);
			}
			
			System.out.printf("\n");
		}
		
	

	}
}
