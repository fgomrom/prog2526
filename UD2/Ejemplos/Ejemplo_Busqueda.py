participantes = ["Ana", "Luis", "Marta", "Pedro", "Julia"]

# Verificar si "Carlos" está en la lista
if "Carlos" in participantes:
    print("Carlos está participando.")
else:
    print("Carlos NO está en la lista de participantes.")

# Encontrar la posición de "Marta"
try:
    posicion_marta = participantes.index("Marta")
    print(f"Marta se encuentra en la posición: {posicion_marta}")
except ValueError:
    print("Marta no fue encontrada.")