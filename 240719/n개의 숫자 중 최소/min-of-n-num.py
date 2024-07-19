max = 0
min = 0
a = int(input())
arr = list(map(int,input().split()))
for i in range (a):
    if max<arr[i]:
        max=arr[i]
min = max
max = 0
for i in range (a):
    if min>arr[i]:
        min=arr[i]
for i in range (a):
    if min==arr[i]:
        max+=1
print(min,max)