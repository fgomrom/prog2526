def comparar_arrays(arr1, arr2, arr3):
    """
    Compara dos arrays de forma básica verificando cada elemento.
    Retorna True si son iguales, False si no.
    """
    # Verificar si tienen la misma longitud
    if len(arr1) != len(arr2) or len(arr1) != len(arr3):
        return False
    
    # Comparar elemento por elemento
    for i in range(len(arr1)):
        if arr1[i] != arr2[i] and arr1[i] != arr3[i]:
            return False
    
    return True

lista_a = [10, 20, 30]
lista_b = [10, 20, 30]
lista_c = [30, 20, 10] # Mismos elementos, orden diferente
lista_d = [10, 20]     # Longitud diferente
print(comparar_arrays(lista_a,lista_c))