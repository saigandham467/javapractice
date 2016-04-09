from sys import argv
script, filename = argv
txt = open(filename)

print(" here is your file %s: "%filename)
input("number")

print(txt.read())
txt.close()
print("type file name again")
file_again=input('>')
txt_again=open(file_again)
print(txt_again.read())
txt_again.close()