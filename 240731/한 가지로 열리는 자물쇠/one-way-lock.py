n = int(input())
arr = list(map(int,input().split()))
cnt = n**3
a = []
for elem in arr:
    a.append(n-(elem+2))
aw = 1
for elem in a:
    aw *= elem
print(cnt-aw)