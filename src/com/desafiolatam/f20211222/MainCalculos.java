package com.desafiolatam.f20211222;

public class MainCalculos {
	public static void main(String[] args) {
		
		saludo();//llamado a un metodo
		//System.out.println(suma(7,4));
		System.out.println(promedio(suma(7,4)));
		
		Integer resultadoSuma = suma(400,null); //Integer resultadoSuma = 1177
		double resulPromedio = promedio(resultadoSuma);//double resulPromedio = 588.5
		System.out.println("resultado promedio "+resulPromedio);
	}
	
	//metodo saludo(), no recibe parametro y no retorna nada(void)
	public static void saludo() {
		System.out.println("** Sistema de calculos de notas **");
	}
	
	//metodo suma, recibe 2 parametros, retorna un parametro de tipo Integer
	public static Integer suma(Integer numero1, Integer numero2) {
		if(numero2.equals(null)) {
			
		}
		Integer resultadosuma = numero1+numero2;
		return  resultadosuma;
	} 
	
	public static double promedio(Integer gato) {
		
		return gato/2d;
	}

}
