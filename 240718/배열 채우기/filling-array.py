a = list(map(int,input().split()))
if a[len(a)-1] == 0:
    for i in range (len(a)-2,-1,-1):
        print(a[i],end=" ")
else:
    for i in range (len(a)-1,-1,-1):
        print(a[i],end=" ")