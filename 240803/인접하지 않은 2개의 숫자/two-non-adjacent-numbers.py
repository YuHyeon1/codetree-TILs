n = int(input())
mx = 0
arr = list(map(int,input().split()))
for i in range(n):
    for j in range(i+2,n):
        a = arr[i]+arr[j]
        if mx<a:
            mx = a
print(mx)