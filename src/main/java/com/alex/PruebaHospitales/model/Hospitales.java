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



}
