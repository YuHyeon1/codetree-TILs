dx, dy = [1,0,-1,0],[0,-1,0,1]
x,y=0,0
dct = 3
a= list(input())
for elem in a:
    if elem == "R":
        if dct == 3:
            dct = 0
        else:
            dct+=1
    elif elem == "L":
        if dct == 0:
            dct = 3
        else:
            dct-=1
    else:
        x += dx[dct]
        y += dy[dct]
print(x, y)