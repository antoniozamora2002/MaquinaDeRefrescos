# Máquina de Refrescos 🚀

Este proyecto es una simulación de una máquina dispensadora de refrescos desarrollada en **Java**. Permite a los usuarios comprar bebidas, reabastecer el inventario y retirar dinero de la máquina.

## 📌 Funcionalidades

- **Compra de refrescos**: El usuario puede seleccionar entre diferentes bebidas con precios variados.
- **Suministro de productos**: Se puede reabastecer la máquina con más bebidas.
- **Retiro de dinero**: El operador puede retirar el dinero acumulado en la máquina.

## 🛠️ Estructura del Proyecto

El proyecto está dividido en varias clases:

- `MaquinaDeRefrescos.java`: Clase principal que maneja la lógica del sistema.
- `Precios.java`: Contiene los precios de cada refresco y calcula el total de la compra.
- `AlmacenDeRefrescos.java`: Maneja el almacenamiento y reabastecimiento de bebidas.
- `RetiroDeBillete.java`: Administra el dinero almacenado y permite su retiro.

## 🏗️ Cómo Ejecutar

1. Clona este repositorio o descarga los archivos.
2. Abre el proyecto en **NetBeans** o cualquier otro entorno compatible con Java.
3. Ejecuta la clase `MaquinaDeRefrescos.java`.

## 📋 Uso

Cuando ejecutas el programa, verás un menú con opciones para:

1. Comprar una bebida.
2. Suministrar más productos.
3. Retirar el dinero almacenado.

Para cada opción, el usuario deberá ingresar los valores requeridos (cantidad de bebidas, monto a retirar, etc.).

## 📌 Ejemplo de Interacción

```bash
*******************************
¿Qué acción desea realizar?
1. Comprar bebida.
2. Suministrar refrescos.
3. Retiro de dinero.
*******************************
```

Si el usuario elige comprar una bebida, verá algo como:

```bash
*******************************
*** Máquina de refrescos :D ***
1. Pepsi S/. 2.00
2. Coca-Cola S/. 2.50
3. Inka Kola S/. 2.50
4. Fanta S/. 2.00
5. Crusch S/. 1.50
6. Sprite S/. 2.00
7. Bigcola S/. 1.00
8. Agua San Luis S/. 1.50
*******************************
```

## 📌 Mejoras Futuras

- Implementar una interfaz gráfica.
- Agregar un sistema de pago con billetes y monedas.
- Mejorar la gestión de stock y ventas.

---

🛠️ **Desarrollado por Antonio Zamora**
