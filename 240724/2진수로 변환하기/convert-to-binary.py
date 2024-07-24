binary = []
n = int(input())
if n==0:
    print(0)
while (n>0):
    binary.append(n%2)
    n = n//2
binary.reverse()
for i in range(len(binary)):
    print(binary[i],end="")