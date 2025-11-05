a = [1,2,3,4,5,6,7,8,9,10]
for e in a:
    if e % 2 == 0:
        a.remove(e)
print(a)