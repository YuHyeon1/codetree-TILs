n = int(input())
a = list(map(float,input().split()))
print(f"{sum(a)/n:.1f}")
if sum(a)/n>=4.0:
    print("Perfect")
elif sum(a)/n>=3.0:
    print("Good")
else:
    print("Poor")