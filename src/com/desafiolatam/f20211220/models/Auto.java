package com.desafiolatam.f20211220.models;

import com.desafiolatam.f20211218.models.Celular;

public class Auto {
	//atributos
	private String color;
	private float velocidad;//velocidad = 0.0
	private int ruedas;
	private float motor;    // motor = null
	//colaboracion
	private PortaBicicleta portaBici;

	//constructores
	public Auto() {
		super();
	}
	public Auto(String color, float velocidad, int ruedas, float motor) {
		super();
		this.color = color;
		this.velocidad = velocidad;
		this.ruedas = ruedas;
		this.motor = motor;
	}
	
	//getters&setters
	public PortaBicicleta getPortaBici() {
		return portaBici;
	}
	public void setPortaBici(PortaBicicleta portaBici) {
		this.portaBici = portaBici;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Float getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(Float velocidad) {
		this.velocidad = velocidad;
	}
	public int getRuedas() {
		return ruedas;
	}
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	public float getMotor() {
		return motor;
	}
	public void setMotor(float motor) {
		this.motor = motor;
	}
	@Override
	public String toString() {
		return "Auto [color=" + color + ", velocidad=" + velocidad + ", ruedas=" + ruedas + ", motor=" + motor
				+ ", portaBici=" + portaBici + "]";
	}

	public void aumentarVelocidad() {		
		this.velocidad = this.velocidad + 10;
	}
	
	//sobrecarga del metodo aumentarVelocidad
	public void aumentarVelocidad(float velocidad) {		
		this.velocidad = this.velocidad + velocidad;
	}
	
	public void aumentarVelocidad(boolean acelerar, boolean frenar) {
		if(acelerar) {
			this.velocidad = this.velocidad + 15;
		}else if(frenar) {
			this.velocidad = this.velocidad - 10;
		}		
	}
	
	public void otroMetodo(Celular celular) {
		System.out.println("otro metodo "+celular);
	}
}
