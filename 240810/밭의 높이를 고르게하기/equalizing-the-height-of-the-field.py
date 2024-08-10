n, h, t = map(int,input().split())
arr = list(map(int,input().split()))
mn = float('inf')
for i in range (n-t):
    cnt = 0
    for j in range (i,i+t):
        cnt+=abs(h-arr[j])
    if cnt < mn:
        mn = cnt
print(mn)