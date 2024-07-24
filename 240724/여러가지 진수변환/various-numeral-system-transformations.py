arr = []
a, b = map(int,input().split())
if a=0:
    print(0)
while a>0:
    arr.append(a%b)
    a = a//b
arr.reverse()
for i in range(len(arr)):
    print(arr[i],end="")