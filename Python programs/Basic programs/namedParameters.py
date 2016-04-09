def myfunction(arg1,arg2,arg3,*arg4,**kvargs):
    tot=[]
    sum1=sum2=sum=0
    sum1=arg1+arg2+arg3
    for n in arg4:
        sum2=sum2+n
    for k,v in kvargs.items():
        """
        printstring="{:20}{:10}".format(k,v)
        print(printstring)
        """
        sum=sum+v
    return [sum1,sum2,sum]

totalSum=myfunction(1000,100,10,20,10,30,jan=0,feb=0,mar=0,aug=800,sept=1000,oct=1000,nov=1200,dec=800)
print(totalSum)