cnt = 0
plus = 0
for i in range(0,10):
    a = int(input())
    if a>=0 and a<=200:
        plus+=a
        cnt+=1
print(plus,f"{plus/cnt:.1f}")