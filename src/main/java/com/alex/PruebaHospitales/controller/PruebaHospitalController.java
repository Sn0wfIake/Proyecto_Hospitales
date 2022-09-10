package com.alex.PruebaHospitales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alex.PruebaHospitales.datos.DatosHospitales;


@RestController
public class PruebaHospitalController {
			
	@Autowired
	DatosHospitales datos;
	
	
	@GetMapping("/")
	  public String home() {
		datos.insertaHospitales();
	    return datos.listarHospitales();
	  }

	
}
