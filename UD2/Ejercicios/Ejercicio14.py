inventario = ["Manzanas", "Plátanos", "Naranjas", "Peras"]

# Añadir uvas y kiwis
inventario.append("uvas")
inventario.append("kiwis")

# Unir la caja de molones
melones = ["melón1", "melón2"]
inventario.extend(melones)

# Insertar platanos frescos
inventario.insert(2, "platanos frescos")

# Vender melones
producto_vendido = inventario.pop(-1)

# Eliminar peras
inventario.remove("Peras")

# Recortar 4 primeros
emergencia = inventario[0:4]

for e in emergencia:
    print(e)
    
print(inventario)
print(producto_vendido)