a,b = input().split()
if a=='A':
    for i in range(1,int(b)+1):
        print(i,end=" ")
elif a=='D':
    for i in range(int(b),0,-1):
        print(i,end=" ")