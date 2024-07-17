cnt=0
a = list(map(int,input().split()))
b = list(map(int,input().split()))
for i in range(len(b)):
    if b[i]==a[1]:
        cnt+=1
print(cnt)