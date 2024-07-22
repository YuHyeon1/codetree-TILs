class Student:
    def __init__ (self, kor, eng):
        self.kor = kor
        self.eng = eng
        

arr = input().split()
TM=Student(arr[0],arr[1])
print(f"user codetree lv {10}")
print(f"user {TM.kor} lv {TM.eng}")