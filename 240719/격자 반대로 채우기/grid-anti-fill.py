a = int(input())
cnt = a**2
arr = [[0]*a for _ in range(a)]
val = a%2
if val>0:
    for i in range (a):
        for j in range (a):
            if i%2==0:
                arr[j][i] = cnt
                cnt-=1
            else:
                arr[a-j-1][i] = cnt
                cnt-=1
else:
    for i in range(a):
        for j in range(a):
            if i%2==0:
                arr[a-j-1][i] = cnt
                cnt-=1
            else:
                arr[j][i] = cnt
                cnt-=1
for i in range (a):
    for j in range(a):
        print(arr[i][j],end=" ")
    print()