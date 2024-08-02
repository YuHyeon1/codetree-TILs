n = int(input())
arr = list(map(int,input().split()))
cnt = n
for i in range(2,n+1):
    for j in range(n-i):
        a = 0
        b = 0
        for k in range(j,j+i):
            a+=arr[k]
        b = a/i
        for k in range(j,j+i):
            if b == arr[k]:
                cnt+=1
print(cnt)