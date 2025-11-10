def maximo (t):
    #Inicializar mayor
    valor_maximo = t[0]
    for i in range(len(t)):
        #comparar e con
        if t[i] > valor_maximo:
            valor_maximo = t[i]
    return valor_maximo        

a = [-11,5,3,2,8,1,2,1,10,2,1,2,1,2,1,2,1]
# invocar a la función
num_mayor = maximo(a)
print(num_mayor)