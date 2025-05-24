# Situación inicial en TechLab

Silvia, la Product Owner, ha notado que algunas operaciones del backend podrían fallar. Por ejemplo:
- Si un cliente busca un producto que no existe, el sistema podría fallar o retornar datos incoherentes
- Matías y Sabrina desean manejar estas situaciones adecuadamente:
   - Informando claramente al usuario
   - Registrando errores para análisis posterior

Además, necesitan:
- Organizar clases en paquetes según responsabilidad (productos, clientes, pedidos, utilidades)
- Considerar modularización para control de visibilidad del código

---

## ⚙️ Ejercicio Práctico
**Optativo | No entregable**

### Manejo de Excepciones
1. **Método con excepción**:
   - Crea `buscarProductoPorNombre(String nombre)` que lance `ProductoNoEncontradoException` si no encuentra el producto
   - Maneja la excepción en `main` con `try-catch`

2. **Excepciones personalizadas**:
   - Crea `StockInsuficienteException` para cuando no haya suficiente stock
   - Muestra mensajes adecuados al usuario

---

## ⚙️ Ejercicio Práctico
**Optativo | No entregable**

### Organización de código
1. **Paquetes**:
   - Mueve clases a:
      - `com.techlab.productos` (Producto, Bebida, Comida)
      - `com.techlab.excepciones`
   - Ajusta los imports

2. **Módulos**:
   - Crea módulo `com.techlab.negocio` que exporte `com.techlab.productos`
   - Simula módulo `com.techlab.ui` que use estos productos

---

## 📋 Pre-Entrega de Proyecto
**Obligatorio | Entregable**

### Revisión de progreso
- Oportunidad para mostrar avances y recibir feedback
- Base para el Trabajo Final Integrador (TFI)

**Componentes**:
1. Cuestionario de Autoevaluación
2. Pre-Entrega del proyecto

**Plazo**: 7 días desde Clase N°8

---

## ⚙️ Ejercicio Práctico
**Obligatorio | Entregable**

### Sistema de Gestión TechLab

**Objetivo**:  
Aplicación Java para gestionar productos y pedidos usando:
- Variables y operadores
- Colecciones (Listas)
- POO (Encapsulamiento, Herencia, Polimorfismo)
- Excepciones
- Paquetes/Módulos

---

### Requerimientos principales

1. **Gestión de Productos**:
   - Agregar (nombre, precio, stock)
   - Listar (con ID/posición)
   - Buscar/Actualizar (con validaciones)
   - Eliminar (con confirmación opcional)

2. **Pedidos**:
   - Crear con múltiples productos
   - Validar stock disponible
   - Calcular total
   - Actualizar stock
   - Listar pedidos realizados

3. **Interfaz**:
   - Menú interactivo con opciones:
     ```
     =================================== SISTEMA DE GESTIÓN - TECHLAB ==================================
     1) Agregar producto
     2) Listar productos
     3) Buscar/Actualizar producto
     4) Eliminar producto
     5) Crear un pedido
     6) Listar pedidos
     7) Salir
     ```
   - Funcionamiento en loop hasta salir

---

**Nota**: Los ejercicios guiarán progresivamente hacia la Pre-Entrega y Proyecto Final Integrador.