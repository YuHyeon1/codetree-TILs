n,s = map(int,input().split())
arr = list(map(int,input().split()))
cnt = sum(arr)
for i in range(n):
    for j in range(i+1,n):
        a=sum(arr)-arr[i]-arr[j]-s
        if abs(a)<cnt:
            cnt = abs(a)
print(cnt)