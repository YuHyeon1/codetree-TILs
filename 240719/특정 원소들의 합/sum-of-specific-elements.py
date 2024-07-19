cnt = 0
for i in range (4):
    a = list(map(int,input().split()))
    for j in range(i+1):
        cnt+= a[j]
print(cnt)