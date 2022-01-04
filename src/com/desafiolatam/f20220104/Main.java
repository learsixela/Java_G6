package com.desafiolatam.f20220104;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Array dinamicos
		//declar , inicializar, usar
		ArrayList<Integer> numerosPares = new ArrayList<Integer>();
		System.out.println(numerosPares);//arreglo vacio
		System.out.println(numerosPares.size());//0, cantidad de elementos o tamaño
		//agregar alementos al arreglo
		numerosPares.add(22);
		numerosPares.add(12);
		numerosPares.add(35);
		numerosPares.add(102);
		numerosPares.add(103);
		System.out.println(numerosPares);
		System.out.println(numerosPares.size());//4
		
		numerosPares.add(4, 88);//insertar en una posicion
		System.out.println(numerosPares);
		numerosPares.add(3,44);//si existe un elemento , lo desplaza a la derecha
		System.out.println(numerosPares);
		
		//acceder a un elemento del arreglo por su posicion
		//arreglo.get(posicion)
		System.out.println(numerosPares.get(3));//44
		
		
		for (int i = 0; i < numerosPares.size(); i++) {
			if(numerosPares.get(i).equals(35)) {
				numerosPares.remove(i);
			}else if(numerosPares.get(i).equals(103)) {
				numerosPares.remove(i);
			}
		}
		
		
		
		
		
		
		ArrayList<Integer> datosAEliminar = new ArrayList<Integer>();
		for (int i = 0; i < 120; i++) {
			if(i%2 != 0) {
				datosAEliminar.add(i);
			}
		}
		
		System.out.println(datosAEliminar);

		
		//elimar elementos a partir de otro array
		numerosPares.removeAll(datosAEliminar);
		
		
		System.out.println("arreglo final: "+numerosPares);
	}

}
