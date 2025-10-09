# Nombre de usuario válido establecido en el código
usuario_correcto = "Fran"

# Pedir al usuario que introduzca su nombre
nombre = input("Introduce tu nombre de usuario: ")

# Comprobar si coincide con el nombre correcto
if nombre == usuario_correcto:
    print("¡Bienvenido", nombre, "!")
else:
    print("Usuario no reconocido.")
