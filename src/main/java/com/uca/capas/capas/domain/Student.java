package com.uca.capas.capas.domain;

public class Student {
	private String name;
	private String apellido;
	private String fEntrada;
	private String carrera;
	private Boolean estado;
	
	
	
	public Student() {
		
	}
	public Student(String name, String apellido, String fEntrada, String carrera, Boolean estado) {
		super();
		this.name = name;
		this.apellido = apellido;
		this.fEntrada = fEntrada;
		this.carrera = carrera;
		this.estado = estado;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getfEntrada() {
		return fEntrada;
	}
	public void setfEntrada(String fEntrada) {
		this.fEntrada = fEntrada;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	public String delegateEstado() {
		return estado ? "Activo":"Inactivo";
	}

}
