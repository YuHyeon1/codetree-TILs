a = list(map(int,input().split()))
cnt=0
max=0
i=0
while True:
    if i==10:
        break
    if a[i]<250:
        max +=a[i]
        cnt+=1
        i+=1
    else:
        break
print(max,f"{max/cnt:.1f}")