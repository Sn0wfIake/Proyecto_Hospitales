# Proyecto_Hospitales
El proyecto tiene 3 paginas principales
El index, el cual muestra una interfaz al usuario para insertar las coordenadas (Es la pagina que se muestra por defecto)
La pagina /lista la cual muestra una lista de los hospitales
Y finalmente la pagina /ubicacion que recibe 2 parametros para calcular la ubicacion



Para desplegar en docker:
Ejecutamos este comando en la carpeta del proyecto

 docker build -t prueba_hospitales .
 
Y finalmente lo lanzamos con:

docker run -p 8080:8085 prueba_hospitales
