import re

data = """
Usuario: perez.juan
Email de contacto: juan.perez@dominio.com
Fecha de acceso: 15-09-2023
Código de cliente: ABC123456
Teléfono de emergencia: 601 234 567
Archivos encontrados: a_1.txt, b_22.py, c_333.pdf, d_4444.jpg
"""
# Apartado A
print(re.findall(r'\w+@\w+\.\w+', data))
# Apartado B
print(re.search(r'\d{2}-\d{2}-\d{4}', data))
# Apartado C
print(re.findall(r'[A-Z]{3}\d{6}', data))
# Apartado D
print(re.findall(r'\w+\.py', data))
