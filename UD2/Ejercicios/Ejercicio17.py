tareas_dia = ["Revisar Email", "L                           ", "comprar café", "Actualizar reporte", "Planificar reunión"]

# Ordena la lista
#informe_ordenado = sorted(tareas_dia, key=str.lower)  #sorted + key=str.lower ignora mayusculas/minusculas                                                     #sorted Ordena el array sin eliminar el original

# Ordena la lista por su longitud
informe_ordenado = sorted(tareas_dia, key=len)  #sorted + key=len ordena de mas corta a mas larga
print("La nueva lista es:", informe_ordenado)
print("Lista original es:", tareas_dia)
