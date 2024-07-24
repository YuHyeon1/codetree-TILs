maze = [[0]*2001 for _ in range(2001)]
for i in range(2):
    x1, y1, x2, y2 = map(int,input().split())
    for j in range(x1,x2):
        for k in range(y1,y2):
            maze[j+1000][k+1000] = 1
x1, y1, x2, y2 = map(int,input().split())
for i in range(x1,x2):
    for j in range(y1,y2):
        maze[i+1000][j+1000] = 0
cnt = 0
for i in range(2001):
    for j in range(2001):
        if maze[i][j]==1:
            cnt+=1
print(cnt)