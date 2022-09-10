package com.alex.PruebaHospitales.datos;
import org.json.simple.*;
import com.alex.PruebaHospitales.model.Hospitales;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
@Service
@Configurable

public class DatosHospitales {
private List <Hospitales> listaHospitales = new ArrayList<>();



public void insertaHospitales() {
	listaHospitales = List.of(
            new Hospitales ("Laughing Democritus Hospital",35,21 ),
            new Hospitales ("Crying Heraclitus Hospital",-40, 12 ),
            new Hospitales ("Seven Sages Hospita",0, -33 )
    );
}
public String listarHospitales() {
	

	return JSONArray.toJSONString(listaHospitales);
}

}
