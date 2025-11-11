def busquedaBinaria(numeros,eleccion):
    izq = 0
    der = len(numeros) - 1
    medio = 0
    while izq <= der:
        medio = (izq + der) // 2
        if numeros[medio] == eleccion:
            return medio
        elif numeros[medio] < eleccion:
            izq = medio + 1
        else:
            der = medio - 1
    return -1
# numeros = [0,10,20,30,40,50,60,70,80,90]
# eleccion = int(input("Elije el numero que quieras multiplo de 10: "))
# 
# resultado = busquedaBinaria(numeros,eleccion)
# 
# if resultado != -1:
#     print("El numero",eleccion,"se encuentra en la posicion",(resultado))
# else:
#     print("Ese numero no se encuentra.")