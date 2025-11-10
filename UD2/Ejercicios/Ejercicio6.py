cantidad = int(input("¿Cuantos numeros deseas introducir?: "))

numero = [0] * cantidad

for i in range(cantidad):
    numero[i] = int(input(f"Introduzca el numero {i+1}: "))

print("\nLos numeros en orden inverso son: ")
#for i in range(len(numero) - 1,-1,-1):
#    print(numero[i])
    
i = len(numero) - 1
while i >= 0:
    print(numero[i])
    i = i - 1




