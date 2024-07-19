arr = [0]*7
a = list(map(int,input().split()))
for i in range (10):
    k = a[i]
    arr[k] +=1
for i in range (1,7):
    print(f"{i} - {arr[i]}")