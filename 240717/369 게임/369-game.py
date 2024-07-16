a = int(input())
for i in range(1,a+1):
    k = i%10
    r = i/10
    if k%3==0:
        print(0,end=" ")
    elif r%3==0:
        print(0,end=" ")
    else:
        print(i,end=" ")