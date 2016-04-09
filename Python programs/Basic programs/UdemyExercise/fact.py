print("enter n")
n=int(input())


if (n>0):
    def factr(n):
        fact=1
        for i in range(1,n+1):
            fact=fact*i
        return fact
else:
    print("wrong input")
    exit()
m=factr(n)
print(m)