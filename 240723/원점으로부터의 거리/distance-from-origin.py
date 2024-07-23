class Dot:
    def __init__ (a,x,y,n):
        a.x = int(x)
        a.y = int(y)
        a.n = int(n)
dots = []
a = int(input())
for i in range(a):
    arr = input().split()
    dot = Dot(int(arr[0]),int(arr[1]),i+1)
    dots.append(dot)
dots.sort(key = lambda b:(abs(b.x)+abs(b.y),b.n))
for i in range (a):
    print(dots[i].n)