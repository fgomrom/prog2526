# Dado un número x devuelve si es primo (true) o si no lo es (false)
def esPrimo (x):
    if x <= 1: return False #El primer primo es el 2
    for i in range(2,x-1):
        if (x % i == 0):
                return False
    return True

# Calcula los n primeros números primos
n = int(input("Introduzca número:"))
for i in range(2,n+1):
    if (esPrimo(i)): print(i)
        
