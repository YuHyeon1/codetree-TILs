dx, dy = [0,1,0,-1],[1,0,-1,0]
a = int(input())
cnt = 0
arr = []
acn = 0
for i in range(a):
    line = list(map(int,input().split()))
    arr.append(line)
for i in range (a):
    for j in range(a):
        for k in range(4):
            x = j+dx[k]
            y = i+dy[k]
            if x<0 or y<0:
                continue
            elif x>=a or y>=a:
                continue
            else:
                if arr[x][y] == 1:
                    cnt+=1
        if cnt >= 3:
            acn +=1
        cnt = 0
print(acn)