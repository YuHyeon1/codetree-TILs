class Student:
    def __init__ (self, name,score):
        self.name = name
        self.score = int(score)
Students = []
for i in range (5):
    arr = input().split()
    student = Student(arr[0],arr[1])
    Students.append(student)
Students.sort(key = lambda student:student.score)
print(Students[0].name,Students[0].score)