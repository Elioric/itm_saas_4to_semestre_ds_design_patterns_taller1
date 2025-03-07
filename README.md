# itm_saas_4to_semestre_ds_design_patterns_taller1
Taller 1 del curso Diseño de Software, cuarto semestre Tecnología en Diseño y Programación de Soluciones de Software como Servicio ITM. Patrones de diseño (Chain of Responsibility)

### Diagrama de clases

![Alt text](img/diagrama_clases.jpeg?raw=true "Diagrama de clases de la implementación de cadena de responsabilidad")

Se crea una interface IManejador que define los métodos que deben ser implementados en cada una de las clases concretas. Un objeto que implemente la interface IManejador es referenciado desde la clase contexto, por lo que se define una relación de asociación entre las dos. La interface IManejador se referencia a sí misma cuando pertenece a una cadena de más de un eslabón. Para evitar duplicidad de código en cada una de las clases concretas, se crea una clase abstracta que implementa la interface y de esta heredan las clases concretas Dispensador y ValidadorMonto. Cada una de estas clases "concreta" el método abstracto `procesarTransaccion()` con la lógica específica necesaria para cumplir su función en la cadena. La clase concreta Dispensador cuenta con el atributo `denominacion` en el cual se especifica la denominación del billete a dispensar. No se crean diferentes clases por cada denominación para evitar la duplicidad de código y hacer el programa más legible. La clase concreta ValidadorMonto valida que el monto ingresado sea válido antes de proceder a dispensarlo.

### Diagrama de Flujo

![Alt text](https://github.com/Elioric/itm_saas_4to_semestre_ds_design_patterns_taller1/blob/main/img/IMG-20250306-WA0026(1).jpg)
