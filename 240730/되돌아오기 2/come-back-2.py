dx,dy=[1,0,-1,0],[0,-1,0,1]
a = list(input())
x,y,t=0,0,0
drct = 0
for elem in a:
    if elem=='L':
        if drct==0:
            drct=3
        else:
            drct-=1
    elif elem=='R':
        if drct==3:
            drct=0
        else:
            drct+=1
    else:
        x+=dx[drct]
        y+=dy[drct]
    t+=1
    if x==0 and y==0:
        break
if x==0 and y==0:
    print(t)
else:
    print(-1)