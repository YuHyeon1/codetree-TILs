m1,d1,m2,d2 = map(int,input().split())
month = [0,31,28,31,30,31,30,31,31,30,31,30,31]
first = 0
second = 0
for i in range(1,m1):
    first += month[i]
for i in range(1,m2):
    second += month[i]
print(second+d2-first-d1+1)