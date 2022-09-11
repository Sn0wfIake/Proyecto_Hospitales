package com.alex.PruebaHospitales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alex.PruebaHospitales.datos.DatosHospitales;

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

		if (!datos.ValidarCoordenada(ejeX, ejeY)) {
			return "COORDENADA FUERA DEL INDICE";
		}
	
		String respuesta = "El hospital mas cercano es: "+ datos.calculoCercaniaRecto(ejeX, ejeY);;
		return respuesta;

	}
	


	

	
	

}
