cnt = 0
arr = []
a, b = map(int,input().split())
while a>0:
    arr.append(a%4)
    a = a//4
arr.reverse()
for i in range(len(arr)):
    print(arr[i],end="")