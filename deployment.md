
Para desplegar en docker:
Ejecutamos este comando en la carpeta del proyecto

 docker build -t prueba_hospitales .
 
Y finalmente lo lanzamos con:

docker run -p 8080:8085 prueba_hospitales
