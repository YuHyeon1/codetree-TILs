cnt=0
a = int(input())
for i in range(0,a):
    arr = list(map(int,input().split()))
    if sum(arr)/4>=60:
        print("pass")
        cnt+=1
    else:
        print("fail")
print(cnt)