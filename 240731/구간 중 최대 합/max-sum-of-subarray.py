a,b = map(int,input().split())
arr = list(map(int,input().split()))
sumarr = []
for i in range(a-b+1):
    k=0
    for j in range(i,i+b):
        k+=arr[j]
    sumarr.append(k)
print(max(sumarr))