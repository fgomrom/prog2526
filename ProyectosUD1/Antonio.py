def fahrenheit(c):
    f = (c * 9/5) + 32
    return print(f"{f} fahrenheit")

def kelvin(c):
    k = c + 273
    return print(f"{k} kelvin")

def kilometros(m):
    km = m * 1000
    return print(f"{km} km")

def centimetros(m):
    cm = m / 100
    return print(f"{cm} cm")

def millas(m):
    mll = m / 1609
    return print(f"{mll} millas")

def gramos(kg):
    g = kg / 1000
    return print(f"{g} gramos")

def tonelada(kg):
    t = kg * 1000
    return print(f"{t} toneladas")

def libras(kg):
    l = kg * 2.205
    return print(f"{l} libras")

menu = int(input("Escoja un tipo de medición:"
                 " 1. Distancia"
                 " 2. Temperatura"
                 " 3. Masa "))

if menu == 1:
    menud= int(input("Escoja una una medida:"
                 " 1. Kilometro"
                 " 2. Centimetro"
                 " 3. Millas "))
    m = float(input("Intrdoduzca la distancia en metros: "))

    if  menud == 1:
        kilometros(m)
    elif menud == 2:
        centimetros(m)
    elif menud == 3:
        millas(m)

elif menu == 2:
        menut = int(input("Escoja una conversión:"
                 " 1. Kelvin"
                 " 2. Fahrenheint "))
        c = float(input("Intrdoduzca la temperatura en celcius: "))

        if menut == 1:
            kelvin(c)
        elif menut == 2:
            fahrenheit(c)

elif menu == 3:
        menum= int(input("Escoja una una masa:"
                 " 1. Tonelada"
                 " 2. Gramo"
                 " 3. Libras "))
        kg = float(input("Intrdoduzca la masa en kilogramos: "))

        if menum == 1:
            tonelada(kg)
        elif menum == 2:
            gramos(kg)
        elif menum == 3:
            libras(kg)
