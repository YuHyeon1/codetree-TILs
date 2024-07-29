dx, dy = [1,0,-1,0],[0,-1,0,1]
x, y = 0, 0
n = int(input())
for i in range(n):
    a, b = input().split()
    if a == "N":
        a = 3
    elif a == "E":
        a = 0
    elif a =="S":
        a = 1
    elif a=="W":
        a = 2
    for j in range(int(b)):
        x += dx[a]
        y += dy[a]
print(x, y)