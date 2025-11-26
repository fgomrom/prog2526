# Ejercicio 4: Validación de Formato (Expresiones Regulares)
# Este ejercicio requiere la creación de una única expresión regular que represente el patrón de 8 caracteres.

import re

# Formato: 2MAY - 2MIN - 3DIG
# Longitud total: 8 caracteres

def validar_codigo_producto(codigo):
    # ^: Inicio de la cadena
    # [A-Z]{2}: Exactamente 2 letras mayúsculas
    # -: Un guion literal
    # [a-z]{2}: Exactamente 2 letras minúsculas
    # [0-9]{3}: Exactamente 3 dígitos
    # $: Fin de la cadena
    patron = r"^[A-Z]{2}-[a-z]{2}[0-9]{3}$"
    
    # re.match comprueba si el patrón coincide desde el inicio de la cadena
    if re.match(patron, codigo):
        return True
    else:
        return False

# Pruebas requeridas:
print("\n--- Pruebas de Validación RegEx ---")
print(f"AB-xy123 (True): {validar_codigo_producto('AB-xy123')}")
print(f"A B-xy123 (False): {validar_codigo_producto('A B-xy123')}")
print(f"ZX-aBc555 (False): {validar_codigo_producto('ZX-aBc555')}") # Falla por la 'B' mayúscula en minúsculas
print(f"XY-ab99 (False): {validar_codigo_producto('XY-ab99')}") # Falla por la longitud (solo 2 dígitos)