cnt = 0
a = int(input())
while True:
    if a>=1000:
        print(cnt)
        break
    elif a%2==0:
        a = a*3+1
        cnt+=1
    else:
        a = a*2+2
        cnt+=1