binary = []
n = int(input())
while (n>0):
    binary.append(n%2)
    n = n//2
binary.reverse()
for i in range(len(binary)):
    print(binary[i],end="")