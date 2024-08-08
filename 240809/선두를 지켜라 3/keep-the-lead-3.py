a,b = map(int,input().split())
timea = [0]
timeb = [0]
cnta = 0
cntb = 0
cnt = 0
d = 0
for i in range (a):
    v,t = map(int,input().split())
    for j in range(t):
        cnta+=v
        timea.append(cnta)
for i in range(b):
    v,t = map(int,input().split())
    for j in range(t):
        cntb+=v
        timeb.append(cntb)
for i in range(1,len(timea)):
    if timea[i] == timeb[i]:
        c = 0
    elif timea[i] > timeb[i]:
        c = 1
    elif timea[i] < timeb[i]:
        c = 2
    if d != c:
        cnt+=1
    d = c
print(cnt)