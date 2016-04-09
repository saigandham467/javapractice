class Node(object):
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next

    def setNext(self, new_next):
        next = new_next

    def getNext(self):
        return self.next

    def getData(self):
        return self.data


class Linkedlist(object):
    def __init__(self, newobj=None):
        self.head = Node(newobj)
        self.head1 = self.head

    def insert(self):
        data=input("enter item to insert")
        if self.head==None:
            Linkedlist(data)
        else:
            new_node = Node(data)
            self.head.setNext(new_node)

    def size(self):
        current = self.head1
        count = 0
        while current:
            count = count + 1
            current = current.getNext
        return count

    def search(self):
        data=print("enter the item to search")
        current = self.head1
        found = False
        while current and found is False:
            if current.getData == data:
                found = True
            else:
                current = current.getNext

        if current is None:
            raise ValueError("Data not in list")
        return current

def main():
    ll =Linkedlist()
    print("in main")

    key = Linkedlist()
    print("in main")

    while(True):
        print("select your choice")
        print("1: to insert")
        print("2: to know size")
        print("3: to search")
        key=input("enter the input")
        switch ={
            "1":ll.insert,
            "2":ll.size,
            "3":ll.search,
            }
        print(int(key))
        somevalue=switch[key]()

        print(somevalue)

if __name__== "__main__":
        main()


