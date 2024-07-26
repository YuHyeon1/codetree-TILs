paper= [["W"]*201 for _ in range(201)]
blue = 0
a = int(input())
for i in range(a):
    x1,y1,x2,y2 = map(int,input().split())
    if i%2==0:
        for j in range(x1,x2):
            for k in range(y1,y2):
                paper[j+101][k+101] = "R"
    else:
        for j in range(x1,x2):
            for k in range(y1,y2):
                paper[j+101][k+101] = "B"
for i in range (201):
    for j in range (201):
        if paper[i][j] == "B":
            blue +=1
print(blue)