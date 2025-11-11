import Ejercicio16
import Ejercicio15

numeros = [0,10,20,30,40,50,60,70,80,90]
eleccion = 60
print("Búsqueda Lineal")
resultado=Ejercicio15.busquedaLineal(numeros, eleccion)
if resultado != -1:
    print("El numero",eleccion,"se encuentra en la posicion",(resultado))
else:
    print("Ese numero no se encuentra.")
print("Búsqueda Binaria")
resultado=Ejercicio16.busquedaBinaria(numeros, eleccion)
if resultado != -1:
    print("El numero",eleccion,"se encuentra en la posicion",(resultado))
else:
    print("Ese numero no se encuentra.")