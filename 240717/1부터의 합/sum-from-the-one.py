cnt = 0
a = int(input())
for i in range(1,a+1):
    if cnt+i>=a:
        print(i)
        break
    cnt +=i