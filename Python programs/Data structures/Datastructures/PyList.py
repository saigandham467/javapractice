class PyList:
    def __init__(self,contents=[],size=10):
        self.items=[None]*size
        self.numItems=0
        self.size=size
        for e in contents:
            self.append(e)

    def __getitem__(self, index):
        if index >= 0 and index < self.numItems:
            return self.items[index]

    def __setitem__(self, index, value):
        if index >=0 and index < self.numItems:
            self.items[index]=value
            return
        raise IndexError("pylist assignment index out of range")

    def __add__(self, other):
        result = PyList(size=self.numItems+other.numItems)

        for i in range(self.numItems):
            result.append(self.items[i])

        return result

    def __makeroom(self):
        newlen = (self.size//4)+self.size +1
        newlst=[None]*newlen
        for i in range(self.numItems):
            newlst[i]=self.items[i]
        self.items = newlst
        self.size=newlen

    def append(self,item):
        if self.numItems==self.size:
            self.__makeroom()

        self.items[self.numItems]=item
        self.numItems+=1

    def insert(self,i,e):
        if self.numItems ==self.size:
            self.__makeroom()

        if i < self.numItems:
            for j in range(self.numItems-1,i-1,-1):
                self.items[j+1]=self.items[j]
            self.items[i]=e
            self.numItems +=1
        else:
            self.append(e)

    def __delitem__(self, key):
        for i in range(key, self.numItems-1):
            self.items[i]=self.items[i+1]
        self.numItems-=1

    def __eq__(self,other):
        if type(other)!=type(self):
            return False
        if self.numItems!=other.numItems:
            return False
        for i in range(self.numItems):
            if self.items[i]!=other.items[i]:
                return False
        return True
    def __iter__(self):
        for i in range(self.numItems):
            yield self.items[i]

    def __len__(self):
        return self.numItems
    def __contains__(self, item):
        for i in range(self.numItems):
            if self.items[i]==item:
                return True
        return False
    def _str_(self):
        s = "["
        for i in range(self.numItems):
            s = s + repr(self.items)
            if i < self.numItems-1:
                s =s+","
        s = s+"]"
        return s
    def __repr__(self):
        s = "PyList(["
        for i in range(self.numItems):
            s=s+repr(self.items[i])
            if i < self.numItems-1:
                s=s+","
        s=s+"])"
        return s