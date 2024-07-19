min = 0
max = 0
arr = list(map(int,input().split()))
for i in range (len(arr)):
    if arr[i]==999:
        for j in range (len(arr)-i):
            arr.pop()
        break
    elif arr[i]==-999:
        for j in range (len(arr)-i):
            arr.pop()
        break
for i in range (len(arr)):
    if max<arr[i]:
        max=arr[i]
min = max
for i in range(len(arr)):
    if min>arr[i]:
        min=arr[i]
print(max,min)