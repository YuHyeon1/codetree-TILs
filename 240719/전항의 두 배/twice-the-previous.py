arr = list(map(int,input().split()))
for i in range(9):
    arr.append(arr[i]*2+arr[i+1])
for i in range(10):
    print(arr[i],end=" ")