arr = list(map(int,input().split()))
max = 0
av = 0
for i in range (1,10,2):
    max += arr[i]
for i in range (2,10,3):
    av += arr[i]
print(max,f"{av/3:.1f}")