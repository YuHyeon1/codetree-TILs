min=100
a = int(input())
arr = list(map(int,input().split()))
for i in range(a):
    for j in range(a):
        if arr[i]>arr[j]:
            if arr[i]-arr[j]<min:
                min = arr[i]-arr[j]
        if arr[j]>arr[i]:
            if arr[j]-arr[i]<min:
                min = arr[j]-arr[i]
print(min)