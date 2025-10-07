# Hacer mientras
n = int(input("introduce un numero: "))
i = 1
while True:
    if i < n:
        print(i,end=',')
    elif i == n:
        print(i)
    else:
        break
    i += 1

