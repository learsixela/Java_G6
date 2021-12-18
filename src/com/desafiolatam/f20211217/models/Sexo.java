package com.desafiolatam.f20211217.models;

public class Sexo {
	private String nombre;
	private String detalle;

	public Sexo(String nombre, String detalle) {
		super();
		this.nombre = nombre;
		this.detalle = detalle;
	}

	public Sexo() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}


	
	
}
