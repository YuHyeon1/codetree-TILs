a,b = map(int,input().split())
timea = [0]
timeb = [0]
cnta = 0
cntb = 0
for i in range (a):
    drct, move = input().split()
    if drct == 'R':
        for j in range(int(move)):
            cnta+=1
            timea.append(cnta)
    elif drct == 'L':
        for j in range(int(move)):
            cnta-=1
            timea.append(cnta)
for i in range (b):
    drct, move = input().split()
    if drct == 'R':
        for j in range(int(move)):
            cntb+=1
            timeb.append(cntb)
    elif drct == 'L':
        for j in range(int(move)):
            cntb-=1
            timeb.append(cntb)
for i in range (1,min(len(timea),len(timeb))):
    if timea[i]==timeb[i]:
        print(i)
        break
    if i+1 == min(len(timea),len(timeb)):
        if timea[i]!=timeb[i]:
            print(-1)