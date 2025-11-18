m = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
m2 = [[0, 0, 0],[0, 0, 0],[0, 0, 0]]
for fila in range(len(m)):
    for columna in range(len(m[fila])):
        # Si el elemento es multiplo de 2 lo muevo a m2
        if m[fila][columna] % 2 == 0:
                m2[fila][columna] = m[fila][columna]
                m[fila][columna] = 0
                
print("M:")
for fila in m:
    print(fila)

print("\nM2:")
for fila in m2:
    print(fila)                