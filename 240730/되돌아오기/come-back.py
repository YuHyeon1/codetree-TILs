n = int(input())
dx, dy=[1,0,-1,0],[0,-1,0,1]
d = {
    'N' : 3,
    'S' : 1,
    'E' : 0,
    'W' : 2
}
t=0
x,y=0,0
for i in range(n):
    a = input().split()
    dd = d[a[0]]
    for j in range(int(a[1])):
        x += dx[dd]
        y += dy[dd]
        t+=1
        if x == 0 and y==0:
            break
    if x==0 and y==0:
        break
if x==0 and y==0:
    print(t)
else:
    print(-1)