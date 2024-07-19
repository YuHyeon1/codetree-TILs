a,b = map(int,input().split())
arr = [[0]*b for _ in range(a)]

for i in range(a):
    k = list(map(int,input().split()))
    for j in range(b):
        arr[i][j] = k[j]
for i in range(a):
    k = list(map(int,input().split()))
    for j in range(b):
        if arr[i][j] == k[j]:
            arr[i][j] = 0
        else:
            arr[i][j] = 1
for i in range(a):
    for j in range(b):
        print(arr[i][j],end=" ")
    print()