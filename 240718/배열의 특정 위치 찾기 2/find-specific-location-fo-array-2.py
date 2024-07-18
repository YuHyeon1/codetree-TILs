a=0
b=0
arr = list(map(int,input().split()))
for i in range (0,len(arr),2):
    a+=arr[i]
for i in range(1,len(arr),2):
    b+=arr[i]
if a>b:
    print(a-b)
else:
    print(b-a)