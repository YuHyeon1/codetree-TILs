n, t = map(int,input().split())
r, c, drct = input().split()
arr = [[0]*n for _ in range(n)]
dx, dy = [1,0,-1,0],[0,1,0,-1]
r = int(r)-1
c = int(c)-1
d = {
    'U' : 3,
    'D' : 1,
    'R' : 0,
    'L' : 2
}
dd = d[drct]
for i in range (t):
    a = r+dx[dd]
    b = c+dy[dd]
    if 0<a<n+1 and 0<b<n+1:
        r = a
        c = b
    else:
        dd = (dd+2)%4
print(c,r)