# Álgebra Lineal Aplicada (Semestre 2)

Este módulo aborda los fundamentos del álgebra lineal, desde el manejo de matrices y sistemas de ecuaciones hasta las transformaciones lineales y espacios vectoriales. 

Para consolidar el conocimiento teórico, se nos incentivó a realizar proyectos extra que aplicasen lo visto en clases.

---

## Proyectos Extrabonus Desarrollados

### 1. Sistema de Cifrado de Hill
Un programa de criptografía simétrica basado en álgebra lineal. El sistema toma una cadena de texto (string) y una matriz llave invertible para realizar el proceso de cifrado y descifrado.
* **Concepto matemático aplicado:** Multiplicación de matrices, aritmética modular y obtención de la matriz inversa mediante determinantes y la adjunta.

### 2. Analizador de Espacios Vectoriales 
Una herramienta diseñada para evaluar conjuntos de vectores en dimensiones $\mathbb{R}$, $\mathbb{R}^2$ y $\mathbb{R}^3$. El programa automatiza el análisis geométrico y algebraico de los elementos ingresados.
* **Funcionalidades clave:** * Identificación de independencia lineal para determinar si los vectores forman una **base** del espacio.
  * Cálculo del **ángulo entre vectores** mediante el producto punto (producto escalar) y magnitudes.

### 3. Motor de Transformaciones Geométricas (Proyecto Final)
Aplicación gráfica interactiva que renderiza un pentágono en pantalla y permite al usuario manipularlo en tiempo real a través de un menú de opciones.
* **Funcionalidades de la interfaz:** Escalado dinámico (encoger y agrandar la figura geométrica desde el menú).
* **Concepto matemático aplicado:** Transformaciones lineales en el plano mediante **matrices de transformación** (multiplicación de una matriz de escala por los vectores de coordenadas de los vértices del pentágono).

---

## Estructura de la Carpeta

* **`Cifrado-Hill/`:** Código fuente del algoritmo de cifrado.
* **`Analizador-Vectores/`:** Script de cálculo y validación de bases.
* **`Transformaciones-Pentagono/`:** Código de la aplicación gráfica del proyecto final.