prod = 1
n = int(input())
for i in range(1,11):
    if prod*i>=n:
        print(i)
        break
    prod *=i