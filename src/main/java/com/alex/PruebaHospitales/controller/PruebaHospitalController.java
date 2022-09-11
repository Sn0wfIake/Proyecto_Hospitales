package com.alex.PruebaHospitales.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alex.PruebaHospitales.datos.DatosHospitales;
import com.alex.PruebaHospitales.model.Hospitales;

@RestController
public class PruebaHospitalController {

	@Autowired
	DatosHospitales datos;

	
	@GetMapping("/index")
	public String home() {
		return "index";
	}

	@GetMapping("/lista")
	public String lista() {
		
		return datos.toString();
	}

	@GetMapping("/ubicacion")
	public String multiParam(@RequestParam int ejeX, @RequestParam int ejeY) {

		if (!ValidarCoordenada(ejeX, ejeY)) {
			return "COORDENADA FUERA DEL INDICE";
		}
		String respuesta = "En el caso 1 (contando cuadrados):" + datos.calculoCercaniaEjes(ejeX, ejeY);
		respuesta += "<br>En el caso 2 (en linea recta): "+ datos.calculoCercaniaRecto(ejeX, ejeY);;
		return respuesta;

	}

	// en el caso de que se muevan en un eje de coordenadas (no puedan ir en linea
	// recta)

	

	private boolean ValidarCoordenada(int ejeX, int ejeY) {
		boolean b = false;
		if (ejeX < 100 && ejeX > -100 && ejeY > -80 && ejeY < 80) {

			b = true;
		}
		return b;

	}
	

	
	

}
