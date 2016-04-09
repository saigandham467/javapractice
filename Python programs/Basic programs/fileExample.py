fp=open("New Text Document.txt",'r')
n=0
for line in fp:
    n=n+1
    print(n,line,end='')

fp.close()
print()
print('Read {} lines.'.format(n))
