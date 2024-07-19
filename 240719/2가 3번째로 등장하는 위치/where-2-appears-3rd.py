cnt = 0
a = int(input())
arr = list(map(int,input().split()))
for i in range (a):
    if cnt==3:
        print(i)
        break
    if arr[i] == 2:
        cnt+=1