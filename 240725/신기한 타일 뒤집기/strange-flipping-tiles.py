n = int(input())
tile = ["A"]*1000
cnt = 0
for i in range(n):
    a, b = input().split()
    if b == "R":
        for j in range(int(a)):
            tile[cnt+j] = "B"
        cnt += int(a)-1
    else:
        for j in range(int(a)):
            tile[cnt-j] = "W"
        cnt -= int(a)+1
black = 0
white = 0
for i in range (1000):
    if tile[i] == "B":
        black+=1
    elif tile[i] == "W":
        white +=1
print(white, black)