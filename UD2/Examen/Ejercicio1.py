#Ejercicio 1: Gestión de Inventario (Búsqueda y Máximo)
#Este ejercicio requiere búsqueda secuencial y comparación dentro de una matriz.
inventario = [
    [101, 15.50, 45],
    [102, 5.00, 120],
    [103, 30.99, 15],
    [104, 8.75, 70],
    [105, 22.00, 30]
]

# --- 1. Búsqueda por ID ---
def buscar_producto(inventario):
    try:
        id_buscado = int(input("Ingrese el ID del producto a buscar: "))
    except ValueError:
        print("Entrada inválida. Debe ser un número entero.")
        return

    encontrado = False
    
    # Recorrido simple de la matriz
    for producto in inventario:
        id_producto = producto[0]
        precio = producto[1]
        stock = producto[2]
        
        if id_producto == id_buscado:
            print(f"Producto encontrado (ID {id_buscado}):")
            print(f"  Precio: ${precio:.2f}")
            print(f"  Stock: {stock} unidades.")
            encontrado = True
            break
            
    if not encontrado:
        print("ID no encontrado.")

# --- 2. Producto más Caro ---
def encontrar_mas_caro(inventario):
    # Inicialización con el primer elemento para empezar la comparación
    precio_maximo = -1 
    id_producto_caro = None
    
    # Recorrido para encontrar el precio más alto
    for producto in inventario:
        id_actual = producto[0]
        precio_actual = producto[1]
        
        if precio_actual > precio_maximo:
            precio_maximo = precio_actual
            id_producto_caro = id_actual
            
    print(f"\nEl producto con el precio más alto es el ID: {id_producto_caro} (Precio: ${precio_maximo:.2f}).")

# Ejecución
buscar_producto(inventario)
encontrar_mas_caro(inventario)