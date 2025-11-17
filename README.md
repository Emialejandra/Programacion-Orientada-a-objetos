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









