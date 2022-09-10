package com.alex.PruebaHospitales.datos;

import com.alex.PruebaHospitales.model.Hospitales;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public class DatosHospitales {
private List <Hospitales> listaHospitales = new ArrayList<Hospitales>();

public void insertaHospitales() {
	listaHospitales = List.of(
            new Hospitales ("Laughing Democritus Hospital",35,21 ),
            new Hospitales ("Crying Heraclitus Hospital",-40, 12 ),
            new Hospitales ("Seven Sages Hospita",0, -33 )
    );
}
public List<Hospitales> listarHospitales() {
    return listaHospitales;
}

}
