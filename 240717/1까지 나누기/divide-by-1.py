prod = 1
n = int(input())
for i in range(1,n+10):
    prod *= i
    if prod>n:
        print(i)
        break