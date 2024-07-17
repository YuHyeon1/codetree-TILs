a = int(input())
two = 0
three = 0
twelve = 0
for i in range(1,a+1):
    if i%12==0:
        twelve+=1
    elif i%3==0:
        three+=1
    elif i%2==0:
        two+=1
print(two,three,twelve)