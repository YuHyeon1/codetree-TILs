n =int(input())
a = list(map(int,input().split()))
arr = [0]*n
for i in range (n):
    for j in range(n):
        arr[i]+=a[j]*abs(i-j)
print(min(arr))