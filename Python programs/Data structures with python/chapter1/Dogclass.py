class Dog:
        def __init__(self,name,month,day,year,speaktext):
            self.name=name
            self.month=month
            self.day=day
            self.year=year
            self.speaktext=speaktext
        def speak(self):
            return self.speaktext
        def getName(self):
            return self.name
        def birthdate(self):
            return str(self.month)+"/"+str(self.day)+"/"+ str(self.year)
        def changeBark(self,bark):
            self.speaktext=bark

        def __add__(self, otherDog):
            return Dog("Puppy of" + self.name +"and"+ otherDog.name,self.month,self.day,self.year+1,self.speaktext+otherDog.speaktext)

def main():
        print('sai')
        boyDog = Dog("mesa",5,15,2004,"woooof")
        girlDog= Dog("sequoia",5,6,2004,"barkbark")
        print(boyDog.speak())
        print(girlDog.speak())
        print(boyDog.birthdate())
        print(girlDog.birthdate())
        boyDog.changeBark("woofywoofy")
        print(boyDog.speak())
        puppy=boyDog+girlDog
        print(puppy.speak())
        print(puppy.getName())
        print(puppy.birthdate())

if __name__ == "__main__":
        main()