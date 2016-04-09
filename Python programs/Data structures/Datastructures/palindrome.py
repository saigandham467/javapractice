class Deque:

    def __init__(self):
        self.items=[]

    def isempty(self):
        print("in isempty")
        return self.items==[]

    def addfront(self):
        print("in add front")
        item=input("enter the item")
        self.items.insert(0,item)
        return "value added sucessfully"

    def addrear(self):
        print("in addrear")
        item=input("enter the item")
        self.items.append(item)
        return "value added sucessfully"

    def deletefront(self):
        print("in del front")
        return self.items.pop(0)

    def deleterear(self):
        print("in del rear")
        return self.items.pop()

    def size(self):
        print("in size")
        return len(self.items)

def main():
    dq=Deque()

    while True:
        print("choose an option")
        print("1 is empty")
        print("2 add front")
        print("3 add rear")
        print("4 delete front")
        print("5 delete rear")
        print("6 size")
        number = input("enter number")
        switch={
            '1' : dq.isempty,
            '2' : dq.addfront,
            '3' : dq.addrear,
            '4' : dq.deletefront,
            '5' : dq.deleterear,
            '6' : dq.size,

        }
        print(number)
        somevalue=switch[number]()
        print(somevalue)

if __name__=="__main__":
    main()









