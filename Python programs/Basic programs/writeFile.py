fpread=open('New Text Document.txt','r')

fpwrite=open('New Text Document1.txt','w')

for line in fpread:
    print(line,file=fpwrite,end='')
print('Done')


