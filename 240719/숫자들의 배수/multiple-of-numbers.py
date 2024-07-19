a = int(input())
cnt = 0
tm = 1
while cnt<2:
    if a*tm%5==0:
        cnt+=1
    print(a*tm,end=" ")
    tm+=1