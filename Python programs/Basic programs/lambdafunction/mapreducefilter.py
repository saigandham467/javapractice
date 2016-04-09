c=range(20)
c=list(c)
fn=lambda x:x*2
print(list(map(fn,c)))

print('-'*100)

fn=lambda x: x+2 if x%2 else x
print(list(map(fn,c)))

print('-'*100)

c="hello"
fn=lambda s:s.upper()
print(list(map(fn,c)))

print('-'*100)
c="python programming is fun".split()
fn=lambda s:s.upper()
print(list(map(fn,c)))

print('-'*100)
c="python programming is fun".split()
fn=lambda s:len(s)
print(list(map(fn,c)))
import functools


print('-'*100)
c=range(10)
c=list(c)
fn=lambda x,y:x if x>y else y
print(functools.reduce(fn,c))

print('-'*100)
c=range(10)

fn=lambda x:x if x>5 else 0
print(list(filter(fn,c)))
print('-'*100)
print(list(map(fn,c)))



