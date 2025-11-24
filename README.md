EJERCICIO 1
Problema: Jugadores de un equipo de fútbol. Cada jugador tiene un nombre, una posición en el
campo, una edad y un número de camiseta.
Objetivo: Desarrollar una clase en Java llamada Jugador que tenga los atributos y un método
para mostrar la información del jugador. Luego, crear tres objetos de esta clase, cada uno
representando un jugador diferente.
Realizar EL REGISTRO de los atributos con datos quemados y utilizando Scanner combinar

Ejecucion
<img width="324" height="503" alt="image" src="https://github.com/user-attachments/assets/c5b331c7-20b1-443c-88b4-503f8e2e5276" />


EJERCICIOS de la tarea S2
1: Clase Libro 
Objetivo: Crear una clase con atributos, constructor y método para mostrar información. 
Descripción: 
•	Crear la clase Libro con atributos: titulo, autor, anioPublicacion. 
•	Crear un constructor. 
•	Crear un método mostrarInformacion() que imprima los datos del libro. 
•	Crear 2 objetos de tipo Libro y mostrar su información. 
Ejecucion 
<img width="630" height="528" alt="image" src="https://github.com/user-attachments/assets/be500fbf-3150-4e4b-9bfc-f667abe32ffc" />

2:Imagina que estás desarrollando un programa sencillo para un banco. Cada cliente puede abrir una cuenta, consultar su saldo, depositar dinero y retirar dinero. 
Tu tarea es crear una clase llamada CuentaBancaria que permita reutilizar la información del cliente y realizar acciones mediante métodos propios. 
Ejecucion
<img width="580" height="439" alt="image" src="https://github.com/user-attachments/assets/39c82641-1b32-4a0e-b419-7c324f6b92be" />
<img width="614" height="395" alt="image" src="https://github.com/user-attachments/assets/51591004-42aa-48f9-b8bc-61bda6217b68" />

---------------------------------------------------------
ACTIVIDAD ASINCRONICA
Ejercicio #1
Enunciado de la Actividad 
Desarrolle un programa en Java  y Modelar   UML que permita gestionar los precios de casas y departamentos. Para ello, realice lo siguiente: 
1.	Estructura de Datos 
	• 	Utilice un ArrayList<Double> para almacenar los precios ingresados por el usuario. 
2.	Menú Principal 
El sistema debe presentar un menú en consola con las siguientes opciones: 
===== MENÚ DE PRECIOS INMOBILIARIOS ===== 
1.	Ingresar precio 
2.	Mostrar todos los precios 
3.	Mostrar precio más alto 
4.	Mostrar precio más bajo 
5.	Mostrar precio iguales 
6.	Buscar un precio específico 
7.	Salir 
Seleccione una opción: 
 3. Funcionalidades a implementar 
Opción 1: Ingresar precio 
•	Solicitar al usuario un valor numérico (double). 
•	Agregar el valor al ArrayList. 
•	Validar que sea un número mayor que cero. 
Opción 2: Mostrar todos los precios 
•	Mostrar cada precio almacenado. 
•	Si no hay precios, mostrar el mensaje: "No existen precios registrados."  
Opción 3: Mostrar el precio más alto 
•	Recorrer el ArrayList para obtener el valor máximo. 
•	Mostrar el resultado. 
Opción 4: Mostrar el precio más bajo 
•	Recorrer el ArrayList para obtener el valor mínimo. 
•	Mostrar el resultado. 
Opción 5: Mostrar el precio iguales 
•	Recorrer el ArrayList para obtener el valor igual. 
•	Mostrar el resultado. 
Opción 6: Buscar un precio 
•	Pedir un precio al usuario. 
•	Verificar si ese precio existe en el ArrayList usando contains. 
•	Mostrar un mensaje indicando si se encontró o no. 
Opción 7: Salir 
•	Finaliza el programa. 
 Indicaciones 
1.	Crear una clase principal llamada GestionPrecios. 
2.	Declarar un ArrayList<Double> para almacenar los precios. 
3.	Implementar un menú repetitivo usando while o do-while. 
4.	Usar Scanner para ingresar datos. 
5.	Validar que los precios ingresados sean positivos. 
6.	Utilizar métodos para organizar mejor el código (opcional): 
o 	ingresarPrecio() o 	mostrarPrecios() o 	precioMasAlto() o 	precioMasBajo() o 	precioIguales() 
o	buscarPrecio() 
7.	Probar el programa ingresando al menos 5 precios distintos.
   CLASE GESTIONPRECIOS
