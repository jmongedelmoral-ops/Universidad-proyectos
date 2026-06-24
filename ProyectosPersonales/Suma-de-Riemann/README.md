# Visualización de Integrales: El Área Bajo la Curva 

¡Hola! Este repositorio contiene el código en Python que utilicé en mi video de YouTube para explicarle a mi papá, de forma sencilla y visual, qué es una integral y cómo se relaciona con el concepto del **área bajo la curva** mediante la suma de rectángulos (Suma de Riemann).

 **Puedes ver el video explicativo aquí:** https://youtu.be/Lz82El2sai0

##¿De qué trata este proyecto?

Para alguien que no viene del mundo de las matemáticas avanzadas, el término "integral" puede sonar intimidante. El objetivo de este script es demostrar visualmente que integrar es, en esencia, algo muy intuitivo: **sumar muchos rectángulos pequeños para aproximar un área irregular.**

El código genera una gráfica interactiva donde se muestra:
1. Una función matemática (curva).
2. Los rectángulos que se forman debajo de ella.
3. Cómo, a medida que aumentamos la cantidad de rectángulos (haciéndolos más delgados), la aproximación se vuelve exacta.

## Requisitos e Instalación

Para ejecutar este código en tu computadora, necesitarás tener instalado **Python 3** y las siguientes librerías de visualización y cálculo:

* **Matplotlib:** Para dibujar la gráfica y los rectángulos.
* **NumPy:** Para procesar los datos numéricos de la función de manera eficiente.

Puedes instalarlas rápidamente ejecutando el siguiente comando en tu terminal:

```bash
pip install matplotlib numpy
```

## Cómo usar el script
Integral.py.

Ejecuta el script desde tu terminal:
```
`python Integral.py
```
Se abrirá una ventana con la gráfica matemática interactiva que viste en el video.

## Concepto Matemático Explicado

En el código aplicamos el método de las Sumas de Riemann. 
Modificando las variables dentro del archivo, puedes experimentar con:

Cambiar la función: Probar con curvas diferentes (parábolas, funciones trigonométricas, etc.).

Número de rectángulos ($n$): Si pones 5 rectángulos verás mucho espacio vacío (error), pero si subes a 50 o 100, verás cómo los rectángulos "copian" casi a la perfección la forma de la curva, alcanzando el valor real de la integral.

Hecho con cariño para explicarle ciencia a la familia. 

Si te sirvió el video o el código, ¡un commit o una estrella en el repositorio son más que bienvenidos!
