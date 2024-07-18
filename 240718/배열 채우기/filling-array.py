a = list(map(int,input().split()))
if a[len(a)-1] == 0:
    for i in range (0,len(a)-1):
        print(a[len(a)-2-i],end=" ")
else:
    for i in range(0,len(a)-1):
        print(a[len(a)-2]-i,end=" ")