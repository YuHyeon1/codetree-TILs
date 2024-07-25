num = int(input())
arr = [0]*201
for i in range(num):
    a,b = map(int,input().split())
    for j in range(a,b):
        arr[j+100]+=1
mx = 1
for i in range (len(arr)):
    if mx<arr[i]:
        mx = arr[i]
print(mx)