#Ejercicio 2: Procesamiento de Matriz (Transposición Parcial)
#Este ejercicio requiere el uso de bucles anidados por índice (range) y una lógica condicional para diferenciar la diagonal.
M = [
    [10, 20, 30],
    [40, 50, 60],
    [70, 80, 90]
]
N = 3 # La dimensión de la matriz (3x3)

# Inicializar la matriz T (transpuesta) con ceros, de la misma dimensión (N x N)
T = [[0 for j in range(N)] for i in range(N)]

# Algoritmo de Transposición Parcial
for i in range(N):  # i = índice de Fila (0, 1, 2)
    for j in range(N):  # j = índice de Columna (0, 1, 2)
        
        if i == j:
            # Caso 1: Elementos de la Diagonal Principal (i=j)
            # Deben permanecer en su posición original.
            T[i][j] = M[i][j]
        else:
            # Caso 2: Elementos fuera de la Diagonal (i!=j)
            # Deben ser transpuestos (fila M -> columna T; columna M -> fila T)
            T[i][j] = M[j][i]

print("\n--- Matriz T (Transposición Parcial) ---")
for fila in T:
    print(fila)