def mymap(fn,c):
    newc=[]
    for i in c:
        newc.append(fn(i))
    return newc

A=[1,2,3,4,5]
con=mymap(lambda x:x+2,A)
print(con)

