class Person:
    def __init__ (a,name,h,w):
        a.name = name
        a.h = int(h)
        a.w = float(w)
indi = []
for i in range(5):
    a = input().split()
    person = Person(a[0],int(a[1]),float(a[2]))
    indi.append(person)
indi.sort(key=lambda a:a.name)
print("name")
for i in range (5):
    print(f"{indi[i].name} {indi[i].h} {indi[i].w}")
indi.sort(key=lambda a:-a.h)
print()
print("height")
for i in range (5):
    print(f"{indi[i].name} {indi[i].h} {indi[i].w}")