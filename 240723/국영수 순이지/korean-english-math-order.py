class Student:
    def __init__ (a,name,kor,eng,math):
        a.name = name
        a.kor = int(kor)
        a.eng = int(eng)
        a.math = int(math)
a = int(input())
stud = []
for i in range(a):
    arr = input().split()
    student = Student(arr[0],int(arr[1]),int(arr[2]),int(arr[3]))
    stud.append(student)
stud.sort(key = lambda b:(b.kor,b.eng,b.math),reverse=True)
for i in range(a):
    print(stud[i].name,stud[i].kor,stud[i].eng,stud[i].math)