# Ejercicio 2: Recorrer un array, mostrarlo y calcular la suma
# Declarar e inicializar un array
lista = [1,2,3,4,5]
longitud = len(lista)
suma = 0
elemento = 0
# Recorrer el array con un for tradicional (índices)
for i in range(longitud):
    elemento = lista[i]
    print(elemento)
    suma = suma + elemento
    #suma += list[i] #En una sola línea
print("La suma es:",suma)
# Con un for-each
suma = 0
for elemento in lista:
    suma += elemento
    print(elemento)
print("La suma es:",suma)
# Con un while
suma = 0
i = 0
while i < longitud:
    elemento = lista[i]
    suma += elemento
    i += 1
    print(elemento)
print("La suma es:",suma)
    
    
    