<img width="974" height="890" alt="image" src="https://github.com/user-attachments/assets/3cab3933-6f03-4506-8551-28ecd31d9022" />
<img width="912" height="497" alt="image" src="https://github.com/user-attachments/assets/6dc34717-bfd3-4798-a612-13f8f70ab111" />

  CLASE METODOSPRECIOS
<img width="850" height="881" alt="image" src="https://github.com/user-attachments/assets/b50df801-2960-401c-b0cd-54297437ecc3" />
<img width="820" height="771" alt="image" src="https://github.com/user-attachments/assets/835aa251-f77a-4fb1-b746-fdf809ac0da9" />
<img width="852" height="835" alt="image" src="https://github.com/user-attachments/assets/eff4b63c-cf52-4e82-8180-6fc20121c232" />
<img width="894" height="318" alt="image" src="https://github.com/user-attachments/assets/1e7407fe-c217-4947-bb8c-7592ddbbb164" />
NOTA: las capturas de las ejecuciones estan en el archivo pdf.

Ejercicio #2
Sistema de Registro de Olimpiadas 
Desarrolle un programa en Java que permita registrar información básica sobre unas Olimpiadas, sus eventos y los participantes. El objetivo es aplicar conceptos fundamentales de la Programación Orientada a Objetos, tales como clases, herencia, polimorfismo, manejo de listas (ArrayList) y excepciones personalizadas. 
Objetivo General 
Modelar un sistema  UML de gestión de Olimpiadas, permitiendo registrar participantes, eventos y la información principal de la olimpiada, utilizando herencia y polimorfismo para distinguir entre los tipos de participantes. 
Requerimientos Generales 
1.	Crear una clase abstracta 'Participante' con atributos base y un método abstracto. 
2.	Crear clases hijas 'Atleta' y 'Equipo' que hereden de Participante. 
3.	Implementar la clase 'Evento' para registrar participantes. 
4.	Implementar la clase 'Olimpiada' para almacenar información general y sus eventos. 
5.	Aplicar polimorfismo mostrando el tipo de participante mediante sobrescritura de métodos. 
6.	Utilizar excepciones personalizadas para validar datos insuficientes o incorrectos. 
7.	Gestionar toda la información utilizando listas dinámicas (ArrayList). 
8.	Crear un menú principal que permita registrar y consultar información. 
Diagrama UML (Descripción) 
El sistema debe incluir un conjunto de clases que se relacionan mediante herencia y composición. El diagrama UML debe mostrar: 
 
-	Una clase abstracta Participante. 
-	Clases hijas Atleta y Equipo. 
-	La clase Evento, que contiene una lista de participantes. 
-	La clase Olimpiada, que contiene una lista de eventos. 
datosInvalidos
<img width="568" height="132" alt="image" src="https://github.com/user-attachments/assets/d1df502e-018b-4730-8094-a0547fdb2618" />
participante
<img width="679" height="444" alt="image" src="https://github.com/user-attachments/assets/7fd5b0dd-683c-40bb-9309-8364ab6757bb" />
Atleta
<img width="731" height="437" alt="image" src="https://github.com/user-attachments/assets/1900e284-2a06-4c21-84db-4fdbe353af7a" />
Equipo
<img width="976" height="582" alt="image" src="https://github.com/user-attachments/assets/39c42ddf-f757-47b5-9705-a2a15839ee4f" />
Evento
<img width="866" height="875" alt="image" src="https://github.com/user-attachments/assets/47672e61-8f72-4461-8c03-34e8a8575f90" />
Olimpiada
<img width="695" height="886" alt="image" src="https://github.com/user-attachments/assets/1e96555c-e2b2-4775-bc1e-64fa0a34d52c" />
Sistema Olimpiadas
<img width="1003" height="876" alt="image" src="https://github.com/user-attachments/assets/6fc605a4-f933-42dd-aa77-9afad10faf5f" />
<img width="910" height="775" alt="image" src="https://github.com/user-attachments/assets/a694c9e4-396a-4777-8ba9-fb1d7c2914a0" />
<img width="979" height="796" alt="image" src="https://github.com/user-attachments/assets/66b55a06-9a20-47d9-babc-fa7d6755d73c" />
<img width="983" height="818" alt="image" src="https://github.com/user-attachments/assets/5f2d15a1-7d91-4d21-a4bf-b71a4a228983" />

