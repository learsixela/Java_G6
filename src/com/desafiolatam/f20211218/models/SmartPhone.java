package com.desafiolatam.f20211218.models;

public class SmartPhone extends Celular{
	//atributo
	private float camaraPixeles;
	private Float tarjetaMemoriaTamanio;
	
	
	public SmartPhone(float camaraPixeles, Float tarjetaMemoriaTamanio) {
		super();
		this.camaraPixeles = camaraPixeles;
		this.tarjetaMemoriaTamanio = tarjetaMemoriaTamanio;
	}

	public SmartPhone() {	
		super();
		
	}

	public float getCamaraPixeles() {
		return camaraPixeles;
	}

	public void setCamaraPixeles(float camaraPixeles) {
		this.camaraPixeles = camaraPixeles;
	}

	public Float getTarjetaMemoriaTamanio() {
		return tarjetaMemoriaTamanio;
	}

	public void setTarjetaMemoriaTamanio(Float tarjetaMemoriaTamanio) {
		this.tarjetaMemoriaTamanio = tarjetaMemoriaTamanio;
	}

	@Override
	public String toString() {
		return "SmartPhone [camaraPixeles=" + camaraPixeles + ", tarjetaMemoriaTamanio=" + tarjetaMemoriaTamanio
				+ ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public void fotografiar() {
		super.fotografiar();
		System.out.println("Tomando la foto mas bacan del muno mundial!!");
	}
	
}
