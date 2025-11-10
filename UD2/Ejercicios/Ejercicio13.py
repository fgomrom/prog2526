def esPrimo(numero):
    if numero <= 1:
        return False
    if numero == 2:
        return True
    i = 2
    while i < numero:
        if numero % i == 0:
            return False
        i += 1
    return True

a = [1,2,3,4,5,6,7,8,9,10]
b = []
i = 0
while i < len(a):
    if esPrimo(a[i]):
        b.append(a.pop(i))
    else:
        i = i + 1
print(a)
print(b)

