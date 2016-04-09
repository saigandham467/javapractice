import sys
class Queue:

    def __init__(self):
        self.items=[]

    def isempty(self):
        return self.items==[]

    def insert(self):
        y=input("enter item value")
        self.items.append(y)

    def dequeue(self):
        return self.items.pop(0)

    def size(self):
        return len(self.items)



def main():
    obj=Queue()
    print(obj.isempty())
    print(obj.insert())
    print(obj.dequeue())
    print(obj.size())


if __name__=='__main__':
    main()