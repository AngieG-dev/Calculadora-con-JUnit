# 🧮 Calculadora Testing - JUnit

¡Bienvenid@ a mi repositorio! Este proyecto es una calculadora desarrollada en **Java** como parte de un desafío guiado de programación. El objetivo principal fue aprender a separar el código productivo de las pruebas y asegurar que todo funcione correctamente mediante **JUnit**.

## 🎯 ¿De qué trata este proyecto?
La idea fue construir una calculadora funcional y validar cada operación matemática mediante pruebas unitarias. Durante el proceso aprendí a:
* Crear clases y métodos productivos en Java.
* Organizar proyectos profesionales con **Maven**.
* Escribir pruebas automatizadas para detectar errores a tiempo.

## 🛠️ Tecnologías y Requisitos
* **Lenguaje:** Java 21
* **Gestión de Proyecto:** Maven
* **Testing:** JUnit Jupiter 6.0.3

## 📂 Estructura del Proyecto
El proyecto sigue el estándar de la industria para organizar el código:
* `src/main/java`: Lógica de la calculadora.
* `src/test/java`: Pruebas unitarias.

## 🧪 Pruebas Implementadas
Para cada método (sumar, restar, multiplicar y dividir), apliqué el patrón **Preparar → Ejecutar → Verificar**:
* **Validaciones básicas:** Resultados esperados en operaciones aritméticas.
* **Manejo de Errores:** Uso de `assertThrows` para validar que el programa impida la división por cero.

## 🚀 Cómo ejecutar las pruebas
Usa el siguiente comando en tu terminal para correr los tests:
```bash
mvn test
