dy,dx = [1,0,-1,0],[0,1,0,-1]
n,m = map(int,input().split())
arr = [[0]*m for _ in range (n)]
x, y =0,0
cnt = 2
drct = 0
arr[0][0] = 1
while cnt<=n*m:
    a = x+dx[drct]
    b = y+dy[drct]
    if 0<=a<n and 0<=b<m and arr[a][b] == 0:
        arr[a][b] = cnt
        cnt+=1
        x = a
        y = b
    else:
        drct = (drct+1)%4
for i in range(n):
    for j in range(m):
        print(arr[i][j],end=" ")
    print()