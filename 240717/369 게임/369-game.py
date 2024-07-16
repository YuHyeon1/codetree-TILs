a = int(input())
for i in range(1,a+1):
    k = i%10
    if i%3==0:
        print(0,end=" ")
    elif k%3==0:
        print(0,end=" ")
    elif i/10%3==0:
        print(0,end=" ")
    else:
        print(i,end=" ")