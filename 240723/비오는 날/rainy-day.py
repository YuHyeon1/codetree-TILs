class Date:
    def __init__(a,y,m,d,day,weat):
        a.y = int(y)
        a.m = int(m)
        a.d = int(d)
        a.day = day
        a.weat = weat
a = int(input())
infor = []
for i in range(a):
    arr = input().split()
    abc = arr[0].split("-")
    date = Date(abc[0],abc[1],abc[2],arr[1],arr[2])
    if arr[2] == "Rain":
        infor.append(date)
infor.sort(key = lambda b:(b.y,b.m,b.d))
print(f"{infor[0].y}-{infor[0].m:02}-{infor[0].d:02} {infor[0].day} {infor[0].weat}")