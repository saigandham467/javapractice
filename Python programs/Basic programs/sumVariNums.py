def sumVariNums(*args):
    sumList = []
    for n in args:
        sum=0
        for i in n:
            sum =sum+i
        sumList.append(sum)
    return sumList


totalsum = sumVariNums([1, 2, 3], [4, 5, 6], [7, 8, 9])
print(totalsum)
