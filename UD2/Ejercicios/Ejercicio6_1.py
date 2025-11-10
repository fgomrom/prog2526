a = []
# Con un if
#for i in range(len(a)):
#    if a[i] % 2 == 0:
#        print(a[i])
#for i in range(1,6):
#    par = 2 * i
#    a.append(par)

for i in range(2,11,2):
    a.append(i)
print(a)

a=[0]*5
j = 0
for i in range(2,11,2):
    a[j] = i
    j = j + 1
print(a)