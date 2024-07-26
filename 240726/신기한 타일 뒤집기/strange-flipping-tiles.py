tile = ["A"]*200001
a = int(input())
cnt = 100001
for i in range(a):
    arr = input().split()
    if arr[1] == "R":
        for j in range(cnt,cnt+int(arr[0])):
            tile[j] = "B"
        cnt += int(arr[0])-1
    else:
        for j in range(cnt,cnt-int(arr[0]),-1):
            tile[j] = "W"
        cnt -= int(arr[0])+1
w = 0
b = 0
for i in range (200001):
    if tile[i] == "B":
        b+=1
    elif tile[i] == "W":
        w+=1
print(w,b)