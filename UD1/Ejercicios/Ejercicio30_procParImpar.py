# Definición de funciones
def parImpar(n):
    if n%2!=0:
        print(f"El número {n} es impar")
    else:
        print(f"El número {n} es par")

# Programa principal
n = int(input("Introduzca un número natural: "))
parImpar(n)
