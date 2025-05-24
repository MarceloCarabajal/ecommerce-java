# 📋 Preentrega de Proyecto - Sistema de Gestión TechLab

## 🔍 Revisión de Progreso
**Obligatorio | Entregable**

### Objetivos:
- Mostrar avances del proyecto Java
- Recibir feedback para mejorar
- Sentar bases para el Trabajo Final Integrador (TFI)

### Componentes requeridos:
1. **Cuestionario de Autoevaluación** (disponible en Ruta N°2 del Campus Virtual)
2. **Entrega del proyecto funcional**

**Plazo:** 7 días corridos desde Clase N°8

---

## ⚙️ Sistema de Gestión de Productos y Pedidos

### 📌 Objetivo General
Desarrollar aplicación Java que permita:
- Registrar y gestionar productos
- Crear pedidos con múltiples productos
- Implementar:
    - POO (Encapsulamiento, Herencia, Polimorfismo)
    - Manejo de excepciones
    - Organización en paquetes/módulos

---

## 📋 Requerimientos Funcionales

### 1. Gestión de Productos
| Funcionalidad | Detalles |
|--------------|----------|
| Agregar | Nombre (String), Precio (double), Stock (int) |
| Listar | Mostrar ID, Nombre, Precio, Stock |
| Buscar/Actualizar | Por ID o nombre, con validaciones |
| Eliminar | Con confirmación opcional |

### 2. Gestión de Pedidos
| Funcionalidad | Detalles |
|--------------|----------|
| Crear | Con múltiples productos y cantidades |
| Validar | Stock disponible |
| Calcular | Total (precio × cantidad) |
| Actualizar | Stock al confirmar pedido |
| Listar | Mostrar pedidos con detalles |

---

## 💻 Menú Principal

=================================== SISTEMA DE GESTIÓN - TECHLAB ==================================

1. Agregar producto

2. Listar productos

3. Buscar/Actualizar producto

4. Eliminar producto

5. Crear un pedido

6. Listar pedidos

7. Salir
Elija una opción:


---

## 🛠️ Requerimientos Técnicos

### Estructura de Clases
```java
// Paquete com.techlab.productos
class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    // Getters/Setters
}

// Paquete com.techlab.pedidos
class Pedido {
    private List<LineaPedido> items;
    public double calcularTotal() { ... }
}

class LineaPedido {
    private Producto producto;
    private int cantidad;
}
```

Manejo de Excepciones

```
// Paquete com.techlab.excepciones
class StockInsuficienteException extends Exception {
    public StockInsuficienteException(String message) {
        super(message);
    }
}
```
Flujo de Ejecución
Agregar Producto → Valida datos ingresados

Crear Pedido → Verifica stock, lanza excepción si es necesario

Actualizar Stock → Valida que no sea negativo

📂 Organización del Código

```
src/
├── main/
│   ├── java/
│   │   ├── com.techlab.productos/
│   │   ├── com.techlab.pedidos/
│   │   ├── com.techlab.excepciones/
│   │   └── Main.java
└── test/
    └── java/
        └── com.techlab.test/
```

✅ Criterios de Evaluación
Funcionalidad completa del menú

Correcto manejo de excepciones

Implementación de POO

Organización en paquetes

Validación de datos

Nota: Los ejercicios prácticos guiarán el desarrollo progresivo hacia la entrega final.