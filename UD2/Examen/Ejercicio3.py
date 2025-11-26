#Ejercicio 3: Análisis de Texto y Conteo (Cadenas)
#Este ejercicio requiere manipulación de cadenas (lower, split) para el conteo de palabras y el uso de listas/bucles para la inversión de orden.

texto = "El Python es un lenguaje de programación muy popular. Python se usa en ciencia de datos y desarrollo web."

# --- 1. Conteo de Palabras Clave ---
def contar_palabra_clave(texto):
    # Convertir a minúsculas y limpiar puntuación para aislar palabras
    texto_limpio = texto.lower().replace('.', '').replace(',', '')
    
    # Usar .split() para obtener una lista de palabras
    palabras = texto_limpio.split()
    
    conteo = 0
    palabra_buscada = "python"
    
    # Recorrer la lista de palabras y contar coincidencias exactas
    for palabra in palabras:
        if palabra == palabra_buscada:
            conteo += 1
            
    print(f"\nLa palabra '{palabra_buscada.title()}' aparece {conteo} veces como palabra completa.")
    # Salida esperada: 2

# --- 2. Inversión de Frase ---
def invertir_frase(texto):
    # 1. Convertir a mayúsculas
    texto_mayus = texto.upper()
    
    # 2. Dividir la cadena en una lista de palabras
    palabras = texto_mayus.split()
    
    # 3. Invertir el orden de la lista de palabras
    # El slicing [::-1] es la forma más idiomática y eficiente en Python
    palabras_invertidas = palabras[::-1]
    
    # 4. Unir la lista invertida en una sola cadena
    frase_invertida = " ".join(palabras_invertidas)
    
    print(f"Frase invertida (en mayúsculas):\n{frase_invertida}")

# Ejecución
contar_palabra_clave(texto)
invertir_frase(texto)