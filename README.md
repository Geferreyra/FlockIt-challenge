# FlockIt-challenge
Examen Tecnico Flock IT puntos importantes

*El login esta realizado con thymeleaf, spring security, con un usuario cargado en memoria(nombre:admin, password: password), 
si el usuario es valido redirigira a la pantalla index.html, en caso de no devuelve msg de error por pantalla.

endpoint del login :  http://localhost:8282/login.html

*El api que consume el servicio de provincias esta documentada con la libreria Swagger 2, se puede acceder a ella mediante el la url :
http://localhost:8282/swagger-ui.html, 

*Al consumir el servicio mediante metodo Get usando como parametro el nombre de la provincia devuelve Json con nombre, latitud y longitud

Ejemplo: 
http://localhost:8282/provincia?name=Salta

Responderia :

{
    "id": 66,
    "nombre": "Salta",
    "centroide": {
        "lat": "-24.2991344492002",
        "lon": "-64.8144629600627"
    }
}
==========================================================================================================================================

Estimacion 8 horas aproximadamente entre, bugs investigacion y desarrollo. 



