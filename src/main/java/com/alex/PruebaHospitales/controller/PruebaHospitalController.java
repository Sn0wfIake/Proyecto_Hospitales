package com.alex.PruebaHospitales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alex.PruebaHospitales.datos.DatosHospitales;
import com.alex.PruebaHospitales.model.Hospitales;

@RestController
public class PruebaHospitalController {

	@Autowired
	private DatosHospitales datos;

	@GetMapping("/")
	public String home() {
		return "inserta coordenadas";
	}

	@GetMapping("/lista")
	public String lista() {
		datos.insertaHospitales();
		return datos.listarHospitales();
	}

	@GetMapping("/ubicacion")
	public String multiParam(@RequestParam int ejeX, @RequestParam int ejeY) {

		return calculoCercania(ejeX, ejeY);

	}

	private String calculoCercania(int ejeX, int ejeY) {

		if (ejeX < 100 && ejeX > -100 && ejeY > -80 && ejeY < 80) {

			return "es valido";
		}
		return "no es valido";
	}

	private boolean ValidarCoordenada(int ejeX, int ejeY) {
		if (ejeX < 100 && ejeX > -100 && ejeY > -80 && ejeY < 80) {

			return true;
		}
		return false;
	}

}
