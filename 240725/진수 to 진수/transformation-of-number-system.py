a, b = map(int,input().split())
n = list(map(int,input()))
cnt = 0
r = 1
n.reverse()
for i in range (len(n)):
    cnt += r*n[i]
    r*=a
arr = []
while cnt>0:
    arr.append(cnt%b)
    cnt = cnt//b
arr.reverse()
for i in range (len(arr)):
    print(arr[i],end="")