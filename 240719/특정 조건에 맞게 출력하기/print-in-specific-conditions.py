arr = list(map(int,input().split()))
for i in range (len(arr)-1,-1,-1):
    if arr[i]==0:
        for j in range(0,len(arr)-i):
            arr.pop()
        break
for i in range(0,len(arr)):
    if arr[i]%2==0:
        print(arr[i]/2,end=" ")
    else:
        print(arr[i]+3,end=" ")