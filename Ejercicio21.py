#Ejercicio 21
n = int(input("Introduzca hasta donde contar:"))
i = 1
while True: 
    if i < n: # Hacer mientras se cumple la condición
        print(i,end=',')
        i = i + 1
    else:
        break
print(i,end='\n')
