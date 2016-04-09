def sumFirstN(n):
    return n * (n+1)/2
def main():
    x=int(input("enter a non negative integer"))
    s=sumFirstN(x)
    print("the sum of the first %d numbers is : %d"%(x,s))
if __name__=="__main__":
    main()