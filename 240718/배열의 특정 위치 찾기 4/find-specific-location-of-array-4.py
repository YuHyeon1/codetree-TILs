cnt=0
max=0
a = list(map(int,input().split()))
for i in range (0,len(a)):
    if a[i]==0:
        for j in range (0,len(a)-i):
            a.pop()
        break
for i in range(0,len(a)):
    if a[i]%2==0:
        max +=a[i]
        cnt+=1
print(cnt,max)