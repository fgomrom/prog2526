import re

texto = "Nació en 1985 y el libro es de 2023."
patron = r'\d{4}' # Busca exactamente 4 dígitos
print(re.search(patron, texto))
# Salida: ['1985', '2023']

texto = "animal, árbol, amigo, oso."
patron = r'a\w*o' # 'a' + 0 o más letras/números + 'o'
print(re.findall(patron, texto))
# Salida: ['amigo']
