def busquedaBinaria (a,objetivo):
    i = len(a)//2
    while a[i] != objetivo:
        if a[i] < objetivo:
            a = a[i:len(a)]
            i = len(a)//2
        elif a[i] > objetivo:
            a = a[0:i]
            i = len(a)//2
        else:
            return(objetivo)
    return i

num = [0,10,20,30,40,50,60,70,80,90]
objetivo = int(input("Introduzca su número objetivo: "))
print(busquedaBinaria(num,objetivo))