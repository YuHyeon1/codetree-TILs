a = list(map(int,input().split()))
cnt=0
max=0
while True:
    if a[cnt]<250:
        max +=a[cnt]
        cnt+=1
    else:
        break
print(max,f"{max/cnt:.1f}")