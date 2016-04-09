f=open('New Text Document.txt','r')
fpos=f.tell()
print('fpos=',fpos)

Totallines=f.read()
print(len(Totallines))
print(Totallines)

fpos=f.tell()
print('fpos=',fpos)

f.seek(100)
fpos=f.tell()
print('fpos=',fpos)

print('-'*50)
data=f.read()
print(len(data))
print(data)
fpos=f.tell()
print('fpos=',fpos)




