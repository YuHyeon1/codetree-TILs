n,k = map(int,input().split())
arr = [0]*10001
cnt = 0
for i in range (n):
    a, b = input().split()
    if b == 'G':
        arr[int(a)] = 1
    else:
        arr[int(a)] = 2
for i in range(10001-k):
    x = 0
    for j in range(i,i+k+1):
        x += arr[j]
    if cnt<x:
        cnt = x
print(cnt)