class Person:
    def __init__ (a,name,h,w):
        a.name = name
        a.h = int(h)
        a.w = int(w)
a = int(input())
man = []
for i in range(a):
    arr = input().split()
    person = Person(arr[0],int(arr[1]),int(arr[2]))
    man.append(person)
man.sort(key=lambda b:(b.h,-b.w))
for i in range(a):
    print(f"{man[i].name} {man[i].h} {man[i].w}")