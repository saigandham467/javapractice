print("list of km")
print("enter number of values in list")
n=int(input())
print("enter the values")
x=[]
for i in range(n):
    x.append(int(input()))
print(x)

for i in x:
    m=i*0.621
    print("{} km is equal to {} miles".format(i,m))


