package com.desafiolatam.f20211222.models;

public class Especialidad {
	private String nombre;
	private String institucion;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getInstitucion() {
		return institucion;
	}
	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	public Especialidad(String nombre, String institucion) {
		super();
		this.nombre = nombre;
		this.institucion = institucion;
	}
	public Especialidad() {
		super();
	}
	
}
