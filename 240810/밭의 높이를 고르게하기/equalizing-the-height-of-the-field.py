n, h, t = map(int,input().split())
arr = list(map(int,input().split()))
mn = sum(arr)
for i in range (n-t+1):
    cnt = 0
    for j in range (i,i+t):
        cnt+=abs(h-arr[j])
    if cnt < mn:
        mn = cnt
print(mn)