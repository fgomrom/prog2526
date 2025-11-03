def busqueda_lineal(lista, objetivo):
    for i in range(len(lista)):
        if lista[i] == objetivo:
            return i  # ¡Retorna el índice donde lo encontró!
    return -1 # Si el bucle termina, el elemento no está

# Probando la búsqueda lineal
lista = ["Comprar leche", "Pagar recibos", "Estudiar Python", "Llamar a mamá"]
posicion = busqueda_lineal(lista, "Estudiar Python")
if posicion >= 0:
    print("Elemento encontrado en la posición: ", posicion)
else:
    print("Elemento no encontrado")