month,day,month2,day2=tuple(map(int,input().split()))
elapsed_days=0

num_of_days = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

while True:
    if month==12 and day==21:
        break
    elapsed_days+=1
    day+=1

    if day>num_of_days[month]:
        month+=1
        day=1
print(elapsed_days+1)