a = list(map(int,input().split()))
for i in range(0,10):
    if a[i]%3==0:
        print(a[i-1])
        break