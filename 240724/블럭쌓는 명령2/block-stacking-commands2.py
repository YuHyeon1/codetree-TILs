a,b = map(int,input().split())
arr = [0]*(a+1)
for i in range(b):
    inp = list(map(int,input().split()))
    for j in range(inp[0],inp[1]+1):
        arr[j]+=1
max = 0
for i in range (len(arr)):
    if max<arr[i]:
        max= arr[i]
print(max)