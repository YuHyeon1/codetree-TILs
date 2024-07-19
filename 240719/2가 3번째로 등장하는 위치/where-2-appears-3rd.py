cnt = 0
a = int(input())
arr = list(map(int,input().split()))
for i in range (a):
    if arr[i] == 2:
        cnt+=1
    if cnt==3:
        print(i+1)
        break