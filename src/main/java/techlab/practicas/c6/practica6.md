Silvia, la Product Owner, ha observado que ciertos datos del sistema se están modificando de manera impredecible. A veces, por error, algún método deja un producto con precio negativo o un cliente con email vacío. Matías y Sabrina entienden que no pueden dejar que cualquier parte del código cambie atributos sin control.

Además, ahora quieren que un Pedido (una nueva clase) contenga varios objetos Producto. Este escenario requiere que las clases colaboren entre sí, ya que el Pedido deberá conocer los productos que incluye.

Por último, el equipo quiere llevar la cuenta de cuántos productos se han creado en total. Esto sugiere la necesidad de una variable a nivel de clase, compartida por todas las instancias.

Para poder llegar con los tiempos de entrega dispuestos por Silvia, será necesario realizar las siguientes acciones:

## ⚙️ Ejercicio práctico
**Optativo | No entregable**

### 1- Encapsulamiento

#### 1) Encapsulación:
- Convertí los atributos de `Cliente` a `private`.
- Creá getters y setters para `nombre` y `email`.
- Asegurá que `email` contenga un `@` antes de asignarlo.

#### 2) Colaboración entre Clases:
- Creá una clase `Carrito` que contenga una `ArrayList<Producto>`.
- Agregale métodos para sumar productos y calcular el total.
- Si te animás: demostrá el uso creando un `Carrito`, agregándole productos y mostrando el total.

## ⚙️ Ejercicio práctico
**Optativo | No entregable**

### 2- Variables static

#### 1) Variables estáticas:
- En `Producto`, agregá una variable estática que lleve la cuenta de cuántos productos se crean.
- Mostrá ese valor luego de instanciar varios productos.

#### 2) Control de acceso con setters:
- Añadí una validación en el setter de `cantidadEnStock` para que no se permita asignar valores negativos.
- Probá asignar `-10` y verificá que el valor no cambie.