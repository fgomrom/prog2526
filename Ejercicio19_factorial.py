# Factorial de un número natural
n = int(input("Introduzca un número natural: "))
factorial = 1
for i in range (n):
       factorial *= n - i
print (f"El factorial de {n} es: {factorial}")
