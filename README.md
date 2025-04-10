# Proyecto POO Java - Sistema de Cámara e Impresión de Fotos

*Elaborado por:*  
Anghelic Peñaranda  
Stefany Murillo  
Valeria Quitiaquez Pasuy  

*Asignatura:* Ingeniería de software  
*Docente:* Jhon Haide Cano Beltran  

## Descripción General

Este proyecto es una simulación en Java que representa el pedido de productos tecnológicos como cámaras o servicios de impresión de fotos. Está basado en un diagrama de clases y aplica principios fundamentales de la Programación Orientada a Objetos, así como patrones de diseño para lograr un código limpio, reutilizable y escalable.

## Conceptos Aplicados

Se utiliza la abstracción a través de una clase abstracta llamada Producto, de la cual heredan las clases Camara e Impresion. El encapsulamiento está presente en el uso de atributos privados y métodos públicos para acceder a ellos. La herencia permite compartir el comportamiento común entre productos, y el polimorfismo se aplica al sobrescribir el método mostrarDetalle() de forma distinta en cada subclase.

También se usan relaciones de composición, como en el caso de la clase Impresion que contiene una lista de objetos Foto. Se implementa la agregación en la clase Pedido, que contiene referencias tanto a un cliente como a una lista de productos. La relación de uso se observa cuando Pedido utiliza los métodos de Producto para mostrar sus detalles.

El patrón de diseño creacional Factory Method está presente en la clase ProductoFactory, que permite crear instancias de diferentes tipos de productos (impresiones o cámaras) dependiendo de los argumentos que se le pasen.

## Estructura del Código

- Producto: clase abstracta base con el número del producto y el método abstracto mostrarDetalle().
- Camara: clase hija de Producto, con atributos marca y modelo.
- Foto: clase utilizada para representar imágenes individuales.
- Impresion: subclase de Producto, que contiene una lista de fotos.
- Cliente: clase con datos del cliente como cédula y nombre.
- Pedido: clase que almacena productos adquiridos por un cliente, junto con fecha y número de tarjeta.
- ProductoFactory: clase que implementa el patrón Factory Method para crear objetos de tipo Producto.
