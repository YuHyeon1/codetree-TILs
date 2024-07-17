cnt = 1
a,b = map(int,input().split())
for i in range(0,a):
    for j in range(0,b):
        print(cnt,end=" ")
        cnt+=1
    print()