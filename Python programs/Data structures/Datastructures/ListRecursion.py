def revList(lst):
    accumulator = []
    for x in lst:
        print(x)
        accumulator =[x]+accumulator
    return accumulator
def main():
    print(revList([1,2,3,4,5]))

if __name__=="__main__":
    main()