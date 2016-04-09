def myfilter(fn,c):
    newc=[]
    for i in c:
        t=fn(i)
        if(t):
            newc.append(i)
    return newc

c=[1,2,3,4,5,6,7,8,9,11,12,13]
con=myfilter(lambda x:x>10,c)
print(con)