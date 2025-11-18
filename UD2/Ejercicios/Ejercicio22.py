m = [["A","B","C"],["D","E","F"],["G","H","I"]]
for fila in m:
    for letra in fila:
        print(letra,end=" ")
    
fila = 0
columna = 0
while columna < len(m[0]):
    fila = 0
    while fila < len(m):
        print(m[fila][columna])
        fila = fila + 1
    columna = columna + 1
    
for i in range(len(m)):
    for j in range(len(m[i])):
        print(m[j][i])
