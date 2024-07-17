plus = 0
a,b = map(int,input().split())
if a>b:
    for i in range(b,a+1):
        if i%5==0:
            plus+=i
else:
    for i in range(a,b+1):
        if i%5==0:
            plus+=i
print(plus)