package com.desafiolatam.f20211228;

import java.util.Scanner;

public class CalculoAreas {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese sus nombres");
		String nombre = sc.nextLine();
		System.out.println("Ingrese sus apellidos");
		String apellido = sc.nextLine();
		
		System.out.println(nombre+" "+ apellido);
		
		System.out.println("Ingrese el lado del cuadrado");
		float ladoCuadrado = sc.nextFloat();
		//areaCuadrado= lado * lado
		float areaCuadrado = ladoCuadrado * ladoCuadrado;
		
		System.out.println("el area del cuadro es: " + areaCuadrado);
		//area = d^2/2
				
		System.out.println("********* area Triangulo **********");
		
		System.out.println("Ingrese altura del triangulo");
		float alturaTriangulo = sc.nextFloat();
		System.out.println("Ingrese base del triangulo");
		float baseTriangulo = sc.nextFloat();
		
		//areaTriangulo = (b*a)/2
		float areaTriangulo = (baseTriangulo*alturaTriangulo)/2;
		System.out.println("El area del triangulo es: "+ areaTriangulo);
		
		
		System.out.println("********* area Circulo **********");
		//area = PI * (r*r);  PI = 3.14;
		System.out.println("Ingrese el valor del radio de la circunsferencia");
		float radioCirculo = sc.nextFloat();
		
		//float areaCirculo = (float) (Math.PI * (radioCirculo*radioCirculo));
		double areaCirculo =  Math.PI * (radioCirculo*radioCirculo);
		System.out.println("El area del circulo es "+ areaCirculo);
		
		//200.96
	}

}
