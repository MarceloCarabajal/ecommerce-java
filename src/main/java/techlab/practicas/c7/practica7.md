# Situación inicial en TechLab

Silvia, la Product Owner, observa que actualmente hay una sola clase `Producto`, pero el catálogo ha crecido y cada tipo de producto tiene características y reglas distintas. Por ejemplo, `Té` y `Café`. Algunos requieren cálculos de descuento particulares, otros tienen restricciones de stock o fecha de vencimiento.

Matías y Sabrina se dan cuenta de que no pueden seguir agregando `if` y `switch` dentro de `Producto` para cada caso especial. Necesitan una forma más elegante de modelar las diferencias: la **herencia** les permitirá crear una clase base `Producto` y luego `Te` y `Café` como subclases que especialicen el comportamiento. El **polimorfismo** les permitirá tratar a todos ellos como `Producto` al mismo tiempo que cada uno sabe hacer su trabajo de forma independiente.

Además, en algunos casos se requerirá definir un comportamiento sin implementar completamente la lógica en la superclase, o establecer un contrato de métodos que las subclases deben cumplir. Aquí entran en juego las **clases abstractas** y las **interfaces**.

Para cumplir con las necesidades, el equipo de desarrollo (Matías, Sabrina) y vos deberán:

## ⚙️ Ejercicio práctico
**Optativo | No entregable**

### 1- Herencia y polimorfismo

#### **Herencia básica**:
- Creá la clase abstracta `Producto` con un atributo `nombre` y un método abstracto `calcularPrecioFinal()`.
- Creá `Te` y `Café` que extiendan `Producto`.
- Implementá `calcularPrecioFinal()` en cada subclase.

#### **Polimorfismo**:
- Creá un `ArrayList<Producto>` y agregá instancias de `Te` y `Café`.
- Iterá sobre la lista y llamá a `calcularPrecioFinal()` en cada uno. Observá cómo se ejecuta la versión correspondiente a cada subclase.

## ⚙️ Ejercicio práctico
**Optativo | No entregable**

### 2- Override e interfaces

#### **Uso de `super` y `@Override`**:
- En `Café`, agregá un constructor que llame a `super(...)` para inicializar atributos comunes.
- Sobrescribí algún método de `Producto` y llamá a `super` en su interior para reutilizar parte de la lógica.

#### **Interfaces**:
- Creá la interfaz `Descontable` con el método `aplicarDescuento(double porcentaje)`.
- Hacé que `Te` y `Café` la implementen.
- Probá aplicar descuentos a diferentes productos.