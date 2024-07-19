cnt=0
a,b = map(int,input().split())
arr = [[0]*b for _ in range(a)]
for i in range (b):
    if i%2==0:
        for j in range (a):
            arr[j][i] = cnt
            cnt+=1
    else:
        for j in range (a-1,-1,-1):
            arr[j][i] = cnt
            cnt+=1
for i in range (a):
    for j in range (b):
        print(arr[i][j],end=" ")
    print()