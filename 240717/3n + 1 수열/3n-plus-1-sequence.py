cnt = 0
a = int(input())
while True:
    if a==1:
        print(cnt)
        break
    elif a%2==0:
        a=a/2
        cnt+=1
    else:
        a=3*a+1
        cnt+=1