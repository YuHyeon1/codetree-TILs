class mate:
    def __init__ (a,name,height,weight):
        a.name = name
        a.height = int(height)
        a.weight = int(weight)
a = int(input())
stud = []
for i in range(a):
    arr = input().split()
    student = mate(arr[0],int(arr[1]),int(arr[2]))
    stud.append(student)
stud.sort(key=lambda b:b.height)
for i in range(len(stud)):
    print(stud[i].name,stud[i].height,stud[i].weight)