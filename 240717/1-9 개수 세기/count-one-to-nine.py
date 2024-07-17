a = int(input())
arr = list(map(int,input().split()))
score = [0]*10
for i in range(0,a):
    score[arr[i]]+=1
for i in range(1,10):
    print(score[i])