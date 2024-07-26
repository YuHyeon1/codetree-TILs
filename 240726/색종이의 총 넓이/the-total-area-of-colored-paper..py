paper = [[0]*201 for _ in range (201)]
n = int(input())
for i in range(n):
    a, b = map(int,input().split())
    for j in range(a,a+8):
        for k in range(b,b+8):
            paper[j+101][k+101] = 1
cnt = 0
for i in range(201):
    for j in range(201):
        if paper[i][j] == 1:
            cnt+=1
print(cnt)