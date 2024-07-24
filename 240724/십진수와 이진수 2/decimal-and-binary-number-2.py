a = list(map(int,input()))
a.reverse()
cnt = 0
r = 1
for i in range(len(a)):
    cnt += r*a[i]
    r*=2
cnt = cnt*17
arr = []
while cnt>0:
    arr.append(cnt%2)
    cnt = cnt//2
arr.reverse()
for i in range(len(arr)):
    print(arr[i],end="")