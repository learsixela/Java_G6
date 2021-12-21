package com.desafiolatam.f20211220.models;

public class PortaBicicleta {

	private String color;
	private String tamanio;
	
	public PortaBicicleta(String color, String tamanio) {
		super();
		this.color = color;
		this.tamanio = tamanio;
	}
	public PortaBicicleta() {
		super();
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	
	@Override
	public String toString() {
		return "PortaBicicleta [color=" + color + ", tamanio=" + tamanio + "]";
	}
}
