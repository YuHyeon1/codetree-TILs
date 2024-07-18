cnt = 0
arr = list(map(int,input().split()))
for i in range(0,len(arr)):
    if arr[i]==0:
        break
    cnt+=1
for i in range(cnt-1,-1,-1):
    print(arr[i],end=" ")