-----------------------------------------------------------------------------------
TAREA S8
ACTIVIDAD – Sistema de Registro de Juegos 
Indicaciones Generales 
Desarrolle un programa en Java que permita registrar información sobre juegos de Mario Bros y juegos de Carreras de Vehículos. 
El objetivo es aplicar herencia, polimorfismo, excepciones personalizadas y manejo de listas (ArrayList) mediante un menú interactivo. 
#clase juego
<img width="952" height="602" alt="image" src="https://github.com/user-attachments/assets/ed5a8645-5fd1-40d8-8070-6250442ccc3d" />
<img width="991" height="380" alt="image" src="https://github.com/user-attachments/assets/95e80d5f-b96e-4375-a9fe-135ca6942368" />
#clase MarioBross
<img width="924" height="653" alt="image" src="https://github.com/user-attachments/assets/510ad96d-b63b-4964-a5cc-0832e51c05d7" />
<img width="731" height="274" alt="image" src="https://github.com/user-attachments/assets/18b8fa3c-c0b3-4216-8f4f-b06b40dcb1b1" />
#Clase CarreraVehiculos
<img width="916" height="740" alt="image" src="https://github.com/user-attachments/assets/a9561216-cafb-476c-974f-3950c4524536" />
<img width="656" height="273" alt="image" src="https://github.com/user-attachments/assets/e80be106-5482-40ec-961b-df2873736200" />
#DatosInvalidos
<img width="609" height="216" alt="image" src="https://github.com/user-attachments/assets/492a2bb8-1519-4bbd-9a06-5df72a5965a9" />
#Main
<img width="814" height="826" alt="image" src="https://github.com/user-attachments/assets/f2eaf447-63c8-4f7a-9eb2-a6a56616be40" />
<img width="849" height="743" alt="image" src="https://github.com/user-attachments/assets/52429a94-1524-4344-9022-32844e0b7551" />
<img width="938" height="777" alt="image" src="https://github.com/user-attachments/assets/35ee8a69-201a-4626-ada1-842ee1fd8fff" />
<img width="734" height="818" alt="image" src="https://github.com/user-attachments/assets/f52185c8-87dc-4a9e-9107-0b89abdd3c1f" />
<img width="934" height="776" alt="image" src="https://github.com/user-attachments/assets/8f8cbd5e-eab0-48e0-b97b-0862baea059e" />
NOTA: las capturas de la ejecucion esta en el pdf 

ENUNCIADO: 
Desarrollar un programa en Java que simule el registro y funcionamiento de diferentes dispositivos electrónicos. 
Debe aplicarse: encapsulamiento, herencia, polimorfismo, sobrescritura, manejo de listas y excepciones personalizadas. 
Requerimientos del programa 
1.	Crear una clase padre llamada Dispositivo con atributos privados (marca, modelo, precio). 
2.	Implementar getters y setters para aplicar encapsulamiento, validando datos incorrectos. 
3.	Crear dos clases hijas: 
O Laptop 
 	o Telefono 
