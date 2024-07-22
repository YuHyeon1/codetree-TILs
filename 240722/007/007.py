class Student:
    def __init__ (self, kor, eng, math):
        self.kor = kor
        self.eng = eng
        self.math = math

arr = input().split()
TM=Student(arr[0],arr[1],arr[2])
print(f"secret code : {TM.kor}")
print(f"meeting point : {TM.eng}")
print(f"time : {TM.math}")