n = int(input())
tile = ["A"]*200001
cnt = 0
for i in range(n):
    a, b = input().split()
    if b == "R":
        for j in range(int(a)):
            tile[cnt+j+100000] = "B"
        cnt += int(a) -1
    else:
        for j in range(int(a)):
            tile[cnt-j+100000] = "W"
        cnt -= int(a) +1
black = 0
white = 0
for i in range (200001):
    if tile[i] == "B":
        black +=1
    elif tile[i] == "W":
        white +=1

print(white, black)