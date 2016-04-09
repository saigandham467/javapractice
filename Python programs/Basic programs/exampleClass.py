class Person:
    count=0
    def __init__(self, name, age):
        self.name=name
        self.age=age
        Person.count =Person.count+1

    def changeAge(self,name,age):
        self.name=name
        self.age=age


    def getCount(self):
        return self.count


    def __str__(self):
        return self.name+ '--' + str(self.age)

#-----------------------------------------------------------
class Student(Person):
    def __init__(self,name,age,grade,gpa):
        Person.__init__(self,name,age)
        self.grade=grade
        self.gpa=gpa

    def changeGpa(self,gpa):
        self.gpa=gpa

    def __str__(self):
        return Person.__str__(self)+'--'+str(self.grade)+'--'+str(self.gpa)
'''
p1=Student('sai',24,'A-',3.52)
print(p1)
print(p1.getCount())

p2=Student('Mohan',23,'B+',3.3)
print(p2)
print(p2.getCount())

p2.changeGpa(3.4)
print(p2)
print(p2.getCount())

p1.changeAge('sai',25)
print(p1)
print(p1.getCount())

'''