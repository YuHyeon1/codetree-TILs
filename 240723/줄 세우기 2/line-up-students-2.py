class Student:
    def __init__ (a,h,w,n):
        a.h = int(h)
        a.w = int(w)
        a.n = int(n)
a = int(input())
stud = []
for i in range(a):
    arr = list(map(int,input().split()))
    student = Student(arr[0],arr[1],i+1)
    stud.append(student)
stud.sort(key = lambda a:(a.h,-a.w))
for i in range (a):
    print(stud[i].h, stud[i].w,stud[i].n)