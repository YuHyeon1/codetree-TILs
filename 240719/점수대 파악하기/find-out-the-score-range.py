cnt = [0]*11
arr = list(map(int,input().split()))
for i in range(len(arr)):
    if arr[i]==0:
        for j in range(len(arr)-i):
            arr.pop()
        break
for i in range(len(arr)):
    cnt[arr[i]//10] +=1
for i in range(10,0,-1):
    print(f"{i*10} - {cnt[i]}")