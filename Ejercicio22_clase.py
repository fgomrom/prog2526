n = int(input("introduce un numero: "))
i = 1
while True:
    if i > n:
        break
    elif i == n:
        print(i)
    else:
        print(i,end=',')
    i += 1
