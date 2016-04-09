def myRange(args1,args2,args3):
    addList=[]
    while(args1<args2):
        addList.append(args1)
        args1=args1+args3
    return addList

output=myRange(5,100,7)
print(output)
