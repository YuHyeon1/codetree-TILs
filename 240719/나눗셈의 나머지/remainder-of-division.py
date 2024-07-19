val = 0
cnt = [0]*10
a,b = map(int,input().split())
while a>=1:
    cnt[a%b] +=1
    a = a//b
for i in range(10):
    val+=cnt[i]**2
print(val)