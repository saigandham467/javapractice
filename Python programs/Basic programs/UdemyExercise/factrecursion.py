print("enter the value")
n=int(input())

def fact(n):
    if(n<0):
        print("wrong")
        exit()
    if n==1 or n==0:
        return 1
    else:
        factr=(fact(n-1))*n
    return factr

m=fact(n)
print(m)

