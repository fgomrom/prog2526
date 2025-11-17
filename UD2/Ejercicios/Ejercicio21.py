#1 Escribe el código en Python para declarar e inicializar esta matriz como una lista anidada.
m = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
#2 Accede e imprime el valor que se encuentra en la posición primera fila segunda columna
print(m[1][2])
#2 Accede e imprime el valor que se encuentra en la posición: elmento  central
print(m[1][1])
#3 Escribe un bucle que recorra solo la segunda fila (índice 1) e imprima cada uno de sus elementos.
print(m[1])
for fila in m[1]:
    print(fila, end=" ")
print()
for i in range(len(m)):
    print(m[1][i])
#4 Escribe un bucle anidado que recorra toda la matriz e imprima todos sus elementos, separados por espacios en la misma línea para simular la matriz visualmente.
for fila in m:
    for elemento in fila:
        print(elemento, end=" ")
    print()