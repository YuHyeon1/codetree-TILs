arr = list(map(int,input().split()))
for i in range(0,len(arr)):
    if arr[i]==0:
        for j in range(0,len(arr)-i):
            arr.pop()
        break
print(sum(arr))