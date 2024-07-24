maze = [[0]*201 for _ in range (201)]
a = int(input())
for i in range(a):
    x1, y1, x2, y2 = map(int,input().split())
    for j in range(x1,x2):
        for h in range(y1,y2):
            maze[j+100][h+100] = 1
cnt = 0
for i in range(201):
    for j in range(201):
        if maze[i][j] ==1:
            cnt+=1
print(cnt)