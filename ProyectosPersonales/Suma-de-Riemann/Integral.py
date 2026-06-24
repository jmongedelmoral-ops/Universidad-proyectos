import numpy as np
import matplotlib.pyplot as plt

def f(x):
    return x**2

a, b = 0, 5
n = 501 # Número de rectángulos

# Configuración de la curva
x_curva = np.linspace(a, b, 1000)
y_curva = f(x_curva)

# Configuración de los rectángulos
x_rects = np.linspace(a, b, n, endpoint=False)
ancho = (b - a) / n
y_rects = f(x_rects)

# --- EL CÁLCULO DE LA INTEGRAL ---
# Área de cada rectángulo = ancho * altura
areas = ancho * y_rects
area_total = np.sum(areas)
# ---------------------------------

# Renderizado
plt.figure(figsize=(10, 5))
plt.plot(x_curva, y_curva, color='red', label='f(x) = x²')
plt.bar(x_rects, y_rects, width=ancho, align='edge', alpha=0.3, edgecolor='blue', label='Rectángulos')

# Mostrar el resultado en la gráfica
plt.text(1/4, 5 +(b)/2 , f'Área Aproximada: {area_total:.4f}', fontsize=12, bbox=dict(facecolor='white', alpha=0.5))
plt.title(f'Suma de Riemann con n={n}')
plt.legend()
plt.show()

print(f"El área total aproximada con {n} rectángulos es: {area_total}")