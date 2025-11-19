palabra = input("Intro palabra:")
print(palabra)
invertida = palabra[::-1]
print(invertida)
if palabra == invertida: print("Es palindromo")
else: print("NO Es palindromo")

cadena = " juan.perez@dominio.com "
print(cadena.strip())
print(cadena.upper())
print(cadena.split("@"))

clase = "titulo"
contenido = "Mi Encabezado"
print(f"<p class=\"{clase}\">{contenido}</p>")