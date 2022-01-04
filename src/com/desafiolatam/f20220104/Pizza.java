package com.desafiolatam.f20220104;

import java.util.ArrayList;
import java.util.Scanner;

public class Pizza {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> pizza = new ArrayList<String>();
		pizza.add("masa");
		pizza.add("queso");
		pizza.add("salsa");
		pizza.add("queso");
		
		int vecesEncontrado = 0;
		boolean existe = false;
				
		System.out.println("Ingrese un ingrediente");
		String ingrediente = sc.nextLine();//queso
		
		//recorrer un arreglo dinamico
		for (int i = 0; i < pizza.size(); i++) {
			if(pizza.get(i).equalsIgnoreCase(ingrediente)) {
				//System.out.println("Ingrediente ya existe en la pizza");
				vecesEncontrado= vecesEncontrado + 1;//incrementando en 1
				existe = true;
			}
		}
		System.out.println("vecesEncontrado "+vecesEncontrado);
		
		if(vecesEncontrado == 0) {//if(existe==false) {
			pizza.add(ingrediente);
		} else {
			System.out.println("Ingrediente ya existe en la pizza");
			//pizza.clear();//elimina todo los elemento
			pizza.remove(3);//elimina segun indice
			pizza.remove("queso");//elimina la primera coicidencia
		}
		
		System.out.println(pizza);
		
	}

}
