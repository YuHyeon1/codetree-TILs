a,b,c = map(int,input().split())
if a>=11 and b>=11 and c>=11:
    print((a-11)*1440+b*60+c-671)
else:
    print(-1)