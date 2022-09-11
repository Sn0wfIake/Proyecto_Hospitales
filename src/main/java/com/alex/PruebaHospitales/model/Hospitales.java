package com.alex.PruebaHospitales.model;

public class Hospitales {
	String nombre;
	int ejeX;
	int ejeY;

	public Hospitales(String nombre, int ejeX, int ejeY) {
		this.nombre = nombre;
		this.ejeX = ejeX;
		this.ejeY = ejeY;
	}

	@Override
	public String toString() {
		return "Hospital [nombre=" + nombre + ", Eje X=" + ejeX + ", Eje Y=" + ejeY + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEjeX() {
		return ejeX;
	}

	public void setEjeX(int ejeX) {
		this.ejeX = ejeX;
	}

	public int getEjeY() {
		return ejeY;
	}

	public void setEjeY(int ejeY) {
		this.ejeY = ejeY;
	}



}
