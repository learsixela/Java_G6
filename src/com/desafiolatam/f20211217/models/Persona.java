package com.desafiolatam.f20211217.models;

public class Persona {
	private String nombre;
	private String rut;
	private Float altura;
	//colaboracion de clase
	private Sexo sexo;
	
	public Persona() {
		super();
	}
	
	public Persona(String nombre, String rut, Float altura) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.altura = altura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public Float getAltura() {
		return altura;
	}
	public void setAltura(Float altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", rut=" + rut + ", altura=" + altura + ", sexo=" + sexo.getNombre() + "]";
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo asd) {
		this.sexo = asd;
	}

	//colaboracion de metodo
	public void miMetodo(Auto papu) {
		System.out.println(papu.getColor());
		System.out.println(papu.getMotor());
		
	} 
	
}
