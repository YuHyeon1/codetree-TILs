three = 0
five = 0
for i in range(0,10):
    a = int(input())
    if a%3==0:
        three+=1
    if a%5==0:
        five+=1
print(three,five)