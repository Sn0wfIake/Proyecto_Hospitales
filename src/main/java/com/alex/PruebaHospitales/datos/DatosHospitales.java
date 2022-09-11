package com.alex.PruebaHospitales.datos;

import com.alex.PruebaHospitales.model.Hospitales;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
@Configurable

public class DatosHospitales {
	
	ArrayList<Hospitales> listadoHospitales = new ArrayList<>();
	Hospitales h1 = new Hospitales("Laughing Democritus Hospital", 35, 21);
	Hospitales h2 = new Hospitales("Crying Heraclitus Hospital", -40, 12);
	Hospitales h3 = new Hospitales("Seven Sages Hospita", 0, -33);



	@Override
	public String toString() {
		return "Hospitales:<br>" + h1 + "<br>" + h2 + "<br>" + h3;
	}

	
	

	public String calculoCercaniaRecto(int ejeX, int ejeY) {
		listadoHospitales.add(h1);
		listadoHospitales.add(h2);
		listadoHospitales.add(h3);
		String hospitalCercano = null;
		int distancia= 9999;
		for (Hospitales h : listadoHospitales) {
			int aux=((ejeX-h.getEjeX())*(ejeX-h.getEjeX())+(ejeY-h.getEjeY())*(ejeY-h.getEjeY()));
			if (aux<=distancia) {
				 hospitalCercano = h.toString();
				distancia= aux;
				
			}
		}
		return hospitalCercano;
	}
	
	public boolean ValidarCoordenada(int ejeX, int ejeY) {
	
		if (ejeX < 100 && ejeX > -100 && ejeY > -80 && ejeY < 80) {

			return true;
		}
		return false;
		
	}
	
}
