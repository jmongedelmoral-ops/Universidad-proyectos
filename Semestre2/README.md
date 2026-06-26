# 🏛️ Semestre 2 — Consolidación de Bases y Programación Orientada a Objetos

¡Bienvenido! En esta sección se encuentran los proyectos, algoritmos y laboratorios desarrollados durante mi segundo semestre académico. El enfoque principal de este periodo fue la adopción del diseño de software estructurado y la traducción de conceptos matemáticos teóricos en scripts lógicos y funcionales.

## 📂 Estructura de Materias

El contenido está organizado de forma modular en las siguientes carpetas:

* `POO/` — Proyectos aplicando el paradigma orientado a objetos (Java).
* `Algebra-Lineal/` — Scripts interactivos y herramientas orientadas a transformaciones geométricas, análisis vectorial y criptografía.

---

## 💻 Detalle de los Contenidos

### 1. 📐 Álgebra Lineal Computacional (Proyectos Extra-Bonus)
Aunque la materia mantuvo un enfoque fuertemente teórico, se desarrollaron diferentes soluciones de software interactivo para automatizar y visualizar procesos algebraicos complejos:

* **🖼️ Transformaciones Geométricas (Escalamiento de un Pentágono):**
  * **Concepto:** Aplicación de matrices de transformación lineal para alterar las dimensiones de un polígono regular en un plano bidimensional.
  * **Implementación:** Multiplicación de una matriz de escalamiento por los vectores de coordenadas de los vértices del pentágono para calcular su nueva posición y tamaño de forma dinámica.
* **📐 Analizador Vectorial (Base y Ángulo entre Vectores):**
  * **Concepto:** Comprobación de independencia lineal para determinar si dos vectores en $\mathbb{R}^n$ forman una base espacial.
  * **Implementación:** Resolución del determinante de la matriz asociada y aplicación del producto punto (junto con la función del coseno inverso) para calcular de manera precisa el ángulo interno entre ambos vectores.
* **🔐 Criptografía Clásica (Cifrado de Hill):**
  * **Concepto:** Sistema criptográfico de sustitución poligráfica basado en álgebra lineal.
  * **Implementación:** Codificación de texto convirtiendo caracteres a valores numéricos, organizados en vectores, para luego multiplicarlos por una matriz clave invertible (Módulo $n$). Incluye la lógica de descifrado calculando la matriz inversa modular.

### 2. ☕ Programación Orientada a Objetos (POO)
Esta carpeta recopila el software diseñado bajo las mejores prácticas del paradigma de objetos, priorizando el diseño limpio, la reutilización de código y la modularidad.

* **Conceptos Clave Implementados:**
  * **Abstracción y Encapsulamiento:** Control de accesos a datos mediante modificadores (`private`, `protected`, `public`) y encapsulado lógico.
  * **Herencia y Polimorfismo:** Creación de jerarquías de clases escalables y sobreescritura de métodos para lograr comportamientos dinámicos en tiempo de ejecución.
  * **Interfaces y Clases Abstractas:** Definición de contratos de diseño de software para desacoplar la arquitectura del sistema.
  * **Manejo de Excepciones:** Robustez de código mediante bloques `try-catch-finally` y excepciones personalizadas.
  * **Persistencia de Datos (I/O):** Lectura y escritura de archivos planos/binarios para el almacenamiento persistente de estados.
* **Lenguaje utilizado:** Java ☕

---

## 🛠️ Competencias Técnicas Adquiridas

1. **Abstracción Matemática Aplicada:** Habilidad para transformar fórmulas y teoremas teóricos en algoritmos lógicos funcionales de software.
2. **Modelado de Software:** Capacidad de traducir problemas del mundo real a diagramas de clases y código modularizado bajo el paradigma OOP.
3. **Clean Code:** Escritura de código legible, evitando funciones redundantes y respetando la nomenclatura estándar de la industria.

---

⏩ **[Volver al repositorio principal](./README.md)**
