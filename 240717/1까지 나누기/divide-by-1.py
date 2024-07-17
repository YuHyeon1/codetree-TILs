prod = 1
n = int(input())
for i in range(1,n):
    if prod >= n:
        print(i-1)
        break
    prod *= i