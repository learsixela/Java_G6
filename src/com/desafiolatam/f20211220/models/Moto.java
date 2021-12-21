package com.desafiolatam.f20211220.models;

public class Moto extends Auto{

	private String casco;
	
	public Moto() {
		super();
	}
	
	public Moto(String casco) {
		super();
		this.casco = casco;
	}
	
	public Moto(String color, float velocidad, int ruedas, float motor, String casco) {
		super(color, velocidad, ruedas, motor);
		this.casco = casco;
	}

	public String getCasco() {
		return casco;
	}

	public void setCasco(String casco) {
		this.casco = casco;
	}

	/*@Override
	public String toString() {
		return "Moto [casco=" + casco + ", getColor()=" + getColor() + ", getVelocidad()=" + getVelocidad()
				+ ", getRuedas()=" + getRuedas() + ", getMotor()=" + getMotor() + "]";
	}*/
	
	@Override
	public void aumentarVelocidad() {
		setVelocidad(getVelocidad() + 12);
	}

	//sobrecarga del metodo aumentarVelocidad
	public void aumentarVelocidad(float velocidad) {		
		setVelocidad(getVelocidad() + velocidad);
		System.out.println("Moto "+getVelocidad());
	}

	
	
	
	
	
	
	
	
	



}
