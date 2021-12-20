package com.desafiolatam.f20211218;

import java.util.Scanner;

import com.desafiolatam.f20211218.models.Cargador;
import com.desafiolatam.f20211218.models.Celular;
import com.desafiolatam.f20211218.models.SmartPhone;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//instancia de la clase Celular
		Celular celular = new Celular();
		//asignacion de valores (SETTERS)
		celular.setColor("Gris");
		celular.setMarca("Nokia");
		celular.setModelo("520");
		//obtener los valores de los atributos(GETTERS)
		System.out.println("Color celular: "+ celular.getColor());
		System.out.println("Marca celular: "+celular.getMarca());
		System.out.println("Modelo celular: "+celular.getModelo());
		
		System.out.println(celular.toString());
		celular.llamar("Donato");
		
		System.out.println("*************");
		//instancia de la clase Celular
		Celular cellphone = new Celular("Alcatel","x123","Naranjo");
		System.out.println(cellphone.toString());
		cellphone.setModelo("123X");
		
		System.out.println("*************");
		
		System.out.println("Ingrese color celular");
		String color= sc.nextLine();
		System.out.println("Ingrese marca celular");
		String marca= sc.nextLine();
		System.out.println("Ingrese modelo celular");
		String modelo= sc.nextLine();
		
		Celular phone = new Celular(marca,modelo,color);
		System.out.println("Usuario "+phone.toString());
		System.out.println("*************");
		
		//intancia de clase con objeto colaborador
				
		Celular cellColaboracion = new Celular("Xiaomi","1245","Azul", null);
		System.out.println(cellColaboracion.toString());
		
		Cargador cargador = new Cargador();
		cellColaboracion.setCargador(cargador);
		
		
		//null.setPotencia("123");
		//null.setTipoConector("c");
		
		cellColaboracion.getCargador().setPotencia("124");
		cellColaboracion.getCargador().setTipoConector("AA");
		
		System.out.println(cellColaboracion.toString());
		System.out.println("*************");
		
		//instancia clase hijo SmartPhone
		SmartPhone smartPhone =  new SmartPhone();
		//asignar valores a los atributos
		smartPhone.setColor("Rojo");
		smartPhone.setModelo("Chino");
		//smartPhone.setCargador(cargador);
		smartPhone.setCamaraPixeles(16.0f);
		smartPhone.setTarjetaMemoriaTamanio(32.0f);
		
		System.out.println(smartPhone.toString());
		
		smartPhone.llamar("German");
		smartPhone.fotografiar();
		
	}

}