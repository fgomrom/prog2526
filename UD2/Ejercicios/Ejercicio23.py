p = [[5.0,10.5],[8.2,15.0],[1.5,3.0]]
suma = 0
for i in range(len(p)):
    for j in range(len(p[0])):
        if j == 1:
            suma += p[i][j]
print(f"La suma es:{suma}")

        
        