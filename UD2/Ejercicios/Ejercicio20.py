original = [1,2,3,4,5]
copia1 = original.copy()
copia2 = original[:]
copia3 = []

for x in original:
    copia3.append(x)
#for i in range(len(original)):
#    copia3.append(orginal[i])
copia4 = original
copia4.remove(5)



print(copia1)
print(copia2)
print(copia3)
print(original)
print(copia4)
copia3.remove(1)
print(copia3)