def myreduce(fn,c):
    redval=0
    for i in c:
        redval=fn(redval,i)
    return redval

c=[1,2,3,4,5]
con=myreduce(lambda x,y:x+y ,c)
print(con)