Ambas deben heredar de Dispositivo. 
4.	La clase padre debe incluir un método mostrarInfo() que luego será sobrescrito en cada clase hija para demostrar polimorfismo. 
5.	Crear una excepción personalizada llamada DatoInvalidoException, la cual debe lanzarse cuando se ingrese un precio negativo o una marca vacía. 
6.	En el método main, crear un ArrayList de tipo Dispositivo, registrar objetos de tipo Laptop y Telefono, y mostrar la información usando polimorfismo. 
7.	Capturar excepciones con try–catch cuando se creen dispositivos con datos inválido 
#DatoInvalido
<img width="601" height="139" alt="image" src="https://github.com/user-attachments/assets/8cbea86e-c9b8-406c-8434-e2e2c414dc88" />
#Clase Dispositivo
<img width="923" height="802" alt="image" src="https://github.com/user-attachments/assets/6f54e798-13e3-49a6-8496-15dd0b103e03" />
<img width="815" height="446" alt="image" src="https://github.com/user-attachments/assets/bf1406b4-ac9b-44ff-bb10-6d3f60665d57" />
#Clase Laptop
<img width="1055" height="467" alt="image" src="https://github.com/user-attachments/assets/61544104-1cc1-464c-963e-05376b4ce02d" />
#Clase Telefono
<img width="886" height="550" alt="image" src="https://github.com/user-attachments/assets/11dc2bff-4ac5-401e-bd18-7191c0979504" />
#clase Main
<img width="1190" height="688" alt="image" src="https://github.com/user-attachments/assets/0b92e162-e22d-4aa2-a6fa-03002fa14641" />
NOTA: las capturas de la ejecucion estan en el pdf 
--------------------------------------------------------------------------------
4.	Ejercicio propuesto: Sistema — Elección de la Reina de Quito
Descripción general:
Desarrollar un programa Java en consola para gestionar candidatas a la elección de la Reina de Quito. El sistema debe permitir registrar candidatas, simular votaciones, mostrar resultados y usar herencia, polimorfismo, excepciones personalizadas y ArrayList.
Requerimientos funcionales
1.	Clase abstracta Candidata
o	Atributos: int id, String nombre, int edad, String distrito, double puntajeJurado
o	Método abstracto public abstract void mostrarDetalles();
2.	Clases hijas (dos ejemplos; puedes crear otras variantes):
o	CandidataEstudiante (atributos adicionales: String universidad, String carrera)
o	CandidataProfesional (atributos adicionales: String profesion, int añosExperiencia)
o	Ambas sobrescriben mostrarDetalles() (polimorfismo).
3.	Excepción personalizada DatoInvalidoException
o	Lanzarla si nombre vacío, edad <= 0 o puntajes negativos, etc.
4.	Gestión con ArrayList<Candidata>
o	Registrar candidatas, eliminar, editar, listar.
o	Búsqueda por nombre o id.
o	Filtrado por tipo (Estudiante / Profesional / otros).
5.	Simulación de votación
o	Implementar ArrayList<Voto> o un Map<Integer, Integer> para contar votos por idCandidata.
o	Menu para “votar” (simulación) y opción para importar votos de muestra.
o	Mostrar ganador(es). Manejar empates (desempate por puntajeJurado).
6.	Validaciones
o	Datos obligatorios no vacíos.
o	Edad positiva (>= 16, por ejemplo).
o	Puntaje jurado en rango 0–100.
o	Atrapar excepciones y mostrar mensajes claros.
7.	Interfaz de consola (menú)
o	Registrar candidata.
o	Listar todas.
o	Buscar por nombre/id.
o	Filtrar por tipo/distrito.
o	Simular voto / registrar voto manual.
o	Mostrar resultados y ganador.
o	Salir.
8.	Pruebas
o	Ingresar al menos 5 candidatas (mezcla de tipos) y simular votos para demostrar resultados y manejo de errores.
<img width="1089" height="769" alt="image" src="https://github.com/user-attachments/assets/77bb6164-9a38-45b5-ba23-eb5223aeb722" />
<img width="997" height="774" alt="image" src="https://github.com/user-attachments/assets/1a7effeb-0de2-4f64-902f-2e41c7a3bef9" />
<img width="915" height="348" alt="image" src="https://github.com/user-attachments/assets/7dbd2430-1395-408e-9df8-5300145b7b79" />
<img width="1351" height="855" alt="image" src="https://github.com/user-attachments/assets/a4ab5e61-e01a-4cb7-8cd4-53e5c99d8822" />
<img width="613" height="365" alt="image" src="https://github.com/user-attachments/assets/fd67130f-5f31-4fc4-9647-755566bc2a6f" />
<img width="1412" height="798" alt="image" src="https://github.com/user-attachments/assets/368cc019-3611-4737-8bb2-156d99a9dc25" />
<img width="703" height="325" alt="image" src="https://github.com/user-attachments/assets/393be9ac-2873-4f22-8b60-3ca47afeeb34" />
<img width="775" height="220" alt="image" src="https://github.com/user-attachments/assets/06f6d9cb-e350-4c99-b479-7edfd8d1dc68" />
<img width="716" height="856" alt="image" src="https://github.com/user-attachments/assets/be3f7d1e-0286-4480-8715-1f7b5d4b9542" />
<img width="815" height="638" alt="image" src="https://github.com/user-attachments/assets/e503bc60-f186-4a9d-a160-42b0441f6a1e" />
<img width="708" height="742" alt="image" src="https://github.com/user-attachments/assets/d85231f5-9200-4576-8310-59d56531fe66" />
<img width="809" height="725" alt="image" src="https://github.com/user-attachments/assets/081dd045-5694-4f56-b1f9-9967cc549401" />
<img width="776" height="728" alt="image" src="https://github.com/user-attachments/assets/4fceacce-3e56-4e04-8eef-5680da564007" />
<img width="835" height="770" alt="image" src="https://github.com/user-attachments/assets/9f033d12-92a3-41fe-809d-f088c56d2d7b" />
<img width="785" height="759" alt="image" src="https://github.com/user-attachments/assets/35433bef-a9dd-4137-bbaa-42e601cad16c" />
<img width="719" height="174" alt="image" src="https://github.com/user-attachments/assets/1dfe771e-bb5f-4348-9d8e-5fb9b27fd7fa" />
<img width="712" height="765" alt="image" src="https://github.com/user-attachments/assets/f0540c14-2d3a-495c-adf4-241d3ed8e8b5" />
<img width="598" height="775" alt="image" src="https://github.com/user-attachments/assets/0960628e-e73e-46cc-a90c-7221c8e08488" />
<img width="954" height="827" alt="image" src="https://github.com/user-attachments/assets/8029d7b5-1e56-4112-8435-1cd7009f44d8" />

