def revString(s):
    print("entered revstring")
    if s=="":
        print("in if")
        return ""
    restrev =revString(s[1:])
    first = s[0:1]
    print(restrev)
    result=restrev+first
    return result
def main():
    print("in main")
    print(revString("hello"))

if __name__=="__main__":
    main()