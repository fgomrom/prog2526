# Definición de funciones
def parImpar(n):
    resultado = "Par"
    if n%2!=0:
        resultado = "Impar"
    return resultado

# Programa principal
n = int(input("Introduzca un número natural: "))
print(f"El número {n} es {parImpar(n)}")
