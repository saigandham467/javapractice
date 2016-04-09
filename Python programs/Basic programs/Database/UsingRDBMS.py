import sqlite3
db=sqlite3.connect("Student.db")
"""
db.execute("drop table if exists grades")
db.execute("create table grades(id int,name text,score int)")
db.execute("insert into grades(id,name,score) values(101,'john',99)")
db.execute("insert into grades(id,name,score) values(102,'karry',98)")
db.execute("insert into grades(id,name,score) values(103,'kelly',97)")
db.execute("insert into grades(id,name,score) values(104,'sai',100)")
db.execute("insert into grades(id,name,score) values(105,'mayur',100)")
db.commit()
"""
results=db.execute("select * from grades order by id")

for row in results:
    print(row)

print("-" * 50 )
results=db.execute("select * from grades where score=100")
for row in results:
    print(row)

print("-"*50)

results=db.execute("select * from grades where name='sai'")
for row in results:
    print(row)

print("-"*50)

results=db.execute("select name,score from grades order by score ")
for row in results:
    print(row)
db.execute("update grades set score=101 where id=104")
db.commit()
print("-"*50)
results=db.execute("select * from grades order by id")

for row in results:
    print(row)

db.execute("delete from grades where id=101 ")
db.commit()
print("-"*50)
results=db.execute("select * from grades order by id")

for row in results:
    print(row)
