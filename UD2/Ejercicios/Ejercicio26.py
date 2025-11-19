# Variables del Producto
producto = "Espresso Doble"
precio_unitario = 3.50
# Variables de la Transacción
cantidad = 3
tasa_iva = 0.16 # 16% de IVA
# Variables del Cliente
cliente_nombre = "Ana María López"
id_transaccion = "CAF-2025-472"

# Encabezado:
encabezado = f"--- Recibo de Transacción | ID: {id_transaccion} ---\nCliente: {cliente_nombre}\n"
print(encabezado)

# Intermedio:
subtotal = cantidad * precio_unitario
print(f"Producto: {producto} ({cantidad} unidades)")
print(f"Subtotal (sin IVA): ${subtotal:.2f}")

# Pie:
total_iva = subtotal * tasa_iva
total_final = subtotal + total_iva

print(f"IVA ({tasa_iva * 100:.0f}%): ${total_iva:.2f}") 
print(f"=====================================")
print(f"TOTAL A PAGAR: €{total_final:.2f} \u270D")
