def esPrimo(numero):
    # Los números menores o iguales a 1 no son primos
    if numero <= 1:
        return False

    # El número 2 es el único primo par
    if numero == 2:
        return True

    # Bucle para verificar divisores
    # Empezamos desde 3
    i = 3
    while i <= numero:
        if numero % i == 0:
            return False  # Se encontró un divisor, no es primo
        i += 1

    # Si el bucle termina sin encontrar divisores, el número es primo
    return True

            
 
