package com.desafiolatam.f20211220.models;

public class Scooter extends Moto{

	private boolean pliegue;

	public Scooter() {
		super();
	}

	public Scooter(String color, float velocidad, int ruedas, float motor, String casco, boolean pliegue) {
		super(color, velocidad, ruedas, motor, casco);
		this.pliegue = pliegue;
	}

	public boolean isPliegue() {
		return pliegue;
	}

	public void setPliegue(boolean pliegue) {
		this.pliegue = pliegue;
	}
	
	@Override
	public void aumentarVelocidad() {
		setVelocidad(getVelocidad() + 5);
	}

	@Override
	public String toString() {
		return "Scooter [pliegue=" + pliegue + "]";
	}
	
}
