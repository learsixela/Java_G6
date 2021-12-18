package com.desafiolatam.f20211217.models;

public class Auto {
	//atributos
	private String color;
	private Float velocidad;
	private int ruedas;
	private float motor;

	//constructores
	public Auto() {
		super();
	}
	public Auto(String color, float velocidad, int ruedas, Float motor) {
		super();
		this.color = color;
		this.velocidad = velocidad;
		this.ruedas = ruedas;
		this.motor = motor;
	}
	//Getters&Setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}
	public int getRuedas() {
		return ruedas;
	}
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	public Float getMotor() {
		return motor;
	}
	public void setMotor(Float motor) {
		this.motor = motor;
	}
	//
	@Override
	public String toString() {
		return "Auto [color=" + color + ", velocidad=" + velocidad + ", ruedas=" + ruedas + ", motor=" + motor + "]";
	}

	public static void arrancar() {
		
	}
	
	public static void frenar() {
		
	}
	public static void doblar() {
		
	}
	
}
