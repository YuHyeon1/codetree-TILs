arr = list(map(int,input().split()))
for i in range (0,9):
    arr.append(arr[i]+arr[i+1])
    if arr[i+2]>=10:
        arr[i+2]=arr[i+2]%10
for i in range(0,10):
    print(arr[i],end=" ")