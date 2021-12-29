package com.desafiolatam.f20211222.models;

public class Lapiz {
	private String color;
	private String tipo;
	private String marca;
	
	public Lapiz(String color, String tipo, String marca) {
		super();
		this.color = color;
		this.tipo = tipo;
		this.marca = marca;
	}
	public Lapiz() {
		super();
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Lapiz [color=" + color + ", tipo=" + tipo + ", marca=" + marca + "]";
	} 

}
