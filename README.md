# PARCIAL PRIMER CORTE 
Contexto:

* Construir una aplicación web simple desplegada en Heroku.La aplicación debe consultar el estado del clima en lugares específicos de la tierra.  La aplicación recibirá en un campo la descripción de una ciudad y deberá mostrar la información del clima para esa ciudad.Utilice el servicio "Current Weather Data" de openweathermap.org.


### Pre- requisitos 

Para usar el proyecto se necesitan tener las siguientes versiones de java o superior:


```
java version "1.8"
javac version "1.8"
Apache Maven 3.6.3

```
## Ejecución del Proyecto
### Instalación

1. **Clonamos el proyecto con el siguiente comando**
```
git clone https://github.com/lina-6020/BUITRAGO-ARSW-T2
```
2. **Compilar Proyecto**
```
mvn package
```
3. **Servicio Web**  
Para observar la pagina web se debera escribir la siguiente URL en el browser de preferencia
    ```
    http://localhost:35000/
    ```
Y para hacer una consulta se debera pone lo siguiente
    ```
    http://localhost:35000/city
    ```	
	
    > ![image](https://user-images.githubusercontent.com/59893804/132589324-bbc7756d-e384-4ba4-9370-a79f2b40aedf.png)
    > ![image](https://user-images.githubusercontent.com/59893804/132589294-19f002ed-4149-449d-b104-f57dfa05d4e1.png)

### Despliegue en Heroku 
> Para desplegar el programa directamente desde el servicio de ```Heroku``` damos clic al siguiente link.Bastaria solo con ingresar la ciudad a consultar.
[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://arep-parcial012021-1.herokuapp.com/)
El despliegue de la aplicación se encuentra en [HTTP-SERVER](https://arep-parcial012021-1.herokuapp.com/)

## Explicación

Al abrir el aplicativo bastara con diligenciar la ciudad a consultar y observar la información.


## Tecnologias Usadas

* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [Git](https://git-scm.com/) - Software de control de versiones
* [Java 8](https://www.java.com/es/download/ie_manual.jsp) - Entorno de desarrollo



## Manejo de Versiones

El versionamiento se realizó a través de [GITHUB](https://github.com/lina-6020/AREP-PARCIAL01)

## Autor

* **Lina Maria Buitrago Espindola** - [lina-6020](https://github.com/lina-6020)


## Licencia

Este proyecto está bajo la Licencia GNU General Public License _LICENSE.txt_





