a,b,c = map(int,input().split())
min = (a-11)*1440+b*60+c-671
if min>=0:
    print(min)
else:
    print(-1)