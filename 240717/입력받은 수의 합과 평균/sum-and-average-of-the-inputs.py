a = int(input())
plus = 0
cnt = 0
for i in range(0,a):
    x = int(input())
    plus+=x
    cnt+=1
print(plus,f"{plus/cnt:.1f}")