max=0
a = list(map(int,input().split()))
for i in range (0,len(a)):
    if a[i]==0:
        for j in range(0,len(a)-i):
            a.pop()
        break
print(sum(a),f"{sum(a)/len(a):.1f}")