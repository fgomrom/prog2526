#Ejercicio 22
n = int(input("Introduzca hasta donde contar:"))
i = 1
while True:
    print(i,end=',')
    i = i + 1
    if i >= n: # Repite hasta que se cumple la condición
        break 
print(i,end='\n')
