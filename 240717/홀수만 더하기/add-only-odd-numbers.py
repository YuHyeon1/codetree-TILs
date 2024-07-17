cnt = 0
a = int(input())
for i in range(0,a):
    score = int(input())
    if score%3==0:
        if score%2!=0:
            cnt += score
print(cnt)