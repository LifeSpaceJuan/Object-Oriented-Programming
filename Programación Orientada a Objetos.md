# Programación Orientada a Objetos

---

## Introducción a la Programación Orientada a Objetos

---

### *¿Qué resuelve la Programación Orientada a Objetos?*

Trata de ayudar con los huecos de la programación estructurada.

**A medida que crece el código, se hacia necesario reutilizar código**. Por esto nace POO.

#### Ayuda con:

- Código muy largo.

- Si algo falla, todo se rompe.

- Dificil de mantener.

#### Código Espagueti

Era un problema que sucedia cuando  habian muchos **if() else{}**.

*POO nos ayudo a simplificar la codificación.*

### *Paradigma Orientado a Objetos*

Es una filosofia de pensamiento de *Orientación a Objetos*.

#### Orientación a Objetos

Surge a partir de los problemas que tenemos y necesitamos plasmar en código.

↪**Obsrvar los problemas en forma de objetos**.

#### Paradigma POO

Teoría que suministra la base y modelo para resolver problemas.

**4 elementos:**

- Clases

- Propiedades

- Métodos

- Objetos

**Ademas se tiene los pilares:**

- Encapsulamiento

- Herencia

- Abstracción

- Polimorfismo

### *Diagramas de Modelado*

#### OML: Object Modeling Techniques

Metodología para el análisis orientado a objetos → 1991

#### UML: Unified Modeling Language

Lenguaje de Modelado Unificado → 1997

- Clases

- Casos de uso

- Objetos

- Actividades

- Herencia

- Estados

- Implementación

### *UML*

Para aplicar UML, mirar el siguiente link:

[UML (platzi.com)](https://platzi.com/clases/1474-oop/17219-uml/)

## Orientación a Objetos

---

### *Objetos*

Cuando tengamos un problema lo primero que debemos hacer es **identificar objetos**.

↪ Los objetos son aquellos que tienen propiedades y comportamientos.

- Pueden ser *físicos o conceptuales*.

#### Propiedades

Tambien pueden llamarse *atributos*, estos seran sustantivos.

#### Metodos (Comportamientos)

Serán todas las operaciones de objeto, suelen ser verbos o sustantivos y verbo.

<img src="https://static.platzi.com/media/user_upload/dog-2833b1ce-4289-447a-8cd0-7ad9b6f0da1a.jpg" title="" alt="" data-align="center">

### *Abstracción y Clases*

#### Clase

Es un modelo sobre el cual se construirá nuestro objeto. Permite generar más objetos.

#### Abstracción

Cuando se abstraen los datos de un objeto para generar una clase.

### *Diseño Modular*

Subdividir un sistema en partes pequeñas que nos ayuda a construir un sistema completo.

**Esto es para crear muchos elementos en masa.**

#### Modular

- Reutilizar

- Evitar colapsos

- Mantenible

- Legibilidad

- Resolución rapida de problemas

<img src="file:///C:/Users/elecj/AppData/Roaming/marktext/images/2021-09-17-12-55-10-image.png" title="" alt="" data-align="center">

#### Clase

- Modularidad

- Divide el programa en partes pequeñas modulos o clases.

- Separar las clases en archivos.

### *Analizando Uber en Objetos*

#### Objetos

- Trip

- User

- Route

- Driver

- Pagos:
  
  - card
  
  - paypal
  
  - cash

- Carros:
  
  - Uber X
  
  - Uber pool
  
  - Uber black
  
  - Uber Van

## Programación Orientada a Objetos: Análisis

---

### *Clases en UML y su sintaxis en código*

En un proyecto de programación aplicando POO, primero se identifica el problema, luego se identifican los objetos, se definen las clases y se plasma en un diagrama UML.

#### UML: Clase

| Nombre Clase                               |
|:------------------------------------------:|
| Atributo 1 <br> Atributo 2 <br> Atributo n |
| Metodo 1 <br> Metodo 2 <br> Metodo n       |

En el nombre de la clase, se le dice la  *identidad*, los atributos de la clases son el *estado* y los metodos son *Comportamiento*.

#### Clases en los lenguajes de programación

```java
class Person{}
```

```py
class Person:
```

```javascript
function Person(){}
```

```php
class Person{}
```

#### Definición de Clases con atributos y métodos

```java
class person {
    String name = "";
    void walk(){}
}
```

```python
class Person:
    name = "";
    def walk():
```

```php
class Person {
    $name = "";
    function walk(){}
}
```

```js
Person.prototype.walk = function(){

}
```

### *Modelando nuestros objetos Uber*

Todos los objetos oclases tendran un ID para poder integrarlo con faciliad a una base de datos. 

Estos son los atributos de los objetos de nuestro proyecto:

| User     | Driver   | Route    | UberX      | Uber Pool  | Uber Black        |
| -------- | -------- | -------- | ---------- | ---------- | ----------------- |
| id       | id       | id       | id         | id         | id                |
| name     | name     | start[2] | license    | license    | license           |
| email    | email    | end[2]   | driver     | driver     | driver            |
| password | password |          | passangers | passengers | passengers        |
|          |          |          | brand      | brand      | brand             |
|          |          |          | model      | model      | typeCarAccepted[] |
|          |          |          |            |            | seatsMaterial[]   |

| Uber Van          | Card   | Pay pal | Cash |
| ----------------- | ------ | ------- | ---- |
| id                | id     | id      | id   |
| license           | number | email   |      |
| driver            | cvv    |         |      |
| passengers        | date   |         |      |
| typeCarAccepted[] |        |         |      |
| seatsMaterial[]   |        |         |      |

### *¿Qué es la herencia?*

  Una de las leyes del código es:

                            <center>**"Don't repeat yourself"**</center>

- Reducir la duplicacipon en la programación, mantiene la simplisidad en el código.

- Al duplicar la información se incrementa la dificultad en los cambios y evolución.

#### Herencia

Permite crear nuevas clases a partir de otras.

- Se establece una relación **padre e hijo**.

![](C:\Users\elecj\AppData\Roaming\marktext\images\2021-09-18-12-03-11-image.png)

La siguiente imagen se muestra la forma de simplificar las clases *futbolista, entrenador, Masajistas*, en una nueva clase *padre SeleccionFutbol*.

![](C:\Users\elecj\AppData\Roaming\marktext\images\2021-09-18-12-05-47-image.png)

### *Aplicando herencia a nuestro proyecto Uber*

**Clase padre:** Account → id, name, document, email, password

De esa clase padre derivan el *User y Driver*.

**Clase padre:** Payment → id

El metodo de pago se relaciona si hay viaje (trip), y tambien de *User*. De ahi se derivan los tres objetos de forma de pago.

**Clase padre:** Car → id, license, driver, passengers.

De esa clase padre *car*, se pude derivar dos clases hijas *car basic y car advance*, que a su vez pude heredar dos clases hijas *Uberx, Uber pool, Uber Van, Uber Black*.

<img title="" src="https://static.platzi.com/media/user_upload/Uber%20%281%29-c4aeb826-1187-4cd8-9696-8074a722a316.jpg" alt="una imagen" width="757">

# 