NOTA: las capturas de la ejecucion estan en el pdf 

----------------------------------------------------------------------
EXAMEN PRACTICO 
Tema:
Sistema de Registro de Empleados con Herencia, Listas y Manejo de Excepciones.
Objetivo General:
Aplicar los conceptos fundamentales de la Programación Orientada a Objetos en Java mediante el diseño y desarrollo de un sistema que gestione empleados de una empresa, utilizando herencia, listas y manejo de excepciones.
Instrucciones Generales:
1. Cree un proyecto en Java denominado 'SistemaEmpleados'.
2. Implemente las clases según se indica en el enunciado.
3. Asegúrese de manejar adecuadamente las excepciones para entradas inválidas.
4. Utilice una estructura de lista (ArrayList) para almacenar los empleados registrados.
5. El sistema debe incluir un menú de opciones en consola.
6. Al finalizar, guarde su código y entregue una breve conclusión sobre como aplico los principios POO en su código
Enunciado del Ejercicio:
La empresa 'TechESFOT' requiere un sistema que permita registrar empleados de diferentes tipos. Existen dos tiempos de empleados:
•	a tiempo completo (con bono adicional)
•	empleados a medio tiempo (con pago por horas). 
De forma general todos los empleados tienen un código, nombre, apellido, cargo y sueldo base, pero cada tipo de empleado podría tener otros atributos (a análisis del estudiante).
El sistema deberá:
- Permitir el registro de empleados de ambos tipos (tiempo completo, medio tiempo).
-Calcular el sueldo total de cada empleado.
-Mostrar todos los empleados registrados.
-Validar de todos los empleados registrados, cual es el empleado que gana más dinero.
-Validar el promedio salarial de entre todos los empleados registrados.
-Controlar errores cuando se ingresen valores negativos o listas vacías.
<img width="1103" height="801" alt="image" src="https://github.com/user-attachments/assets/45bfe1c9-6bb2-4997-85cd-b07f222d21d4" />
<img width="918" height="668" alt="image" src="https://github.com/user-attachments/assets/95644585-9b08-40dc-9c2f-2af5ba44b394" />
<img width="771" height="255" alt="image" src="https://github.com/user-attachments/assets/2f681d95-5988-4316-a8b2-5ebbf7e5b7e8" />
<img width="1498" height="720" alt="image" src="https://github.com/user-attachments/assets/c6fad814-9b27-442b-b1b4-170609d48e7b" />
<img width="1017" height="767" alt="image" src="https://github.com/user-attachments/assets/2e402e17-8e11-4700-adeb-944b55a337cf" />
<img width="848" height="145" alt="image" src="https://github.com/user-attachments/assets/f2f8bae7-94b8-4dbf-aaeb-1b7697026b42" />
<img width="1300" height="843" alt="image" src="https://github.com/user-attachments/assets/d8e91e92-f2a3-4cf7-9db9-e57b5dbced0b" />
<img width="847" height="511" alt="image" src="https://github.com/user-attachments/assets/038ec5a8-ebc6-4edf-b1a6-3e73af03669b" />
<img width="686" height="198" alt="image" src="https://github.com/user-attachments/assets/9005fae4-acd5-485c-a8a9-5466fe9776d7" />
<img width="930" height="655" alt="image" src="https://github.com/user-attachments/assets/361c7995-bff4-421f-8c47-3eddccf83ba7" />
<img width="829" height="748" alt="image" src="https://github.com/user-attachments/assets/74b0e926-2726-4edf-84a2-a71c167f6f06" />
<img width="743" height="611" alt="image" src="https://github.com/user-attachments/assets/330b9b98-f857-4fe4-b709-01bec3f1f7af" />
<img width="886" height="620" alt="image" src="https://github.com/user-attachments/assets/1b5bce9c-092f-4fd8-9ba2-e12ed04accec" />

