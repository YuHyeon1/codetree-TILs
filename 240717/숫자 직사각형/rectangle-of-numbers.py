cnt = 1
a,b = map(int,input().split())
arr = [[0]*b for _ in range(a)]
for i in range(0,a):
    for j in range(0,b):
        arr[i][j] = cnt
        cnt+=1
for i in range(0,a):
    for j in range(0,b):
        print(arr[i][j],end=" ")
    print()