def revList(lst):
    if lst ==[]:
        return []
    print("-"*20)
    print("lst[1:]")
    print(lst[1:])
    print("-"*20)
    restrev = revList(lst[1:])
    print("-"*20)
    print("restrev")
    print(restrev)
    print("-"*20)
    first = lst[0:1]
    print("-"*20)
    print("first")
    print(first)
    print("-"*20)

    result = restrev + first
    print("-"*20)
    print("result")
    print(result)
    print("-"*20)
    return result
def main():
    print(revList([1,2,3,4]))

if __name__=="__main__":
    main()
