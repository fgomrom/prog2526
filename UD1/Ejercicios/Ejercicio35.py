nombre = input("Introduzca nombre:")
CLAVE_CORRECTA = "franfran"
clave = input("Introduzca clave:")
while (len(clave) < 8 or clave != CLAVE_CORRECTA):
    clave = input("Introduzca clave:")
print("Bienvenido!")
