n = int(input())
arr = []
cnt=0
mx = 0
for i in range(n):
    arr.append(input().split())
for i in range(n):
    for j in range(n-2):
        x = int(arr[i][j])+int(arr[i][j+1])+int(arr[i][j+2])
        if x>mx:
            mx = x
print(mx)