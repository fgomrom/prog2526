import math

# Variables globales
num1 = 0
num2 = 0
resultado = 0.0

# funcion para mostrar el menu
def mostrar_menu():
    print("================================================")
    print("               CALCULADORA AVANZADA             ")
    print("================================================")

    print("\n[OPERACIONES BASICAS]")
    print("1. Sumar")
    print("2. Restar")
    print("3. Multiplicar")
    print("4. Dividir")

    print("\n[OPERACIONES INTERMEDIAS]")
    print("5. Raiz Cuadrada")
    print("6. Minimo Comun Divisor")
    print("7. Minimo Comun Multiplo")

    print("\n[OPERACIONES AVANZADAS]")
    print("8. Calculo area Triangulo")
    print("9. Calculo area Circulo")
    print("10. Calculo area Rectangulo")
    print("11. Calcular si es primo")
    print("================================================")
    print("Introduzca numero de operacion a realizar o introduzca 0 para salir:")

# Funcion para pedir al usuario dos numero para operaciones que lo requieran
def pedir_numeros():
    global num1, num2
    num1 = int(input("Introduzca el primer numero: "))
    num2 = int(input("Introduzca el segundo numero: "))

# Funcion para pedir al usuario un numero para las operaciones que lo requieran
def pedir_un_numero():
    global num1
    num1 = int(input("Introduzca un numero: "))

# Funcion para realizar la suma de dos numeros
def realizar_suma():
    global resultado
    resultado = num1 + num2

# Funcion para realizar la resta de dos numeros
def realizar_resta():
    global resultado
    resultado = num1 - num2

# Funcion para realizar la multiplicacion de un numero por otro
def realizar_multiplicacion():
    global resultado
    resultado = num1 * num2

# Funcion para realizar la division de un numero
def realizar_division():
    global resultado
    if num2 == 0:
        print("Error: No se puede dividir por cero.")
        resultado = 0
    else:
        resultado = num1 / num2
        print("El resto de la operacion es:", num1 % num2)

# Funcion para sacar la raiz cuadrada de un numero
def realizar_raiz_cuadrada():
    global resultado
    resultado = math.sqrt(num1)
    print("La raiz cuadrada es:", resultado)

# Funcion para calcular el maximo comun divisor de un numero
def mcd():
    global resultado
    a, b = num1, num2
    while b != 0:
        a, b = b, a % b
    resultado = a
    print("El MCD es:", str(resultado))

# Funcion para calcular el minimo comun multiplo de un numero
def mcm():
    global resultado
    resultado = (num1 * num2) // calcular_mcd(num1, num2)
    print("El MCM es:", resultado)

# Funcion para calcular el maximo cumun divisior de un numero
def calcular_mcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

# Funcion para calcular el area de un triangulo teniendo dos de sus valores
def calcular_area_triangulo():
    global resultado
    resultado = (num1 * num2) / 2.0

# Funcion para calcular el area de un circulo utilizando la funcion pi (3,14...)
def calcular_area_circulo():
    global resultado
    resultado = math.pi * num1 * num1

# Funcion para calcular el area de un rectagulo teniendo dos de sus valores (Base * altura)
def calcular_area_rectangulo():
    global resultado
    resultado = num1 * num2

# Funcion para calcular si un numero es primo utilizando la raiz cuadrada
def calcular_primo():
    # Descartamos que el número sea menor que 2, porque los números primos son mayores o iguales a 2
    if num1 < 2:
        print(f"El numero {num1} no es un numero primo.")  # Informamos que no es primo
        return False  # Retornamos False porque no es primo

    # Recorremos desde 2 hasta la raíz cuadrada de num1 (redondeada hacia abajo) + 1
    # Solo es necesario revisar hasta la raíz cuadrada para verificar si es primo
    for m in range(2, int(math.sqrt(num1)) + 1):
        # Si num1 es divisible por cualquier número m en ese rango, entonces no es primo
        if num1 % m == 0:
            print(f"El numero {num1} no es un numero primo.")  # Informamos que no es primo
            return False  # Retornamos False porque no es primo

    # Si no encontramos ningún divisor, entonces num1 es primo
    print(f"El numero {num1} es un numero primo.")  # Informamos que es primo
    return True  # Retornamos True porque es primo

# Funcion para mostrar el menu repetitivamente y
def main():
    while True:
        # Bucle para mostrar el menu hasta que el usuario pulse 0
        mostrar_menu()
        # Excepcion para cuando el usuario ingrese un valor invalido este vuelva a preguntar
        try:
            option = int(input())
        except ValueError:
            print("Entrada invalida. Por favor ingrese un numero.")
            continue

        if option == 0:
            print("Has salido del menu.")
            break

        if option not in [5, 7, 11]:
            pedir_numeros()
        else:
            pedir_un_numero()

        if option == 1:
            realizar_suma()
        elif option == 2:
            realizar_resta()
        elif option == 3:
            realizar_multiplicacion()
        elif option == 4:
            realizar_division()
        elif option == 5:
            realizar_raiz_cuadrada()
        elif option == 6:
            mcd()
        elif option == 7:
            mcm()
        elif option == 8:
            calcular_area_triangulo()
        elif option == 9:
            calcular_area_circulo()
        elif option == 10:
            calcular_area_rectangulo()
        elif option == 11:
            calcular_primo()
        else:
            print("Opcion no valida.")

        if option not in [5, 6, 11]:
            print("El resultado es:", resultado)


if __name__ == "__main__":
    main()
