#prime numbers between 1 to 1000
cnt2=0
for i in range(2,1001):
    cnt=0

    for j in range(1,i):
        if i%j==0:
         cnt=cnt+1

    if cnt==1:
        print("{:>3}".format(str(i)),end=' ')
        cnt2=cnt2+1
        if cnt2%10==0:
            print(" ")
    else :
        continue