n,s = map(int,input().split())
arr = list(map(int,input().split()))
cnt = s
for i in range(n):
    for j in range(i+1,n):
        a=sum(arr)-arr[i]-arr[j]-s
        if cnt>abs(a):
            cnt = abs(a)
print(cnt)