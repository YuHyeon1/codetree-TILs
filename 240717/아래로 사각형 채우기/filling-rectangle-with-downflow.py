cnt = 1
a = int(input())
arr = [[0]*a for _ in range(a)]
for i in range (0,a):
    for j in range(0,a):
        arr[i][j] = cnt
        cnt+=1
for i in range (0,a):
    for j in range(0,a):
        print(arr[j][i],end=" ")
    print()