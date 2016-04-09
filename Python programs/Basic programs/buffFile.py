BUFFSIZE=1024

fpread=open('New Text Document.txt','r')
fpwrite=open('New Text Document2.txt','w')

buffer=fpread.read(BUFFSIZE)
while(len(buffer)):
    fpwrite.write(buffer)
    print('{} byteswritten to {}'.format(len(buffer),'New Text Document2.txt'))
    buffer=fpread.read(BUFFSIZE)

print('Done')