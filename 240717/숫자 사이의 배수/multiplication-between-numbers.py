cnt = 0
plus = 0
a,b = map(int,input().split())
for i in range(a,b+1):
    if i%5==0:
        plus +=i
        cnt+=1
    elif i%7==0:
        plus +=i
        cnt+=1
print(plus,f"{plus/cnt:.1f}")