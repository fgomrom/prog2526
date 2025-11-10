#Cuenta cuántas 'a' hay en una frase
# Definir función
def cuentaA(texto):
    cuenta = texto.count("a") + texto.count("A")
    return cuenta
# Definir funcion con bucle
def cuentaABucle(texto):
    cuenta = 0
    for letra in texto:
        cuenta += 1
# Definir función cuenta y reemplaza
def cuentaYReemplazaA(texto):
    cuenta = texto.count("a") + texto.count("A")
    print("Cuenta:",cuenta)
    nuevoTexto = texto.replace("a","x").replace("A","X")
    return nuevoTexto

# Funcion que cuente todas las vocales y las reemplace por X
def cuentaYReemplaza(texto):
    texto = texto.lower().replace("a","x")\
    .replace("e","x")\
    .replace("i","x")\
    .replace("o","x")\
    .replace("u","x")
    print(texto)
    return texto.count("x") #restar cuenta inicial

# Invocar función
frase = "Hola y Adios"
#print(cuentaA(frase))
print(cuentaYReemplaza(frase))


