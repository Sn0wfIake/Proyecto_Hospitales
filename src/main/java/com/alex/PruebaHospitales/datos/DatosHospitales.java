package com.alex.PruebaHospitales.datos;

import org.json.simple.*;
import com.alex.PruebaHospitales.model.Hospitales;

import java.util.ArrayList;
import java.util.Iterator;

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
	
	public String calculoCercaniaEjes(int ejeX, int ejeY) {
		int xFinal, yFinal, valorMinimo = 9999, aux;
		String hospitalCercano = null;
		listadoHospitales.add(h1);
		listadoHospitales.add(h2);
		listadoHospitales.add(h3);

		for (Hospitales h : listadoHospitales) {
			int xHospital = h.getEjeX();
			int yHospital = h.getEjeY();

			// manejo X
			// Si la X del hospital es positiva
			if (xHospital > 0) {
				// Si la X del eje es positiva, restamos
				if (ejeX > 0) {
					xFinal = xHospital - ejeX;
				}

			}
				// comprobamos la otra X y si es positiva, hacemos nuestra suma
				if (ejeX > 0) {
					xFinal = xHospital * -1 + ejeX;
				}
				// Si la X del HOSPITAL y la de la AMBULANCIA SON negativas, convertimos una y sumamos
				xFinal = xHospital + ejeX * -1;

				
				// manejo Y
				// Si la Y del hospital es positiva
				if (yHospital > 0) {
					// Si la Y del eje es positiva, restamos
					if (ejeY > 0) {
						yFinal = yHospital - ejeY;
					}

				}
					// comprobamos la otra Y y si es positiva, hacemos nuestra suma
					if (ejeY > 0) {
						yFinal = yHospital * -1 + ejeY;
					}
					// Si la Y del HOSPITAL y la de la AMBULANCIA SON negativas, convertimos una y sumamos
					yFinal = yHospital + ejeY * -1;

					if (xFinal<0) {
						xFinal=xFinal*-1;
					}
					if (yFinal<0) {
						yFinal=yFinal*-1;
					}
					//Buscamos el minimo
					aux=yFinal+xFinal;
					System.out.println("ESTO ES EL FOR");
					if (aux<=valorMinimo) {
						System.out.println("PASO POR AQUI");
						hospitalCercano = h.toString();
						valorMinimo= aux;
						
					}
					
			}
		
		return "el hospital mas cercano es: "+ hospitalCercano;

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
				System.out.println("PASO POR AQUI");
				 hospitalCercano = h.toString();
				distancia= aux;
				
			}
		}
		return hospitalCercano;
	}
	
}
