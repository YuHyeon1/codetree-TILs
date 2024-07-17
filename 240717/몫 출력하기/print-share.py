cnt = 0
while True:
    a = int(input())
    if a%2==0:
        cnt+=1
        print(int(a/2))
    if cnt==3:
        break