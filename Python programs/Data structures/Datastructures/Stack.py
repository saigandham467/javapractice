class Stack:
    def __init__(self):
        self.items=[]

    def isempty(self):
        return self.items==[]

    def push(self, item):
        self.items.append(item)

    def pop(self):
        return self.items.pop()

    def size(self):
        return len(self.items)


def main():

    st = Stack()

    print(st.isempty())
    print(st.push(5))
    print(st.isempty())
    print(st.pop())
    print(st.isempty())
    print(st.size())

if __name__ == '__main__':
    main()





