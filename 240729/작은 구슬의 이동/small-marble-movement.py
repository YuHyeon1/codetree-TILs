d = {}
d = {
    'R' : 0,
    'D' : 1,
    'L' : 2,
    'U' : 3
}
dx, dy = [1,0,-1,0],[0,-1,0,1]
n, t = map(int,input().split())
arr = [[0]*n for _ in range(n)]
r, c, drct = input().split()
r = int(r)-1
c = int(c) -1
dd = d[drct]
cnt = 0
for i in range(t):
    if cnt%2 == 1:
        dd = (dd+2)%4
        cnt = 0
    arr[r][c] = 0
    a = r + dx[dd]
    b = c + dy[dd]
    if a<0 or b<0:
        cnt+=1
    elif a>=n or b>=n:
        cnt+=1
    else:
        r = a
        c = b
        arr[r][c] = 1
print(c, r)