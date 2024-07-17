plus = 0
a = int(input())
for i in range(1,a):
    if a%i==0:
        plus+=i
if plus == a:
    print("P")
else:
    print("N")