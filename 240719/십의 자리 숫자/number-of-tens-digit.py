arr = [0]*10
a = list(map(int,input().split()))
for i in range(len(a)):
    if a[i]==0:
        for j in range(len(a)-i):
            a.pop()
    break
for i in range(len(a)):
    arr[a[i]//10]+=1
for i in range(1,10):
    print(f"{i} - {arr[i]}")