def busquedaLineal (lista, n):
    i = 0
    respuesta = -1
    while i < len(lista) and respuesta == -1:
        if lista[i] == n:
            respuesta = i
        i = i + 1 
    return(respuesta)


# import random
# 
# num = []
# for i in range(5):
#     numero = random.randint(0, 10)  # Generar un número entre 0 y 10
#     num.append(numero)
# 
# n = int(input("Introduzca el número que quiere buscar (entre 0 y 10): "))
# print(busquedaLineal(num,n))