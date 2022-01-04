package com.desafiolatam.f20211230;

public class Ciclos {

	public static void main(String[] args) {
		// ciclo for
		//declaracion de variable; condicional; incremento/decremento 
		//i++; i=i+1; i+=1; suma 1
		//i--; i=i-1; i-=1; resta 1
		for(int i = 0; i < 8;i=i+2) {//i=8
			System.out.println(i);//0,2,4,6
		}
		
		//ciclo while
		//while(condicional)
		int numero = 2;//4
		while(numero < 4) {
			System.out.println("Es menor");
			numero++;
		}
		
		boolean error= true;
		int contador = 0;//
		while(error) {
			contador++;
			System.out.println("contador "+contador);
			if(contador == 4) {
				error= false;
			}
		}
		/**
		 * DO WHIlE
		 * */
		boolean error2= true;
		int contador2 = 0;
		do {
			contador2++;
			System.out.println("contador 2:  "+contador2);
			if(contador2 == 4) {
				error2= false;
			}			
		}while(error2);
		
		
	}

}
