package com.desafiolatam.f20211222.models;

public class Doctor {

	private String nombre;
	private String dni;
	private String registro;
	
	private Lapiz lapiz;
	private Especialidad especialidad;

	public Lapiz getLapiz() {
		return lapiz;
	}

	public void setLapiz(Lapiz lapiz) {
		this.lapiz = lapiz;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	// constructores
	public Doctor(String nombre, String dni, String registro) {
		super();
		this.setNombre(nombre);
		this.setDni(dni);
		this.setRegistro(registro);
	}

	public Doctor(String nombre, String dni) {
		super();
		this.setNombre(nombre);
		this.setDni(dni);

	}

	public Doctor() {
		super();
	}


	// getters&Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}
	// metodos

	@Override
	public String toString() {
		return "Doctor [nombre=" + nombre + ", dni=" + dni + ", registro=" + registro + "]";
	}

}
