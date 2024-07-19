a = int(input())
arr = [1,a]
for i in range (100):
    arr.append(arr[i]+arr[i+1])
    if arr[i+2]>100:
        break
for i in range (len(arr)):
    print(arr[i],end=" ")