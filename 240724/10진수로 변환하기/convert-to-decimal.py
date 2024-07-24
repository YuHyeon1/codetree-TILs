a = list(map(int,input()))
a.reverse()
cnt = 0
r = 1
for i in range(len(a)):
    cnt += r*a[i]
    r*=2
print(cnt)