
def function(*args):
    """
This function explains positional parameter passing functions
    """
    sum=0
    n=0

    while(n<len(args)):

        sum=sum+args[n]
        n=n+1
    print( type('arg1'))
    print(type('arg2'))
    return sum

totalsum=function(10,20,30,40,50)
print(totalsum)