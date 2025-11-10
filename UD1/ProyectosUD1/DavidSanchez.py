import math

def calculoAreaTriangulo(h, b):
    return (b * h) / 2

def calcularRadioCirculo(num1, num2):
    # Calculamos el radio como el promedio de los dos números
    radio = (num1 + num2) / 2
    return radio

def esNumeroPar(numero):
    return numero % 2 == 0

def calcularAreaCuadrado(lado):
    return lado ** 2

loginUser = input("Introduzca el usuario ")
loginPass = input("Introduzca la contraseña ")

if loginUser != "Alumno" or loginPass != "1234":
    print("Usuario o contraseña incorrecta")
else:
    print(f"Bienvenido {loginUser}")
    
continuar = True
while continuar:
    print("\nMenú de opciones:")
    print("1. Calcular Area Triangulo")
    print("2. Calcular Radio del Circulo")
    print("3. Verificar Numeros Pares")
    print("4. Calcular Area Cuadrado")
    opcion = input("Seleccione una opción del menú (1-4): ")
    
    match opcion:
        case "1":
            while True:
                try:
                    base = float(input("Introduzca la base del triángulo: "))
                    altura = float(input("Introduzca la altura del triángulo: "))
                    break
                except ValueError:
                    print("Por favor, introduzca números válidos.")
            
            if base <= 0 or altura <= 0:
                print("La base y altura deben ser números positivos.")
                continue
                
            area = calculoAreaTriangulo(altura, base)
            print(f"El área del triángulo es {area:.2f} unidades cuadradas")
                
        case "2":
            while True:
                try:
                    num1 = float(input("Introduzca el primer número: "))
                    num2 = float(input("Introduzca el segundo número: "))
                    break
                except ValueError:
                    print("Por favor, introduzca números válidos.")
            
            radio = calcularRadioCirculo(num1, num2)
            print(f"El radio calculado es {radio:.2f}")
                
        case "3":
            while True:
                try:
                    num = int(input("Introduzca un número para verificar si es par: "))
                    break
                except ValueError:
                    print("Por favor, introduzca un número válido.")
            
            if esNumeroPar(num):
                print(f"{num} es un número par")
            else:
                print(f"{num} es un número impar")
                
        case "4":
            while True:
                try:
                    lado = float(input("Introduzca el lado del cuadrado: "))
                    break
                except ValueError:
                    print("Por favor, introduzca un número válido.")
            
            if lado <= 0:
                print("El lado debe ser un número positivo.")
                continue
                
            area = calcularAreaCuadrado(lado)
            print(f"El área del cuadrado es {area:.2f} unidades cuadradas")
                
        case _:
            print("Opción no válida. Por favor, seleccione una opción entre 1 y 4.")

    continuar = opcion != "4"
