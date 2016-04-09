def charCount(*args):
    D=dict()

    for n in args:
        n=n.upper()
        for k in n:
            if (k in D):
                D[k]=D[k]+1
            else:
                D[k]=1

    return D

output=charCount("Gary","Kris","Cathy","John","Alex")
print(output)