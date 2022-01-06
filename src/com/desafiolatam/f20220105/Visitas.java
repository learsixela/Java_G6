package com.desafiolatam.f20220105;

public class Visitas {

	public static void main(String[] args) {
		float promedio = promedio(args);
		System.out.println("Para la entrada anterior, el resultado es: "+promedio);
	}
	
	public static float promedio(String[] args) {
		int sumaTotal = 0;//variable = variable + algo;
		for (int i = 0; i < args.length; i++) {
			sumaTotal = sumaTotal + Integer.parseInt(args[i]);
			//Convirtiendo numero tipo String a... Integer/Long/Float/Double
			//Integer.parseInt("12345");//12345
			//Float.parseFloat("123.4");
			
		}
		System.out.println("suma total: "+sumaTotal);
		//promedio= sumaTotal / cantidadElementos;
		float promedio = sumaTotal / args.length;
		return promedio;
		
	}

}
